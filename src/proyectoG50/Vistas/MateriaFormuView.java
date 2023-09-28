/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyectoG50.Vistas;


import java.sql.SQLException;
import javax.swing.JOptionPane;
import proyectoG50.AccesoADatos.MateriaData;
import proyectoG50.Entidades.Materia;

public class MateriaFormuView extends javax.swing.JInternalFrame {

    public MateriaFormuView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TitleNombre = new javax.swing.JLabel();
        TitleAño = new javax.swing.JLabel();
        ButtonSalir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        TextForCodigo = new javax.swing.JTextField();
        TitleEstado = new javax.swing.JLabel();
        TextForNombre = new javax.swing.JTextField();
        ButtonNuevo = new javax.swing.JButton();
        TextForAnio = new javax.swing.JTextField();
        ButtonGuardar = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        RadioButtonEstado = new javax.swing.JRadioButton();
        ButtonEliminar = new javax.swing.JButton();
        TitleGestionMateria = new javax.swing.JLabel();
        TitleCodigo = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        TitleNombre.setBackground(new java.awt.Color(255, 255, 255));
        TitleNombre.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        TitleNombre.setForeground(new java.awt.Color(0, 0, 0));
        TitleNombre.setText("Nombre");

        TitleAño.setBackground(new java.awt.Color(255, 255, 255));
        TitleAño.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        TitleAño.setForeground(new java.awt.Color(0, 0, 0));
        TitleAño.setText("Año");

