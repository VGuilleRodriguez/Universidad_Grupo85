/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad_equipo85.Vistas;

import java.awt.Dimension;
import java.util.TreeSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import universidad_equipo85.AccesoADatos.AlumnoData;

/**
 *
 * @author Guillermo Rodriguez
 */
public class MenuPrincipal extends javax.swing.JFrame {
    public static TreeSet<AlumnoData> listaAlumnoData = new TreeSet<>();

    
    public MenuPrincipal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/universidad_equipo85/imagenes/icon-ulp.png")).getImage());
        this.setLocationRelativeTo(null);        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jpFondo = new javax.swing.JPanel();
        jlLogo = new javax.swing.JLabel();
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
        setTitle("Universidad ULP");
        setBackground(new java.awt.Color(212, 230, 241));
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(900, 700));

        escritorio.setBackground(new java.awt.Color(212, 230, 241));
        escritorio.setPreferredSize(new java.awt.Dimension(800, 600));

        jpFondo.setBackground(new java.awt.Color(36, 113, 163));

        jlLogo.setBackground(new java.awt.Color(36, 113, 163));
        jlLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad_equipo85/imagenes/logo-ulp.png"))); // NOI18N
        jlLogo.setPreferredSize(new java.awt.Dimension(792, 581));

        javax.swing.GroupLayout jpFondoLayout = new javax.swing.GroupLayout(jpFondo);
        jpFondo.setLayout(jpFondoLayout);
        jpFondoLayout.setHorizontalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpFondoLayout.setVerticalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );

        escritorio.setLayer(jpFondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        MenuAlumno.setText("Alumno");
        MenuAlumno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        MenuItemFormularioAlum.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MenuItemFormularioAlum.setText("Formulario de Alumno");
        MenuItemFormularioAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFormularioAlumActionPerformed(evt);
            }
        });
        MenuAlumno.add(MenuItemFormularioAlum);

        jMenuBar1.add(MenuAlumno);

        MenuMateria.setText("Materia");
        MenuMateria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        MenuFormularioMateria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MenuFormularioMateria.setText("Formulario de Materia");
        MenuFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFormularioMateriaActionPerformed(evt);
            }
        });
        MenuMateria.add(MenuFormularioMateria);

        jMenuBar1.add(MenuMateria);

        MenuAdministracion.setText("Administracion");
        MenuAdministracion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        MenuManejodeInscripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MenuManejodeInscripcion.setText("Manejo de Inscripciones");
        MenuManejodeInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuManejodeInscripcionActionPerformed(evt);
            }
        });
        MenuAdministracion.add(MenuManejodeInscripcion);

        MenuManipulacionNotas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MenuManipulacionNotas.setText("Manipulacion de Notas");
        MenuManipulacionNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuManipulacionNotasActionPerformed(evt);
            }
        });
        MenuAdministracion.add(MenuManipulacionNotas);

        jMenuBar1.add(MenuAdministracion);

        MenuConsultas.setText("Consultas");
        MenuConsultas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        MenuAlumporMateria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MenuAlumporMateria.setText("Alumnos por Materia");
        MenuAlumporMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAlumporMateriaActionPerformed(evt);
            }
        });
        MenuConsultas.add(MenuAlumporMateria);

        jMenuBar1.add(MenuConsultas);

        MenuSalir.setText("Salir");
        MenuSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemFormularioAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFormularioAlumActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AlumnosIF aif = new AlumnosIF();
        aif.setVisible(true);
        escritorio.add(aif).setLocation(200,100);
        escritorio.moveToFront(aif);
        escritorio.add(jlLogo);
        escritorio.add(jpFondo);
        //comentar todo esto de arriba y probar
        
        
//       AlumnosIF m = new AlumnosIF();
//       escritorio.add(aif);
//       Dimension desktopSize = escritorio.getSize();
//       Dimension FrameSize = m.getSize();
//       m.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
//       m.show();
                   
    }//GEN-LAST:event_MenuItemFormularioAlumActionPerformed

    private void MenuFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFormularioMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        MateriasIF mIF = new MateriasIF();
        mIF.setVisible(true);
        escritorio.add(mIF).setLocation(200,100);
        escritorio.moveToFront(mIF);
        escritorio.add(jlLogo);
        escritorio.add(jpFondo);
        escritorio.setLocation(200, 100);
    }//GEN-LAST:event_MenuFormularioMateriaActionPerformed

    private void MenuManejodeInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuManejodeInscripcionActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioDeInscripcionIF fdi = new FormularioDeInscripcionIF();
        fdi.setVisible(true);
        escritorio.add(fdi).setLocation(200,100);
        escritorio.moveToFront(fdi);
        escritorio.add(jlLogo);
        escritorio.add(jpFondo);
        escritorio.setLocation(200, 100);
    }//GEN-LAST:event_MenuManejodeInscripcionActionPerformed

    private void MenuManipulacionNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuManipulacionNotasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        CargaDeNotasIF cdn = new CargaDeNotasIF();
        cdn.setVisible(true);
        escritorio.add(cdn).setLocation(200,100);
        escritorio.moveToFront(cdn);
        escritorio.add(jlLogo);
        escritorio.add(jpFondo);
    }//GEN-LAST:event_MenuManipulacionNotasActionPerformed

    private void MenuAlumporMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAlumporMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ConsultaAlumnoPorMateriaIF cam = new ConsultaAlumnoPorMateriaIF();
        cam.setVisible(true);
        escritorio.add(cam).setLocation(200,100);
        escritorio.moveToFront(cam);
        escritorio.add(jlLogo);
        escritorio.add(jpFondo);
    }//GEN-LAST:event_MenuAlumporMateriaActionPerformed

    private void MenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSalirMouseClicked
      System.exit(0);
    }//GEN-LAST:event_MenuSalirMouseClicked

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
    private javax.swing.JLabel jlLogo;
    private javax.swing.JPanel jpFondo;
    // End of variables declaration//GEN-END:variables
}
