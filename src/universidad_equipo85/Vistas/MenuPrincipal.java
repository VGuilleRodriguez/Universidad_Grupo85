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
            .addGap(0, 570, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
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
        MenuFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFormularioMateriaActionPerformed(evt);
            }
        });
        MenuMateria.add(MenuFormularioMateria);

        jMenuBar1.add(MenuMateria);

        MenuAdministracion.setText("Administracion");

        MenuManejodeInscripcion.setText("Manejo de Inscripciones");
        MenuManejodeInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuManejodeInscripcionActionPerformed(evt);
            }
        });
        MenuAdministracion.add(MenuManejodeInscripcion);

        MenuManipulacionNotas.setText("Manipulacion de Notas");
        MenuManipulacionNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuManipulacionNotasActionPerformed(evt);
            }
        });
        MenuAdministracion.add(MenuManipulacionNotas);

        jMenuBar1.add(MenuAdministracion);

        MenuConsultas.setText("Consultas");

        MenuAlumporMateria.setText("Alumnos por Materia");
        MenuAlumporMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAlumporMateriaActionPerformed(evt);
            }
        });
        MenuConsultas.add(MenuAlumporMateria);

        jMenuBar1.add(MenuConsultas);

        MenuSalir.setText("Salir");
        MenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalirActionPerformed(evt);
            }
        });
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

    private void MenuFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFormularioMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        MateriasIF mIF = new MateriasIF();
        mIF.setVisible(true);
        escritorio.add(mIF);
        escritorio.moveToFront(mIF);
    }//GEN-LAST:event_MenuFormularioMateriaActionPerformed

    private void MenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalirActionPerformed
        
    }//GEN-LAST:event_MenuSalirActionPerformed

    private void MenuManejodeInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuManejodeInscripcionActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioDeInscripcionIF fdi = new FormularioDeInscripcionIF();
        fdi.setVisible(true);
        escritorio.add(fdi);
        escritorio.moveToFront(fdi);
    }//GEN-LAST:event_MenuManejodeInscripcionActionPerformed

    private void MenuManipulacionNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuManipulacionNotasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        CargaDeNotasIF cdn = new CargaDeNotasIF();
        cdn.setVisible(true);
        escritorio.add(cdn);
        escritorio.moveToFront(cdn);
    }//GEN-LAST:event_MenuManipulacionNotasActionPerformed

    private void MenuAlumporMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAlumporMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ConsultaAlumnoPorMateriaIF cam = new ConsultaAlumnoPorMateriaIF();
        cam.setVisible(true);
        escritorio.add(cam);
        escritorio.moveToFront(cam);
    }//GEN-LAST:event_MenuAlumporMateriaActionPerformed

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