        ButtonSalir.setBackground(new java.awt.Color(255, 204, 204));
        ButtonSalir.setForeground(new java.awt.Color(0, 0, 0));
        ButtonSalir.setText("Salir");
        ButtonSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 153), new java.awt.Color(255, 51, 102)));
        ButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalirActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        TextForCodigo.setBackground(new java.awt.Color(220, 220, 220));

        TitleEstado.setBackground(new java.awt.Color(255, 255, 255));
        TitleEstado.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        TitleEstado.setForeground(new java.awt.Color(0, 0, 0));
        TitleEstado.setText("Estado");

        TextForNombre.setBackground(new java.awt.Color(220, 220, 220));

        ButtonNuevo.setBackground(new java.awt.Color(153, 204, 255));
        ButtonNuevo.setForeground(new java.awt.Color(0, 0, 0));
        ButtonNuevo.setText("Nuevo");
        ButtonNuevo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), new java.awt.Color(0, 204, 255)));
        ButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNuevoActionPerformed(evt);
            }
        });

        TextForAnio.setBackground(new java.awt.Color(220, 220, 220));
        TextForAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextForAnioActionPerformed(evt);
            }
        });

        ButtonGuardar.setBackground(new java.awt.Color(204, 255, 204));
        ButtonGuardar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonGuardar.setText("Guardar");
        ButtonGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 255, 51), new java.awt.Color(0, 204, 0)));
        ButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGuardarActionPerformed(evt);
            }
        });

        BotonBuscar.setBackground(new java.awt.Color(204, 204, 255));
        BotonBuscar.setForeground(new java.awt.Color(0, 0, 0));
        BotonBuscar.setText("Buscar");
        BotonBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 255), new java.awt.Color(102, 102, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 102, 255)));
        BotonBuscar.setMaximumSize(new java.awt.Dimension(76, 26));
        BotonBuscar.setMinimumSize(new java.awt.Dimension(76, 26));
        BotonBuscar.setPreferredSize(new java.awt.Dimension(76, 26));
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        RadioButtonEstado.setBackground(new java.awt.Color(255, 255, 255));
        RadioButtonEstado.setForeground(new java.awt.Color(255, 255, 255));
        RadioButtonEstado.setText("jRadioButton1");
        RadioButtonEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonEstadoActionPerformed(evt);
            }
        });

        ButtonEliminar.setBackground(new java.awt.Color(255, 204, 204));
        ButtonEliminar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonEliminar.setText("Eliminar");
        ButtonEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 102), new java.awt.Color(255, 51, 51)));
        ButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarActionPerformed(evt);
            }
        });

        TitleGestionMateria.setBackground(new java.awt.Color(255, 255, 255));
        TitleGestionMateria.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        TitleGestionMateria.setForeground(new java.awt.Color(0, 0, 0));
        TitleGestionMateria.setText("Gestión de Materias ");

        TitleCodigo.setBackground(new java.awt.Color(255, 255, 255));
        TitleCodigo.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        TitleCodigo.setForeground(new java.awt.Color(0, 0, 0));
        TitleCodigo.setText("Código");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TitleCodigo)
                                    .addComponent(TitleNombre)
                                    .addComponent(TitleAño)
                                    .addComponent(TitleEstado))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RadioButtonEstado)
                                    .addComponent(TextForNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TextForCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TextForAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(ButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(ButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(ButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 66, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(TitleGestionMateria)
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
                    .addComponent(TitleCodigo)
                    .addComponent(TextForCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextForNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleAño, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextForAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RadioButtonEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButtonSalirActionPerformed

    private void ButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNuevoActionPerformed
        MateriaData materiaNueva = new MateriaData();
        
        Materia materia = new Materia(TextForNombre.getText(), Integer.parseInt(TextForAnio.getText()), RadioButtonEstado.isSelected());
        materiaNueva.guardarMateria(materia);
        TextForNombre.setText("");
        TextForAnio.setText("");
        RadioButtonEstado.setSelected(false);
        
    }//GEN-LAST:event_ButtonNuevoActionPerformed

    private void TextForAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextForAnioActionPerformed
        
    }//GEN-LAST:event_TextForAnioActionPerformed

    private void ButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGuardarActionPerformed
       MateriaData materiaData = new MateriaData(); 
       String nombre = TextForNombre.getText();
       try{
        int anio = Integer.parseInt(TextForAnio.getText());
        boolean estado = RadioButtonEstado.isSelected();
        int idMateria = Integer.parseInt(TextForCodigo.getText());
        Materia materia = new Materia(idMateria,nombre, anio, estado);
        materiaData.modificarMateria(materia);
       }catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(this, "Porfavor ingrese un año correcto.");
       }
       
    }//GEN-LAST:event_ButtonGuardarActionPerformed

    private void RadioButtonEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonEstadoActionPerformed
        
    }//GEN-LAST:event_RadioButtonEstadoActionPerformed

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed
        MateriaData materiaData = new MateriaData();
        if(RadioButtonEstado.isSelected()==true){
            try{
                materiaData.eliminarMateria(Integer.parseInt(TextForCodigo.getText()));
                RadioButtonEstado.setSelected(false);
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this,"Esta Materia no existe.");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Esta materia ya esta deshabilitada.");
                
        }
    }//GEN-LAST:event_ButtonEliminarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        MateriaData materiaNueva = new MateriaData();
        try{
            int cod = Integer.parseInt(TextForCodigo.getText());
            Materia materia = materiaNueva.buscarMateria(cod);
            if (materia!=null) {
                TextForNombre.setText(materia.getNombre());
                TextForAnio.setText(Integer.toString(materia.getAnioMateria()));
                RadioButtonEstado.setSelected(materia.isEstado());
            }else{
                JOptionPane.showMessageDialog(null, "La materia no existe");}
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "El codigo debe ser un numero, porfavor ingrese correctamente.");
        }
           
        
    }//GEN-LAST:event_BotonBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JButton ButtonGuardar;
    private javax.swing.JButton ButtonNuevo;
    private javax.swing.JButton ButtonSalir;
    private javax.swing.JRadioButton RadioButtonEstado;
    private javax.swing.JTextField TextForAnio;
    private javax.swing.JTextField TextForCodigo;
    private javax.swing.JTextField TextForNombre;
    private javax.swing.JLabel TitleAño;
    private javax.swing.JLabel TitleCodigo;
    private javax.swing.JLabel TitleEstado;
    private javax.swing.JLabel TitleGestionMateria;
    private javax.swing.JLabel TitleNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
