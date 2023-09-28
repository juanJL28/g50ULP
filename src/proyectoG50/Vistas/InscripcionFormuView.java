/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyectoG50.Vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoG50.AccesoADatos.AlumnoData;
import proyectoG50.Entidades.Alumno;
import proyectoG50.AccesoADatos.InscripcionData;
import proyectoG50.Entidades.Materia;
import proyectoG50.AccesoADatos.MateriaData;
import proyectoG50.Entidades.Inscripcion;

/**
 * @author Programita
 */
public class InscripcionFormuView extends javax.swing.JInternalFrame {
private DefaultTableModel modelo = new DefaultTableModel();

       //prepara alumnos para ser pasados y se ve la wea de la vista JAJA
    public InscripcionFormuView() {
        initComponents();
        armarcabezera();
     
        
        
        jMateriaNoInscriptas.setSelected(true);
        jComboListarAlumno.setSelectedItem(1);

        Alumno SeleccionarAlumno = (Alumno) jComboListarAlumno.getSelectedItem();
        AlumnoData Alumnito = new AlumnoData();
        List<Alumno> alumnitos = Alumnito.listarAlumnos();

        jComboListarAlumno.removeAllItems();
        alumnitos.forEach((alumnoo) -> {
            jComboListarAlumno.addItem(alumnoo);
        });

    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TitleNombre = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        botonInscribir = new javax.swing.JButton();
        botonAnularInscripcion = new javax.swing.JButton();
        TitleGestionMateria = new javax.swing.JLabel();
        TitleCodigo = new javax.swing.JLabel();
        jMateriasInscriptas = new javax.swing.JRadioButton();
        jMateriaNoInscriptas = new javax.swing.JRadioButton();
        jComboListarAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaListas = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setEnabled(false);

        TitleNombre.setBackground(new java.awt.Color(255, 255, 255));
        TitleNombre.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        TitleNombre.setForeground(new java.awt.Color(0, 0, 0));
        TitleNombre.setText("Listado de Materia");

        botonSalir.setBackground(new java.awt.Color(255, 204, 204));
        botonSalir.setForeground(new java.awt.Color(0, 0, 0));
        botonSalir.setText("Salir");
        botonSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 153), new java.awt.Color(255, 51, 102)));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        botonInscribir.setBackground(new java.awt.Color(153, 204, 255));
        botonInscribir.setForeground(new java.awt.Color(0, 0, 0));
        botonInscribir.setText("Inscribir");
        botonInscribir.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), new java.awt.Color(0, 204, 255)));
        botonInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInscribirActionPerformed(evt);
            }
        });

        botonAnularInscripcion.setBackground(new java.awt.Color(255, 204, 204));
        botonAnularInscripcion.setForeground(new java.awt.Color(0, 0, 0));
        botonAnularInscripcion.setText("Anular Inscripcion");
        botonAnularInscripcion.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 102), new java.awt.Color(255, 51, 51)));
        botonAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnularInscripcionActionPerformed(evt);
            }
        });

        TitleGestionMateria.setBackground(new java.awt.Color(255, 255, 255));
        TitleGestionMateria.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        TitleGestionMateria.setForeground(new java.awt.Color(0, 0, 0));
        TitleGestionMateria.setText("Formulario De Inscripciones ");

        TitleCodigo.setBackground(new java.awt.Color(255, 255, 255));
        TitleCodigo.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        TitleCodigo.setForeground(new java.awt.Color(0, 0, 0));
        TitleCodigo.setText("Seleccione un alumno");

        jMateriasInscriptas.setBackground(new java.awt.Color(255, 255, 255));
        jMateriasInscriptas.setForeground(new java.awt.Color(0, 0, 0));
        jMateriasInscriptas.setText("Materias Inscriptas");
        jMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMateriasInscriptasActionPerformed(evt);
            }
        });

        jMateriaNoInscriptas.setBackground(new java.awt.Color(255, 255, 255));
        jMateriaNoInscriptas.setForeground(new java.awt.Color(0, 0, 0));
        jMateriaNoInscriptas.setText("Materias no inscriptas");
        jMateriaNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMateriaNoInscriptasActionPerformed(evt);
            }
        });

        jComboListarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboListarAlumnoActionPerformed(evt);
            }
        });

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
        jScrollPane3.setViewportView(tablaListas);

        jScrollPane1.setViewportView(jScrollPane3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(botonInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(botonAnularInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(TitleNombre)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(TitleCodigo)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboListarAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jMateriasInscriptas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jMateriaNoInscriptas))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(TitleGestionMateria)))
                .addContainerGap(57, Short.MAX_VALUE))
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
                    .addComponent(jComboListarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(TitleNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMateriasInscriptas)
                    .addComponent(jMateriaNoInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAnularInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed
    
    private void refreshTable(List<Materia> materias) {
        modelo.setRowCount(0);
        

        
        for (Materia materia : materias) {
            modelo.addRow(new Object[]{materia.getNombre(), materia.getAnioMateria(), materia.getIdMateria()});
        }
    }
    
    private void botonInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInscribirActionPerformed
        if (jMateriasInscriptas.isSelected() == false) {    //Crear Alumno
            Alumno alumnoInscribir = (Alumno) jComboListarAlumno.getSelectedItem();
            if (alumnoInscribir == null) {
                return;
            }
            InscripcionData materiass = new InscripcionData();
            int selectedRow = tablaListas.getSelectedRow();
            int filaS = tablaListas.getSelectedRow();

            if (filaS != -1) {
                //Crear Materia
                int codigo = Integer.parseInt(tablaListas.getValueAt(selectedRow, 2).toString());
                MateriaData materiaDatas = new MateriaData();
                Materia materia = materiaDatas.buscarMateria(codigo);

                if (materia != null) {
                    //Crear Inscripcion
                    Inscripcion inscripcion = new Inscripcion();
                    inscripcion.setAlumno(alumnoInscribir);
                    inscripcion.setMateria(materia);
                    inscripcion.setNota(0);

                    //Crear una Inscripcion
                    InscripcionData inscripcionData = new InscripcionData();
                    inscripcionData.guardarInscripcion(inscripcion);

                    //Refrescar la lista con materias NO Cursadas
                    List<Materia> updatedMaterias = inscripcionData.obtenerMateriasNOCursadas(alumnoInscribir.getIdAlumno());
                    refreshTable(updatedMaterias);
                }
            }
        }
    }//GEN-LAST:event_botonInscribirActionPerformed

    private void botonAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnularInscripcionActionPerformed

        if (jMateriasInscriptas.isSelected() == true) {
            Alumno x = (Alumno) jComboListarAlumno.getSelectedItem();
            if (x == null && jMateriaNoInscriptas.isSelected() == true) {
                return;
            }

            int selectedRow = tablaListas.getSelectedRow();
            int filaS = tablaListas.getSelectedRow();

            if (filaS != -1) {
                //Fijar en que materia estamos
                String materiaName = tablaListas.getValueAt(selectedRow, 0).toString();
                int codigo = Integer.parseInt(tablaListas.getValueAt(selectedRow, 2).toString());

                int confirmResult = JOptionPane.showConfirmDialog(
                        this,
                        "¿Desea borrar la inscripción?",
                        "Confirmar Borrado",
                        JOptionPane.YES_NO_OPTION
                );
                if (confirmResult == JOptionPane.YES_OPTION) {
                    // Confirmo Seleccion
                    InscripcionData inscripcionData = new InscripcionData();
                    inscripcionData.borrarInscripcionMateriaAlumno(x.getIdAlumno(), codigo);

                    //Refresh de la lista
                    List<Materia> updatedMaterias = inscripcionData.obtenerMateriasCursadas(x.getIdAlumno());
                    refreshTable(updatedMaterias);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Porfavor seleccione una fila");
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_botonAnularInscripcionActionPerformed

    private void jMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMateriasInscriptasActionPerformed
        Alumno selectedAlumno = (Alumno) jComboListarAlumno.getSelectedItem();

        InscripcionData materias = new InscripcionData();
        if (selectedAlumno == null) {
            return;
        }
        modelo.setRowCount(0);
        tablaListas.removeAll();

        List<Materia> materiasCursadas = materias.obtenerMateriasCursadas(selectedAlumno.getIdAlumno());
        cargarDatos(materiasCursadas);


    }//GEN-LAST:event_jMateriasInscriptasActionPerformed

    private void jMateriaNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMateriaNoInscriptasActionPerformed
        Alumno selectedAlumno = (Alumno) jComboListarAlumno.getSelectedItem();

        InscripcionData materias = new InscripcionData();
        if (selectedAlumno == null) {
            return;
        }
        modelo.setRowCount(0);
        tablaListas.removeAll();

        List<Materia> materiasNOCursadas = materias.obtenerMateriasNOCursadas(selectedAlumno.getIdAlumno());
        cargarDatos(materiasNOCursadas);


    }//GEN-LAST:event_jMateriaNoInscriptasActionPerformed

    private void jListarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarAlumnoActionPerformed


// TODO add your handling code here:
    }//GEN-LAST:event_jListarAlumnoActionPerformed

    private void jComboListarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboListarAlumnoActionPerformed

        Alumno selectedAlumno = (Alumno) jComboListarAlumno.getSelectedItem();
        if (selectedAlumno == null) {
            // podria agregar un mensaje de error 
            return;
        }

        modelo.setRowCount(0); // Limpia la tabla

        InscripcionData InscData = new InscripcionData();

        if (jMateriasInscriptas.isSelected()) {
            cargarDatos(InscData.obtenerMateriasCursadas(selectedAlumno.getIdAlumno()));
        } else if (jMateriaNoInscriptas.isSelected()) {
            cargarDatos(InscData.obtenerMateriasNOCursadas(selectedAlumno.getIdAlumno()));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jComboListarAlumnoActionPerformed

    private void armarcabezera() {

        modelo.addColumn("Materia");
        modelo.addColumn("Año");
        modelo.addColumn("Codigo");
        tablaListas.setModel(modelo);

    }

    public void cargarDatos(List<Materia> materias) {

        for (Materia materia : materias) {
            modelo.addRow(new Object[]{materia.getNombre(), materia.getAnioMateria(), materia.getIdMateria()});
        }

    }

///golaaaa
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleCodigo;
    private javax.swing.JLabel TitleGestionMateria;
    private javax.swing.JLabel TitleNombre;
    private javax.swing.JButton botonAnularInscripcion;
    private javax.swing.JButton botonInscribir;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<Alumno> jComboListarAlumno;
    private javax.swing.JRadioButton jMateriaNoInscriptas;
    private javax.swing.JRadioButton jMateriasInscriptas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tablaListas;
    // End of variables declaration//GEN-END:variables

}
