/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseConectar;

import static ClaseConectar.Conectar.*;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author sierra
 */
public class Conexion {
    private static final int No = 2;  
    
    private static final  String driver = "org.postgresql.Driver";
    private static final  String base = "ActivosFijos";
    private static String user = "ti";  
    private static String password = "arigato";  
    private static String server = "jdbc:postgresql://localhost:5432/" + base ;  
    
    public Conexion() {  
      
        if(No == 2){  
            user = "postgres";  
            password = "melara1963";  
            server = "jdbc:postgresql://192.168.90.23:5432/" + base ;  
        }  
          
    }  

    public Connection  getConexion(){
        Connection conexion = null;
        try {
            /* Instanciar la base de datos*/
            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection( server, user, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "Imposible conectarse al servidor de datos " + e.getMessage(), "Error de conexion", JOptionPane.INFORMATION_MESSAGE );
            e.printStackTrace();
        }
        
        
        return conexion;
            
    }
    
    public void desconectar() {
        try {
            conexion.close();
        
        } 
        catch (SQLException exepcionSql)
        {
                exepcionSql.printStackTrace();
        } 
    
    }
        
    
}
