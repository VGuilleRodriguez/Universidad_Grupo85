/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad_equipo85.Vistas;

import java.util.HashSet;
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
public class FormularioDeInscripcionIF extends javax.swing.JInternalFrame {

   private InscripcionData inData= new InscripcionData();
    private AlumnoData alumData;
    
    private static void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int r, int c){
            return false;
        }
    };
            

    public FormularioDeInscripcionIF() {
        initComponents();
        armarCabecera();
        cargarComboAlumno();
        grupoBotones();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbSelectAlum = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jrbMateriasInscriptas = new javax.swing.JRadioButton();
        jrbMateriasNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaInscripcion = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbAnularInscripcion = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setTitle("Formulario de Inscripcion");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setText("Seleccione un Alumno:");

        jcbSelectAlum.setToolTipText("Seleccione un alumno");
        jcbSelectAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSelectAlumActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Listado de Materias");

        jrbMateriasInscriptas.setText("Materias Inscriptas");
        jrbMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateriasInscriptasActionPerformed(evt);
            }
        });

        jrbMateriasNoInscriptas.setText("Materias NO inscriptas");
        jrbMateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateriasNoInscriptasActionPerformed(evt);
            }
        });

        jtTablaInscripcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jtTablaInscripcion);

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnularInscripcion.setText("Anular Inscripcion");
        jbAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularInscripcionActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jbInscribir)
                        .addGap(80, 80, 80)
                        .addComponent(jbAnularInscripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)
                        .addGap(36, 36, 36))))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jrbMateriasInscriptas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrbMateriasNoInscriptas)
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(126, 126, 126))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jcbSelectAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbSelectAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMateriasInscriptas)
                    .addComponent(jrbMateriasNoInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbAnularInscripcion)
                    .addComponent(jbSalir))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbSelectAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSelectAlumActionPerformed

    }//GEN-LAST:event_jcbSelectAlumActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        
        int row = jtTablaInscripcion.getSelectedRow();
        if(row !=-1 && jrbMateriasNoInscriptas.isSelected()){
            int idMateria = (int)jtTablaInscripcion.getValueAt(row, 0);
            
            MateriaData md = new MateriaData();
            Materia materia = md.buscarMateria(idMateria);
            Alumno alumno =(Alumno)jcbSelectAlum.getSelectedItem();
            Inscripcion inscripcion = new Inscripcion(alumno, materia, 0.0);
           inData.guardarInscripcion(inscripcion);
        }else{
            mensaje("No puede inscribir el alumno");
        }     

    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jrbMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateriasInscriptasActionPerformed
         limpiarFilas();

        InscripcionData inscripciondata = new InscripcionData();

        Alumno alumno = (Alumno) jcbSelectAlum.getSelectedItem();

        Set<Materia> materias = new HashSet<>();

        materias = inscripciondata.obtenerMateriaCursadas(alumno.getIdAlumno());
   
        for (Materia materia : materias) {
            modelo.addRow(new Object[]{
                materia.getIdMateria(),
                materia.getNombre(),
                materia.getAño()
            });
        }
    }//GEN-LAST:event_jrbMateriasInscriptasActionPerformed

    private void jrbMateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateriasNoInscriptasActionPerformed
      limpiarFilas();

        InscripcionData inscripciondata = new InscripcionData();

        Alumno alumno = (Alumno) jcbSelectAlum.getSelectedItem();

        Set<Materia> materias = new HashSet<>();

   
            materias = inscripciondata.obtenerMateriasNoCursadas(alumno.getIdAlumno());
        

        for (Materia materia : materias) {
            modelo.addRow(new Object[]{
                materia.getIdMateria(),
                materia.getNombre(),
                materia.getAño()
            });
        }
    }//GEN-LAST:event_jrbMateriasNoInscriptasActionPerformed

    private void jbAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularInscripcionActionPerformed
        int row = jtTablaInscripcion.getSelectedRow();
        if(row !=-1 && jrbMateriasInscriptas.isSelected()){
            int idMateria = (int)jtTablaInscripcion.getValueAt(row, 0);
            
            MateriaData md = new MateriaData();
            Materia materia = md.buscarMateria(idMateria);
            Alumno alumno =(Alumno)jcbSelectAlum.getSelectedItem();
           inData.borrarInscripcionMateriaAlumno(alumno.getIdAlumno(), idMateria);
        }else{
            mensaje("No puede desincribir el alumno");
        }     
    }//GEN-LAST:event_jbAnularInscripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnularInscripcion;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbSelectAlum;
    private javax.swing.JRadioButton jrbMateriasInscriptas;
    private javax.swing.JRadioButton jrbMateriasNoInscriptas;
    private javax.swing.JTable jtTablaInscripcion;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        jtTablaInscripcion.setModel(modelo);

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

    private void grupoBotones() {
        buttonGroup1.add(jrbMateriasInscriptas);
        buttonGroup1.add(jrbMateriasNoInscriptas);
    }

}
