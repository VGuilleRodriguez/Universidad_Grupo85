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

    private InscripcionData inData = new InscripcionData();
    //private AlumnoData alumData;

    private static void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int r, int c) {
            return false;
        }
    };

    public FormularioDeInscripcionIF() {
        initComponents();
        armarCabecera();
        cargarComboAlumno();
        grupoBotones();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
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
        jSeparator1 = new javax.swing.JSeparator();

        setTitle("Formulario de Inscripcion");

        jPanel1.setBackground(new java.awt.Color(212, 230, 241));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione un Alumno:");

        jcbSelectAlum.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcbSelectAlum.setToolTipText("Seleccione un alumno");
        jcbSelectAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSelectAlumActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setText("Listado de Materias");

        jrbMateriasInscriptas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jrbMateriasInscriptas.setText("Materias Inscriptas");
        jrbMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateriasInscriptasActionPerformed(evt);
            }
        });

        jrbMateriasNoInscriptas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jrbMateriasNoInscriptas.setText("Materias NO inscriptas");
        jrbMateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateriasNoInscriptasActionPerformed(evt);
            }
        });

        jtTablaInscripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtTablaInscripcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jtTablaInscripcion.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtTablaInscripcion);

        jbInscribir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbInscribir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad_equipo85/imagenes/user-plus.png"))); // NOI18N
        jbInscribir.setText("Inscribir");
        jbInscribir.setEnabled(false);
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnularInscripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbAnularInscripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad_equipo85/imagenes/user-cancel.png"))); // NOI18N
        jbAnularInscripcion.setText("Anular Inscripcion");
        jbAnularInscripcion.setEnabled(false);
        jbAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularInscripcionActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad_equipo85/imagenes/x.png"))); // NOI18N
        jbSalir.setText("Cerrar");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jbInscribir)
                                .addGap(36, 36, 36)
                                .addComponent(jbAnularInscripcion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalir)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(jcbSelectAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbMateriasInscriptas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrbMateriasNoInscriptas))
                            .addComponent(jScrollPane1)
                            .addComponent(jSeparator1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel3)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbSelectAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbMateriasNoInscriptas)
                    .addComponent(jrbMateriasInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAnularInscripcion)
                    .addComponent(jbSalir)
                    .addComponent(jbInscribir))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbSelectAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSelectAlumActionPerformed
        refrescarTabla();
    }//GEN-LAST:event_jcbSelectAlumActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed

        int row = jtTablaInscripcion.getSelectedRow();
        if (row != -1 && jrbMateriasNoInscriptas.isSelected()) {
            int idMateria = (int) jtTablaInscripcion.getValueAt(row, 0);

            MateriaData md = new MateriaData();
            Materia materia = md.buscarMateria(idMateria);
            Alumno alumno = (Alumno) jcbSelectAlum.getSelectedItem();
            Inscripcion inscripcion = new Inscripcion(alumno, materia, 0.0);
            inData.guardarInscripcion(inscripcion);
            refrescarTabla();
        } else {
            mensaje("Alumno ya inscripto");
        }
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jrbMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateriasInscriptasActionPerformed
        refrescarTabla();
        jbAnularInscripcion.setEnabled(true);
        jbInscribir.setEnabled(false);
    }//GEN-LAST:event_jrbMateriasInscriptasActionPerformed

    private void jrbMateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateriasNoInscriptasActionPerformed
        refrescarTabla();
        jbInscribir.setEnabled(true);
        jbAnularInscripcion.setEnabled(false);
    }//GEN-LAST:event_jrbMateriasNoInscriptasActionPerformed

    private void jbAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularInscripcionActionPerformed
        int row = jtTablaInscripcion.getSelectedRow();
        int resultado = JOptionPane.showConfirmDialog(this, "¿Seguro que desea anular la inscripcion?");
        if (resultado == 0) {
            if (row != -1 && jrbMateriasInscriptas.isSelected()) {
                int idMateria = (int) jtTablaInscripcion.getValueAt(row, 0);

                MateriaData md = new MateriaData();
                Materia materia = md.buscarMateria(idMateria);
                Alumno alumno = (Alumno) jcbSelectAlum.getSelectedItem();
                inData.borrarInscripcionMateriaAlumno(alumno.getIdAlumno(), idMateria);
                refrescarTabla();
            } else {
                mensaje("No puede desincribir el alumno");
            }
    }//GEN-LAST:event_jbAnularInscripcionActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
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
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {   //Comienza desde la ultima fila y se mueve hacia arriba hasta la primera fila
            modelo.removeRow(i);                                //Devuelve el n° de fila de la tabla modelo, se ejecuta mientras i>=0
                                                                //En cada iteracion se elimina la fila en la posicion i del mod tabla
        }
    }

    private void cargarComboAlumno() {
        AlumnoData alumnodata = new AlumnoData();
        for (Alumno alumno : alumnodata.listarAlumnos()) { //En cada iteración del bucle, se obtiene un objeto Alumno 
            jcbSelectAlum.addItem(alumno);                 //y se agrega al comboBox 
        }
    }

    private void grupoBotones() { //Agrupa dos botones
        buttonGroup1.add(jrbMateriasInscriptas);
        buttonGroup1.add(jrbMateriasNoInscriptas);
    }

    private void refrescarTabla() {
        limpiarFilas();

        InscripcionData inscripciondata = new InscripcionData();

        Alumno alumno = (Alumno) jcbSelectAlum.getSelectedItem(); //casteo (Alumno)es para convertir el elemento seleccionado en un object "Alumno"

        Set<Materia> materias = new HashSet<>();
        if (jrbMateriasInscriptas.isSelected()) {
            materias = inscripciondata.obtenerMateriaCursadas(alumno.getIdAlumno());
        } else if (jrbMateriasNoInscriptas.isSelected()) {
            materias = inscripciondata.obtenerMateriasNoCursadas(alumno.getIdAlumno());
        }
        for (Materia materia : materias) {
            modelo.addRow(new Object[]{
                materia.getIdMateria(),
                materia.getNombre(),
                materia.getAño()
            });
        }

    }

}
