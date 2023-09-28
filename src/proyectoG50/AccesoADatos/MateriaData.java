package proyectoG50.AccesoADatos;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import proyectoG50.Entidades.Materia;


public class MateriaData {
    private Connection con = null;
    
    public MateriaData(){
        con = Conexion.getConexion();
    
}
    public void guardarMateria(Materia materia){
        String sql = "INSERT into materia (nombre, anioMateria, estado) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Materia guardada con éxito");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "La materia ya existe");
        }
    }
    
    public Materia buscarMateria(int id){
        
            Materia materia=null;
            String sql= "SELECT idMateria, nombre, anioMateria, estado FROM materia WHERE idMateria = ? ";
            try {    
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (rs.next()){
                    materia=new Materia();
                    materia.setIdMateria(rs.getInt("idMateria"));
                    materia.setNombre(rs.getString("nombre"));
                    materia.setAnioMateria(rs.getInt("anioMateria"));
                    materia.setEstado(rs.getBoolean("estado"));
                }
                ps.close();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia");
            }
            return materia;
      
 }
    
    public void modificarMateria(Materia materia){
        String sql = "UPDATE materia SET nombre = ?, anioMateria = ?, estado = ? WHERE idMateria = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());
            int sqlUpdate = ps.executeUpdate();
            if (sqlUpdate==1) {
                JOptionPane.showMessageDialog(null, "Materia actualizada correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "La materia no existe");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla Materia"+ ex.getMessage());
        }
    }
    
    public void eliminarMateria(int id){
        try {
            String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
            PreparedStatement ps = null;
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int sqlDelete = ps.executeUpdate();
            if (sqlDelete==1) {
                JOptionPane.showMessageDialog(null, "Se deshabilito la materia");
            }else{
                JOptionPane.showMessageDialog(null, "No se encontró materia");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla Materia"+ ex.getMessage());
        }
    }
    
    public List<Materia> listarMaterias(){
           List<Materia> materias = new ArrayList<>();
           try {
               String sql = "SELECT * FROM materia WHERE estado = 1";
               PreparedStatement ps = con.prepareStatement(sql);
               ResultSet rs = ps.executeQuery();
               while (rs.next()) {
                   Materia materia = new Materia() ;
                   materia.setIdMateria(rs.getInt("idMateria"));
                   materia.setNombre(rs.getString("nombre"));
                   materia.setAnioMateria(rs.getInt("anioMateria"));
                   materia.setEstado(rs.getBoolean("estado"));
                   materias.add(materia);
               }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia "+ e.getMessage());
        }
           return materias;
    }
    
 
    
    
}
