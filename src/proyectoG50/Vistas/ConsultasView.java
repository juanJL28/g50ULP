/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

package proyectoG50.Vistas;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import proyectoG50.AccesoADatos.InscripcionData;
import proyectoG50.AccesoADatos.MateriaData;
import proyectoG50.Entidades.Alumno;
import proyectoG50.Entidades.Materia;

/**@author Programita */

public class ConsultasView extends javax.swing.JInternalFrame {
    private DefaultTableModel model=new DefaultTableModel();
    
    public ConsultasView() {
        initComponents();
        armarcabezera();
        
        listarMateria.setSelectedItem(1);
        
        
          MateriaData materiasData = new MateriaData();
        List<Materia> materias= materiasData.listarMaterias();

        listarMateria.removeAllItems();
        
        materias.forEach((materia) -> {
            listarMateria.addItem(materia);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        botonSalir = new javax.swing.JButton();
        TitleGestionMateria = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        TitleCodigo = new javax.swing.JLabel();
        listarMateria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaListas = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        botonSalir.setBackground(new java.awt.Color(255, 204, 204));
        botonSalir.setText("Salir");
        botonSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 153), new java.awt.Color(255, 51, 102)));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        TitleGestionMateria.setBackground(new java.awt.Color(255, 255, 255));
        TitleGestionMateria.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        TitleGestionMateria.setText("Listado de Alumnos por Materia");

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        TitleCodigo.setBackground(new java.awt.Color(255, 255, 255));
        TitleCodigo.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        TitleCodigo.setText("Seleccione un materia");

        listarMateria.setBackground(new java.awt.Color(153, 153, 153));
        listarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarMateriaActionPerformed(evt);
            }
        });

        TablaListas.setBackground(new java.awt.Color(153, 153, 153));
        TablaListas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(TablaListas);

        jScrollPane1.setViewportView(jScrollPane3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(TitleCodigo)
                            .addGap(18, 18, 18)
                            .addComponent(listarMateria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(TitleGestionMateria)
                        .addGap(114, 114, 114))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(TitleGestionMateria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void listarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarMateriaActionPerformed
        Materia materias = (Materia) listarMateria.getSelectedItem();        
        if(materias == null ){return;}
        //Conseguir idMateria
        int idMateria = materias.getIdMateria();
               
            InscripcionData alumnoMateria = new InscripcionData();
            
            List<Alumno> inscripciones= alumnoMateria.obtenerAlumnosXMateria(idMateria);
            cargarDatos(inscripciones);
        
    }//GEN-LAST:event_listarMateriaActionPerformed
    private void armarcabezera(){
        
        model.addColumn("Nombre");
        model.addColumn("Apellido");      
        model.addColumn("DNI");
        TablaListas.setModel(model);
        
    }
    
    public void cargarDatos(List<Alumno> alumnos){
       model.setRowCount(0);
    
    
    for (Alumno alumno : alumnos) {
     
        model.addRow(new Object[]{alumno.getNombre(), alumno.getApellido(), alumno.getDni()});
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaListas;
    private javax.swing.JLabel TitleCodigo;
    private javax.swing.JLabel TitleGestionMateria;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<Materia> listarMateria;
    // End of variables declaration//GEN-END:variables

}
