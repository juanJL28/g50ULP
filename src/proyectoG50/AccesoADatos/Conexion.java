
package proyectoG50.AccesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB ="universidad";
    private static final String USUARIO="root";
    private static final String PASSWORD ="";
    
    
    private static Connection conexion;
    

    
    private Conexion (){}
 
    public static Connection getConexion(){
       
        
        if (conexion==null) {
            try{
                //carga de drivers
                Class.forName("org.mariadb.jdbc.Driver");
            
                
                //conexion con la base de datos 
                conexion = DriverManager
                        .getConnection(URL+DB + "?useLegacyyDatetimeCode=false&serverTimezone=UTC"
                        +"&user=" + USUARIO + "&password=" + PASSWORD);
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al conectarse a la BD"+ ex.getMessage());
            }catch (ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null," Error al cargar los drivers " + ex.getMessage());
            }
            
        }
        return conexion;
    }
}