/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyectoG50.Vistas;


import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoG50.AccesoADatos.AlumnoData;
import proyectoG50.AccesoADatos.InscripcionData;
import proyectoG50.Entidades.Alumno;
import proyectoG50.Entidades.Inscripcion;


/**
 * @author Programita
 */
public class ActualizacionNotasFormuView extends javax.swing.JInternalFrame {
    private DefaultTableModel model = new DefaultTableModel();
    private double notaAlumno;

    public ActualizacionNotasFormuView() {
        initComponents();
        armarCabecera();
        armarCbox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBGuardar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        TitleGestionMateria = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        TitleCodigo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaListas = new javax.swing.JTable();
        CBListaDeAlumnos = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jBGuardar.setBackground(new java.awt.Color(153, 204, 255));
        jBGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jBGuardar.setText("Guardar");
        jBGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), new java.awt.Color(0, 204, 255)));
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        BotonSalir.setBackground(new java.awt.Color(255, 204, 204));
        BotonSalir.setForeground(new java.awt.Color(0, 0, 0));
        BotonSalir.setText("Salir");
        BotonSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 153), new java.awt.Color(255, 51, 102)));
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        TitleGestionMateria.setBackground(new java.awt.Color(255, 255, 255));
        TitleGestionMateria.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        TitleGestionMateria.setForeground(new java.awt.Color(0, 0, 0));
        TitleGestionMateria.setText("Carga de Notas");

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        TitleCodigo.setBackground(new java.awt.Color(255, 255, 255));
        TitleCodigo.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        TitleCodigo.setForeground(new java.awt.Color(0, 0, 0));
        TitleCodigo.setText("Seleccione un alumno");

        tablaListas.setBackground(new java.awt.Color(255, 255, 255));
        tablaListas.setForeground(new java.awt.Color(0, 0, 0));
        tablaListas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaListas.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tablaListasInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jScrollPane3.setViewportView(tablaListas);

        jScrollPane1.setViewportView(jScrollPane3);

        CBListaDeAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBListaDeAlumnosItemStateChanged(evt);
            }
        });
        CBListaDeAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBListaDeAlumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TitleCodigo)
                                .addGap(46, 46, 46)
                                .addComponent(CBListaDeAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(TitleGestionMateria)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TitleGestionMateria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBListaDeAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
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

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        Alumno alumnoSeleccionado = (Alumno) CBListaDeAlumnos.getSelectedItem();
        int idAlumnoSeleccionado = alumnoSeleccionado.getIdAlumno();
        InscripcionData inscripcionData=new InscripcionData();
        int selectedRow = tablaListas.getSelectedRow();
    
    if (selectedRow != -1) {
        try {
            
            double newNotaAlumno = Double.parseDouble(model.getValueAt(selectedRow, 2).toString());
            notaAlumno=newNotaAlumno;
            int idMateria = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());      
              
            inscripcionData.actualizarNota(idAlumnoSeleccionado, idMateria, notaAlumno);
            
        } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(null, "Porfavor ingrese una nota correctamente.");
           
        }finally{ 
            armarCabecera();
            List<Inscripcion> inscripciones = inscripcionData.obtenerInscripcionesPorAlumno(idAlumnoSeleccionado);
            cargarDatos(inscripciones);   
        }
    }
        
    }//GEN-LAST:event_jBGuardarActionPerformed

    
    
    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void CBListaDeAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBListaDeAlumnosActionPerformed

        Alumno alumnoSeleccionado = (Alumno) CBListaDeAlumnos.getSelectedItem();
        int idAlumnoSeleccionado = alumnoSeleccionado.getIdAlumno();

        InscripcionData inscripcionData = new InscripcionData();

        List<Inscripcion> inscripciones = inscripcionData.obtenerInscripcionesPorAlumno(idAlumnoSeleccionado);
        cargarDatos(inscripciones);
    }//GEN-LAST:event_CBListaDeAlumnosActionPerformed
    
    private void armarCabecera() {
        model.setColumnCount(0);
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Nota");
        tablaListas.setModel(model);
    }

    public void cargarDatos(List<Inscripcion> inscripciones) {
        model.setRowCount(0);

        for (Inscripcion inscripcion : inscripciones) {

            model.addRow(new Object[]{inscripcion.getMateria().getIdMateria(), inscripcion.getMateria().getNombre(), inscripcion.getNota()});
        }
    }


    public void armarCbox(){
         AlumnoData alumnoData = new AlumnoData();
        List<Alumno> listaDeAlumnos = alumnoData.listarAlumnos();

        CBListaDeAlumnos.removeAllItems();

        listaDeAlumnos.forEach((alumno) -> {
            CBListaDeAlumnos.addItem(alumno);
        });

    }
    private void CBListaDeAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBListaDeAlumnosItemStateChanged

    }//GEN-LAST:event_CBListaDeAlumnosItemStateChanged

    private void tablaListasInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tablaListasInputMethodTextChanged
        
    }//GEN-LAST:event_tablaListasInputMethodTextChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private javax.swing.JComboBox<Alumno> CBListaDeAlumnos;
    private javax.swing.JLabel TitleCodigo;
    private javax.swing.JLabel TitleGestionMateria;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tablaListas;
    // End of variables declaration//GEN-END:variables

}
