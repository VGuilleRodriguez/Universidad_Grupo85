package universidad_equipo85.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidad_equipo85.Entidades.Alumno;
import universidad_equipo85.Entidades.Inscripcion;
import universidad_equipo85.Entidades.Materia;

/**
 *
 * @author Guillermo Rodriguez
 */
public class InscripcionData {

    private Connection con = null;

    private AlumnoData aluData;
    private MateriaData matData;

    public InscripcionData() {
        con = Conexion.getConexion();

    }

    private static void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void guardarInscripcion(Inscripcion insc) {

        try {
            String sql = "INSERT INTO inscripcion ( nota, idAlumno, idMateria) VALUES (?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                insc.setIdInscripcion(rs.getInt(1));
                mensaje("Inscripcion guardada con exito");
            }
            ps.close();

        } catch (SQLException ex) {
            mensaje("Error al acceder a la tabla inscripcion " + ex.getMessage());
        }

    }

    public List<Inscripcion> obtenerInscripcion() {

        List<Inscripcion> inscripciones = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inscripcion";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Inscripcion inscripcion;
            while (rs.next()) {
                inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setNota(rs.getDouble("nota"));
                inscripcion.setAlumno(aluData.buscarAlumno(rs.getInt("idAlumno")));
                inscripcion.setMateria(matData.buscarMateria(rs.getInt("idMateria")));
            }
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inscripciones;
    }


    public List<Inscripcion> obtenerInscripcionPorAlumno(int id) {

        List<Inscripcion> inscripciones = new ArrayList();
        try {
            String listar = "SELECT materia.idMateria, materia.nombre, nota "
        + "FROM inscripcion JOIN materia " 
        +"ON (materia.idMateria = inscripcion.idMateria) "                  
        + "WHERE idAlumno = ?";           
        PreparedStatement ps = con.prepareStatement(listar);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Inscripcion inscripcion = new Inscripcion();
            Materia materia = new Materia();
            materia.setNombre(rs.getString("materia.nombre"));
            materia.setIdMateria(rs.getInt("materia.idMateria"));
            inscripcion.setMateria(materia);
            inscripcion.setNota(rs.getDouble("nota"));
            inscripciones.add(inscripcion);
        } ps.close();
        
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a las tablas inscripcion y/o materia. " + ex.getMessage());
            }
            return inscripciones;
           }
        

    public Set<Materia> obtenerMateriaCursadas(int id) {
        Set<Materia> materias = new HashSet<>();
        try {
            String sql = "SELECT materia.idMateria, nombre, año "
                    + "FROM inscripcion JOIN materia "
                    + "ON (inscripcion.idMateria = materia.idMateria) "
                    + "WHERE inscripcion.idAlumno = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            mensaje("Error al obtener inscripcion " + ex.getMessage());
        }
        return materias;

    }

    public Set<Materia> obtenerMateriasNoCursadas(int id) {
        Set<Materia> materias = new HashSet<>();
        try {
            String listar = "SELECT idMateria, nombre, año FROM materia WHERE estado = 1"; 

            PreparedStatement ps = con.prepareStatement(listar);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materias.add(materia);
            }

            materias.removeAll(obtenerMateriaCursadas(id));

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a las tablas inscripcion y/o materia. " + ex.getMessage());
        }
        return materias;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        try {
            String borrado = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
            PreparedStatement ps = con.prepareStatement(borrado);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);

            int resultado = ps.executeUpdate();

            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "La inscripción se eliminó exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un problema al borrar la inscripción.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion. " + ex.getMessage());
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        try {
            String borrado = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
            PreparedStatement ps = con.prepareStatement(borrado);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);

            int resultado = ps.executeUpdate();

            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "La nota del alumno se modificó exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un problema al modificar la nota.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción. " + ex.getMessage());
        }
    }

    public List<Alumno> obtenerAlumnosPorMateria(int idMateria) {
        List<Alumno> alumnos = new ArrayList();
        try {
            String obtencion = "SELECT alumno.idAlumno, dni, apellido, nombre FROM alumno "
                    + "JOIN inscripcion ON (inscripcion.idAlumno = alumno.idAlumno) "
                    + "WHERE inscripcion.idMateria = ?";
            PreparedStatement ps = con.prepareStatement(obtencion);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumnos.add(alumno);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a las tablas alumno y/o inscripción. " + ex.getMessage());
        }
        return alumnos;
    }
}
