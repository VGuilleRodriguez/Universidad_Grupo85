/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad_equipo85.Vistas;

import java.util.TreeSet;
import universidad_equipo85.AccesoADatos.AlumnoData;

/**
 *
 * @author Guillermo Rodriguez
 */
public class MenuPrincipal extends javax.swing.JFrame {
    public static TreeSet<AlumnoData> listaAlumnoData = new TreeSet<>();

    
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuAlumno = new javax.swing.JMenu();
        MenuItemFormularioAlum = new javax.swing.JMenuItem();
        MenuMateria = new javax.swing.JMenu();
        MenuFormularioMateria = new javax.swing.JMenuItem();
        MenuAdministracion = new javax.swing.JMenu();
        MenuManejodeInscripcion = new javax.swing.JMenuItem();
        MenuManipulacionNotas = new javax.swing.JMenuItem();
        MenuConsultas = new javax.swing.JMenu();
        MenuAlumporMateria = new javax.swing.JMenuItem();
        MenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        MenuAlumno.setText("Alumno");

        MenuItemFormularioAlum.setText("Formulario de Alumno");
        MenuItemFormularioAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFormularioAlumActionPerformed(evt);
            }
        });
        MenuAlumno.add(MenuItemFormularioAlum);

        jMenuBar1.add(MenuAlumno);

        MenuMateria.setText("Materia");

        MenuFormularioMateria.setText("Formulario de Materia");
        MenuMateria.add(MenuFormularioMateria);

        jMenuBar1.add(MenuMateria);

        MenuAdministracion.setText("Administracion");

        MenuManejodeInscripcion.setText("Manejo de Inscripciones");
        MenuAdministracion.add(MenuManejodeInscripcion);

        MenuManipulacionNotas.setText("Manipulacion de Notas");
        MenuAdministracion.add(MenuManipulacionNotas);

        jMenuBar1.add(MenuAdministracion);

        MenuConsultas.setText("Consultas");

        MenuAlumporMateria.setText("Alumnos por Materia");
        MenuConsultas.add(MenuAlumporMateria);

        jMenuBar1.add(MenuConsultas);

        MenuSalir.setText("Salir");
        jMenuBar1.add(MenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemFormularioAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFormularioAlumActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AlumnosIF aif = new AlumnosIF();
        aif.setVisible(true);
        escritorio.add(aif);
        escritorio.moveToFront(aif);
    }//GEN-LAST:event_MenuItemFormularioAlumActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAdministracion;
    private javax.swing.JMenu MenuAlumno;
    private javax.swing.JMenuItem MenuAlumporMateria;
    private javax.swing.JMenu MenuConsultas;
    private javax.swing.JMenuItem MenuFormularioMateria;
    private javax.swing.JMenuItem MenuItemFormularioAlum;
    private javax.swing.JMenuItem MenuManejodeInscripcion;
    private javax.swing.JMenuItem MenuManipulacionNotas;
    private javax.swing.JMenu MenuMateria;
    private javax.swing.JMenu MenuSalir;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
