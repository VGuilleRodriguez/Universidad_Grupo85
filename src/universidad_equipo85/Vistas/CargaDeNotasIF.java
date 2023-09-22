/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad_equipo85.Vistas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidad_equipo85.AccesoADatos.AlumnoData;
import universidad_equipo85.AccesoADatos.InscripcionData;
import universidad_equipo85.AccesoADatos.MateriaData;
import universidad_equipo85.Entidades.Alumno;
import universidad_equipo85.Entidades.Inscripcion;
import universidad_equipo85.Entidades.Materia;

/**
 *
 * @author Guillermo Rodriguez
 */
public class CargaDeNotasIF extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    public CargaDeNotasIF() {
        initComponents();
        armarCabecera();
        cargarComboAlumno();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbSelectAlum = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaNotas = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setTitle("Carga de Notas");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setText("Seleccione un Alumno:");

        jcbSelectAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSelectAlumActionPerformed(evt);
            }
        });

        jtTablaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jtTablaNotas);

        jbGuardar.setText("Agregar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jcbSelectAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbSelectAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbSelectAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSelectAlumActionPerformed
        limpiarFilas();
        InscripcionData inData = new InscripcionData();
        Alumno alumno = (Alumno) jcbSelectAlum.getSelectedItem();
        List<Inscripcion> lista = new ArrayList<>();
        lista = inData.obtenerInscripcionPorAlumno(alumno.getIdAlumno());

        
        for (Inscripcion insc : lista) {
            modelo.addRow(new Object[]{
                insc.getMateria().getIdMateria(),
                insc.getMateria().getNombre(),
                insc.getNota()
            });
        }
    }//GEN-LAST:event_jcbSelectAlumActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
     try{
        int row = jtTablaNotas.getSelectedRow();
        double nota = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese la nota para actualizar", "Actualizar nota", JOptionPane.WARNING_MESSAGE));
        if(row !=-1){
            if(nota > 0 && nota <= 10){
            int idmateria = (int)jtTablaNotas.getValueAt(row, 0);
             Alumno alumno = (Alumno) jcbSelectAlum.getSelectedItem();
             InscripcionData inData = new InscripcionData();
             inData.actualizarNota(alumno.getIdAlumno(), idmateria, nota);
            } else {
            JOptionPane.showMessageDialog(null, "Nota invalida");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una materia");
        }     
     }catch (NumberFormatException ex){
         JOptionPane.showMessageDialog(this, "ERROR! La nota debe ser un numero");
     } catch (NullPointerException ex){
        
     }         
        
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbSelectAlum;
    private javax.swing.JTable jtTablaNotas;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("NOTA");
        jtTablaNotas.setModel(modelo);
        
        
    }
    private void limpiarFilas() {
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargarComboAlumno() {
        AlumnoData alumnodata = new AlumnoData();
        for (Alumno alumno : alumnodata.listarAlumnos()) {
            jcbSelectAlum.addItem(alumno);
        }
    }
}
