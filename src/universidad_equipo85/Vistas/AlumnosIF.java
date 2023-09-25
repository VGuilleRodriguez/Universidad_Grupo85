/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad_equipo85.Vistas;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import javax.swing.JOptionPane;
import universidad_equipo85.AccesoADatos.AlumnoData;
import universidad_equipo85.Entidades.Alumno;

/**
 *
 * @author Guillermo Rodriguez
 */
public class AlumnosIF extends javax.swing.JInternalFrame {

    public AlumnoData ad;

    public AlumnosIF() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtDocumento = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jbBuscar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jcboxEstado = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jbLimpiar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();

        setTitle("Alumnos");

        jPanel1.setBackground(new java.awt.Color(212, 230, 241));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Alumno");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Documento:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Estado:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento:");

        jtDocumento.setBackground(new java.awt.Color(127, 179, 213));
        jtDocumento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jtApellido.setBackground(new java.awt.Color(127, 179, 213));
        jtApellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jtNombre.setBackground(new java.awt.Color(127, 179, 213));
        jtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jdFecha.setBackground(new java.awt.Color(127, 179, 213));
        jdFecha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jbBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad_equipo85/imagenes/search.png"))); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad_equipo85/imagenes/trash.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad_equipo85/imagenes/pencil-minus.png"))); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
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

        jcboxEstado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcboxEstado.setText("INACTIVO");
        jcboxEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcboxEstadoItemStateChanged(evt);
            }
        });
        jcboxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxEstadoActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad_equipo85/imagenes/clear-formatting.png"))); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbNuevo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad_equipo85/imagenes/user-plus.png"))); // NOI18N
        jbNuevo.setText("Nuevo ");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("ID:");

        jtId.setEditable(false);
        jtId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtId.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(jbModificar)
                                .addGap(28, 28, 28)
                                .addComponent(jbLimpiar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7))
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcboxEstado)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                                .addComponent(jtNombre)
                                                .addComponent(jtDocumento)
                                                .addComponent(jtId))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbEliminar)
                            .addComponent(jbBuscar))
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir)
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbBuscar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcboxEstado))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir)
                    .addComponent(jbNuevo)
                    .addComponent(jbLimpiar))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed

        AlumnoData aluData = new AlumnoData();
        try {
            if (jtDocumento.getText().isEmpty() || jtApellido.getText().isEmpty() || jtNombre.getText().isEmpty() || jdFecha.getDate() == null) {
                JOptionPane.showMessageDialog(this, "No debe haber campos vacios");
            } else {
                Alumno alumno = new Alumno();
                alumno.setDni(Integer.parseInt(jtDocumento.getText()));
                alumno.setApellido(jtApellido.getText());
                alumno.setNombre(jtNombre.getText());
                alumno.setFechaNacimiento(jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                alumno.setEstado(jcboxEstado.isSelected());
                aluData.guardarAlumno(alumno);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El DNI deben ser numeros");

        }
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtId.setText("");
        jtDocumento.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jcboxEstado.setSelected(false);
        jdFecha.setDate(null);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jcboxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxEstadoActionPerformed

    }//GEN-LAST:event_jcboxEstadoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        try {
            Alumno alumno = new Alumno();
            alumno.setIdAlumno(Integer.parseInt(jtId.getText()));
            alumno.setDni(Integer.parseInt(jtDocumento.getText()));
            alumno.setApellido(jtApellido.getText());
            alumno.setNombre(jtNombre.getText());
            alumno.setFechaNacimiento(jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            alumno.setEstado(jcboxEstado.isSelected());
            AlumnoData alumnodata = new AlumnoData();
            alumnodata.modificarAlumno(alumno);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el DNI del alumno");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "No debe haber campos vacios");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        try {
            int dni = Integer.parseInt(jtDocumento.getText());
            int resultado = JOptionPane.showConfirmDialog(this, "¿Esta seguro que quieres eliminar el alumno?");
            if (resultado == 0) {
                AlumnoData x = new AlumnoData();
                Alumno alumno = x.buscarAlumnoPorDni(dni);
                jtId.setText(alumno.getIdAlumno() + "");
                jtApellido.setText(alumno.getApellido());
                jtNombre.setText(alumno.getNombre());
                if (alumno.isEstado() == true) {
                    jcboxEstado.setSelected(true);
                }
                jdFecha.setDate(Date.from(alumno.getFechaNacimiento().atStartOfDay().toInstant(ZoneOffset.UTC)));
                x.eliminarAlumno(dni);
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "El DNI es invalido o no existe.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el DNI del alumno.");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            int dni = Integer.parseInt(jtDocumento.getText());
            AlumnoData x = new AlumnoData();
            Alumno alumno = x.buscarAlumnoPorDni(dni);
            jtId.setText(alumno.getIdAlumno() + "");
            jtApellido.setText(alumno.getApellido());
            jtNombre.setText(alumno.getNombre());
            if (alumno.isEstado() == true) {
                jcboxEstado.setSelected(true);
            }
            jdFecha.setDate(Date.from(alumno.getFechaNacimiento().atStartOfDay().toInstant(ZoneOffset.UTC)));
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "El DNI es invalido o no existe.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el DNI del alumno.");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jcboxEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcboxEstadoItemStateChanged
        if (jcboxEstado.isSelected()) {
            jcboxEstado.setText("Activo");
        } else {
            jcboxEstado.setText("Inactivo");
        }

    }//GEN-LAST:event_jcboxEstadoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JCheckBox jcboxEstado;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDocumento;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
