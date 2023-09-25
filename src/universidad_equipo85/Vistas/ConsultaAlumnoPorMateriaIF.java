
package universidad_equipo85.Vistas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import universidad_equipo85.AccesoADatos.AlumnoData;
import universidad_equipo85.AccesoADatos.InscripcionData;
import universidad_equipo85.AccesoADatos.MateriaData;
import universidad_equipo85.Entidades.Alumno;
import universidad_equipo85.Entidades.Materia;


public class ConsultaAlumnoPorMateriaIF extends javax.swing.JInternalFrame {

   private DefaultTableModel modelo = new DefaultTableModel(){
    public boolean isCellEditable(int fila, int columna){
            return false;
        }
   };
  
   
    
    public ConsultaAlumnoPorMateriaIF() {
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
        jcbAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaAlumno = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setTitle("Listado de Alumnos por materia");

        jPanel1.setBackground(new java.awt.Color(212, 230, 241));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Listado de Alumnos por Materia");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione una Materia:");

        jcbAlumno.setBackground(new java.awt.Color(127, 179, 213));
        jcbAlumno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoActionPerformed(evt);
            }
        });

        jtTablaAlumno.setBackground(new java.awt.Color(127, 179, 213));
        jtTablaAlumno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtTablaAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtTablaAlumno);

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
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(207, 207, 207))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbSalir)
                .addGap(31, 31, 31))
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

    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed
    limpiarFilas();

        InscripcionData inscripciondata = new InscripcionData();

        Materia materia = (Materia) jcbAlumno.getSelectedItem();

        List<Alumno> alumnos = new ArrayList<>();

        alumnos = inscripciondata.obtenerAlumnosPorMateria(materia.getIdMateria());
   
        for (Alumno alumno : alumnos) {
            modelo.addRow(new Object[]{
                alumno.getIdAlumno(),
                alumno.getDni(),
                alumno.getApellido(),
                alumno.getNombre()
            });
        }
                                 
    }//GEN-LAST:event_jcbAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Materia> jcbAlumno;
    private javax.swing.JTable jtTablaAlumno;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        jtTablaAlumno.setModel(modelo);

    }
 private void cargarComboAlumno() {
        MateriaData materiadata = new MateriaData();
        for (Materia materia : materiadata.listarMateria()) {
            jcbAlumno.addItem(materia);
        }
    }
  private void limpiarFilas() {
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }


}
