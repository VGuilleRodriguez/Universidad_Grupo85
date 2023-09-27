
package universidad_equipo85.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidad_equipo85.AccesoADatos.AlumnoData;
import universidad_equipo85.AccesoADatos.InscripcionData;
import universidad_equipo85.Entidades.Alumno;
import universidad_equipo85.Entidades.Inscripcion;


public class CargaDeNotasIF extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            return false;
        }
    };
    private static void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public CargaDeNotasIF() {
        initComponents();
        armarCabecera();
        cargarComboAlumno();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbSelectAlum = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaNotas = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setTitle("Carga de Notas");

        jPanel1.setBackground(new java.awt.Color(212, 230, 241));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione un Alumno:");

        jcbSelectAlum.setBackground(new java.awt.Color(127, 179, 213));
        jcbSelectAlum.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcbSelectAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSelectAlumActionPerformed(evt);
            }
        });

        jtTablaNotas.setBackground(new java.awt.Color(127, 179, 213));
        jtTablaNotas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtTablaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtTablaNotas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtTablaNotas);

        jbGuardar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad_equipo85/imagenes/text-plus.png"))); // NOI18N
        jbGuardar.setText("Agregar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
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
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(jcbSelectAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(119, 119, 119)
                                            .addComponent(jLabel1))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)
                        .addGap(64, 64, 64))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbSelectAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbSelectAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSelectAlumActionPerformed
        refrescarTabla();
    }//GEN-LAST:event_jcbSelectAlumActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
     try{
        int row = jtTablaNotas.getSelectedRow();
        double nota = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese la nota para actualizar", "Actualizar nota", JOptionPane.WARNING_MESSAGE));
        if(row !=-1){
            if(nota >= 0 && nota <= 10){
            int idmateria = (int)jtTablaNotas.getValueAt(row, 0);
             Alumno alumno = (Alumno) jcbSelectAlum.getSelectedItem();
             InscripcionData inData = new InscripcionData();
             inData.actualizarNota(alumno.getIdAlumno(), idmateria, nota);
             refrescarTabla();
            } else {
            mensaje("Nota invalida");
            }
        }else{
            mensaje("Debe seleccionar una materia");
        }     
     }catch (NumberFormatException ex){
         mensaje("ERROR! La nota debe ser un numero");
     } catch (NullPointerException ex){
        
     }         
        
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
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
    
    private void refrescarTabla(){
    
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
    
    }
}
