/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoG50.Vistas;

import javax.swing.ToolTipManager;

/**
 *
 * @author Programita
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAlumno = new javax.swing.JMenu();
        jFormularioAlumno = new javax.swing.JMenuItem();
        jMenuMateria = new javax.swing.JMenu();
        jFormularioMateria = new javax.swing.JMenuItem();
        jMenuAdmin = new javax.swing.JMenu();
        jManejoDeInscripciones = new javax.swing.JMenuItem();
        ManipulacionDeNotas = new javax.swing.JMenuItem();
        JMenuConsultas = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        escritorio.setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 30)); // NOI18N
        jLabel1.setText("Interfaz de la ULP");

        jTextArea2.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jTextArea2.setRows(2);
        jTextArea2.setTabSize(3);
        jTextArea2.setText("“El campus de la Universidad de La Punta es por su propuesta general, único en el país.\"\n\n                                                  ~  Clorindo Testa ~");
        jTextArea2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(215, 215, 215), new java.awt.Color(153, 204, 255), null));
        jTextArea2.setEditable(false);
        jScrollPane3.setViewportView(jTextArea2);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoG50/Vistas/Imagenes/logo-ulp.png"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jMenuBar1.setInheritsPopupMenu(true);

        jMenuBar1.setName("");

        jMenuAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoG50/Vistas/Imagenes/alumno1.png"))); // NOI18N
        jMenuAlumno.setToolTipText("Alumno");
        jMenuAlumno.setAlignmentX(0.7F);
        jMenuAlumno.setMargin(new java.awt.Insets(5, 11, 3, 25));
        jMenuAlumno.setPreferredSize(new java.awt.Dimension(80, 20));
        ToolTipManager.sharedInstance().setInitialDelay(300); // Establece el tiempo de exposición en 500 ms (medio segundo)
        jMenuAlumno.addMenuDragMouseListener(new javax.swing.event.MenuDragMouseListener() {
            public void menuDragMouseDragged(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {
                jMenuAlumnoMenuDragMouseEntered(evt);
            }
            public void menuDragMouseExited(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseReleased(javax.swing.event.MenuDragMouseEvent evt) {
            }
        });
        jMenuAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuAlumnoMouseEntered(evt);
            }
        });

        jFormularioAlumno.setText("Formulario de Alumno");
        jFormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormularioAlumnoActionPerformed(evt);
            }
        });
        jMenuAlumno.add(jFormularioAlumno);

        jMenuBar1.add(jMenuAlumno);

        jMenuMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoG50/Vistas/Imagenes/materia2.png"))); // NOI18N
        jMenuMateria.setToolTipText("Materia");
        jMenuMateria.setAlignmentX(0.7F);
        jMenuMateria.setPreferredSize(new java.awt.Dimension(80, 20));
        jMenuMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMateriaActionPerformed(evt);
            }
        });

        jFormularioMateria.setText("Formulario de Materia");
        jFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormularioMateriaActionPerformed(evt);
            }
        });
        jMenuMateria.add(jFormularioMateria);

        jMenuBar1.add(jMenuMateria);

        jMenuAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoG50/Vistas/Imagenes/administracion1.png"))); // NOI18N
        jMenuAdmin.setToolTipText("Administración");
        jMenuAdmin.setPreferredSize(new java.awt.Dimension(80, 20));
        jMenuAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAdminActionPerformed(evt);
            }
        });

        jManejoDeInscripciones.setText("Manejo de Inscripciones");
        jManejoDeInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jManejoDeInscripcionesActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jManejoDeInscripciones);

        ManipulacionDeNotas.setText("Manipulacion de Notas");
        ManipulacionDeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManipulacionDeNotasActionPerformed(evt);
            }
        });
        jMenuAdmin.add(ManipulacionDeNotas);

        jMenuBar1.add(jMenuAdmin);

        JMenuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoG50/Vistas/Imagenes/consultas.png"))); // NOI18N
        JMenuConsultas.setToolTipText("Consultas");
        JMenuConsultas.setPreferredSize(new java.awt.Dimension(80, 20));

        jMenuItem4.setText("Alumnos por Materia");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        JMenuConsultas.add(jMenuItem4);

        jMenuBar1.add(JMenuConsultas);

        jMenuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoG50/Vistas/Imagenes/salir.png"))); // NOI18N
        jMenuSalir.setToolTipText("Salir");
        jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalirMouseClicked(evt);
            }
        });
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormularioAlumnoActionPerformed

        //escritorio.removeAll(); //le decimos al escritorio que si hay una ventana puesta, la remueva
        escritorio.repaint();  // Aca le pedimos al escritorio que se redibuje (como que se actualice)
        AlumnoFormuView formuA = new AlumnoFormuView(); //instaciamos un objeto de nuestra vista que es AlumnoFormuView. esto se guarda en una variable "formuA"
        formuA.setVisible(true); //al instanciar una ventana por defecto está invisible, entoces acá lo ponemos visile 

        escritorio.add(formuA); // agregamos el elemento formuA(que es el internalFrame) a la ventana 
        escritorio.moveToFront(formuA); // le decimos al escritorio que traiga al frente la ventana internalframe 


    }//GEN-LAST:event_jFormularioAlumnoActionPerformed

    private void jMenuMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuMateriaActionPerformed

    private void jFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormularioMateriaActionPerformed

        escritorio.repaint();
        MateriaFormuView formuM = new MateriaFormuView();
        formuM.setVisible(true);

        escritorio.add(formuM);
        escritorio.moveToFront(formuM);
    }//GEN-LAST:event_jFormularioMateriaActionPerformed

    private void jManejoDeInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jManejoDeInscripcionesActionPerformed
        escritorio.repaint();
        InscripcionFormuView formuInscripcion = new InscripcionFormuView();
        formuInscripcion.setVisible(true);

        escritorio.add(formuInscripcion);

        escritorio.moveToFront(formuInscripcion);
    }//GEN-LAST:event_jManejoDeInscripcionesActionPerformed

    private void ManipulacionDeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManipulacionDeNotasActionPerformed

        escritorio.repaint();
        ActualizacionNotasFormuView ActNotas = new ActualizacionNotasFormuView();
        ActNotas.setVisible(true);

        escritorio.add(ActNotas);
        escritorio.moveToFront(ActNotas);
    }//GEN-LAST:event_ManipulacionDeNotasActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        escritorio.repaint();
        ConsultasView ConsultasView = new ConsultasView();
        ConsultasView.setVisible(true);

        escritorio.add(ConsultasView);
        escritorio.moveToFront(ConsultasView);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirMouseClicked

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void jMenuAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAdminActionPerformed
//Para al pasar el mause diga el nombre del menú
    private void jMenuAlumnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAlumnoMouseEntered
 
    }//GEN-LAST:event_jMenuAlumnoMouseEntered
  

    private void jMenuAlumnoMenuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {//GEN-FIRST:event_jMenuAlumnoMenuDragMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAlumnoMenuDragMouseEntered

    /**
     * 
     */
    public static void vistas() {
        //HOLA
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenuConsultas;
    private javax.swing.JMenuItem ManipulacionDeNotas;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jFormularioAlumno;
    private javax.swing.JMenuItem jFormularioMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jManejoDeInscripciones;
    private javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenu jMenuAlumno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu jMenuMateria;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables

// EFECTO MAUSE PARA MENUS 
}
