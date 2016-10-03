/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activosfijos.model;
import ClaseConectar.Conexion;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author jhsgattorno
 */
public class clasesDAO {
   
    Conexion myConexion = new Conexion();
    modelClases miClase = null;
    PreparedStatement ps = null;
    String cSQL = "";
    
    
    public void clasesDAO(){
        this.myConexion = new Conexion();
    }

    public void clasesDAO (modelClases miClase) throws SQLException{
        this.miClase = miClase;
  
        Connection accesoDB = myConexion.getConexion();
       
        cSQL = " UPDATE clases "
                + " SET descripcion = ? "
                + " WHERE codigoClase = ? ;" ;
                
        try {
           ps = accesoDB.prepareStatement(cSQL);
           ps.setString(1, miClase.getDescripcion());
           ps.setInt(2, miClase.getCodigoClase() );
           
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null, " Datos guardados ");
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "Error en instruccion sql" + e.getMessage() + cSQL, "Error de conexion", JOptionPane.INFORMATION_MESSAGE );
            ps.close();
            accesoDB.close();
        }
        
        cSQL = " INSERT INTO clases "
                + " SELECT ? AS codigoClase "
                + " , ? AS descripcion \n"
                + " WHERE NOT EXISTS ( "
                + "     SELECT * FROM clases "
                + "         WHERE codigoClase = ? );";
        
        try {
           ps = accesoDB.prepareStatement(cSQL);
           ps.setInt(1, miClase.getCodigoClase());
           ps.setString(2, miClase.getDescripcion());
           ps.setInt(3, miClase.getCodigoClase());
           
           ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "Error en instruccion sql" + e.getMessage() + cSQL, "Error de conexion", JOptionPane.INFORMATION_MESSAGE );
            ps.close();
            accesoDB.close();
        }finally {
            if(ps != null) {
                ps.close();
                accesoDB.close();
            }            
        }
        
        
    } // Fin del metodo constructor clasesDAO 
    
    public modelClases borrar (modelClases miClase) throws SQLException {
        this.miClase = miClase;
        
        Connection accesoDB = myConexion.getConexion();
        
        cSQL = " SELECT COUNT(*) AS Total \n"
                + " FROM activos \n"
                + " WHERE codigoClase = ? ;" ;
        
        //ResultSet rs = st.executeQuery(cSQL);
        try {
            ps = accesoDB.prepareStatement(cSQL);
            ps.setInt(1, miClase.getCodigoClase());
            ps.executeQuery();
            
            ResultSet rs = ps.getResultSet();
            rs.next();
            if(rs.getInt(1) > 0  ){
                JOptionPane.showMessageDialog(null, " Este registro no puede ser eliminado ");
                ps.close();
                accesoDB.close();
                return miClase;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "Error en instruccion sql" + e.getMessage() + cSQL, "Error de conexion", JOptionPane.INFORMATION_MESSAGE );
            ps.close();
            accesoDB.close();
        }
        
        cSQL = " DELETE FROM clases "
                + " WHERE codigoClase = ? ;";

        try {
            ps = accesoDB.prepareStatement(cSQL);
            ps.setInt(1, miClase.getCodigoClase());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, " Datos eliminados ");
            return miClase;

        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,  "Error en instruccion sql" + e.getMessage() + cSQL, "Error de conexion", JOptionPane.INFORMATION_MESSAGE );
           ps.close();
           accesoDB.close();
        } finally {
           if(ps != null || ps != null) {
               ps.close();
               accesoDB.close();
           }            
        }
        return miClase;
    } // fin del metodo borrar
    
    
    public modelClases buscar(int codigoClase)  throws SQLException {
        
        Connection accesoDB = myConexion.getConexion();
        cSQL = "SELECT * FROM clses "
                + "WHERE codigoClase = '"+ codigoClase +"'";
        
        Statement st = accesoDB.createStatement();
        ResultSet rs = st.executeQuery(cSQL);
         try {
            if(rs.next()){
                miClase.setCodigoClase(rs.getInt(1));
                miClase.setDescripcion(rs.getString(2));
                return miClase;
            }
         } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "Error en instruccion sql" + e.getMessage() + cSQL, "Error de conexion", JOptionPane.INFORMATION_MESSAGE );
            st.close();
            rs.close();
            ps.close();
            accesoDB.close();
         } finally {
            if(ps != null || ps != null) {
                st.close();
                rs.close();
                ps.close();
                accesoDB.close();
            }            
        }
        return miClase;
    } // Fin de del metodo buscar
 
         
    public modelClases primerRegistro (modelClases miClase) throws SQLException {
        this.miClase = miClase;
        
        Connection accesoDB = myConexion.getConexion();
        
        cSQL = " SELECT * FROM clases "
                + " ORDER BY codigoClase "
                + " LIMIT 1 ;";

        Statement st = accesoDB.createStatement();
        ResultSet rs = st.executeQuery(cSQL);
        try {
           if(rs.next()){
               miClase.setCodigoClase(rs.getInt(1));
               miClase.setDescripcion(rs.getString(2));
               return miClase;
           }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,  "Error en instruccion sql" + e.getMessage() + cSQL, "Error de conexion", JOptionPane.INFORMATION_MESSAGE );
           st.close();
           rs.close();
           ps.close();
           accesoDB.close();
        } finally {
           if(ps != null || ps != null) {
               st.close();
               rs.close();
               ps.close();
               accesoDB.close();
           }            
        }
        return miClase;
    } // Fin del metodo primerRegistro

    public modelClases siguienteNumero (modelClases miClase) throws SQLException {
        this.miClase = miClase;
        
        Connection accesoDB = myConexion.getConexion();
        
        cSQL = " SELECT MAX(codigoClase)+1 As codigoClase "
                + " ,'' AS descripcion"
                + " FROM clases;";

        Statement st = accesoDB.createStatement();
        ResultSet rs = st.executeQuery(cSQL);
        try {
           if(rs.next()){
               this.miClase.setCodigoClase(rs.getInt(1));
               this.miClase.setDescripcion(rs.getString(2));
               return miClase;
           }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,  "Error en instruccion sql" + e.getMessage() + cSQL, "Error de conexion", JOptionPane.INFORMATION_MESSAGE );
           st.close();
           rs.close();
           ps.close();
           accesoDB.close();
        } finally {
           if(ps != null || ps != null) {
               st.close();
               rs.close();
               ps.close();
               accesoDB.close();
           }            
        }
        return miClase;
    } // fin del metodo siguienteNumero
    
    public ArrayList<modelClases> Registros (String cadena) throws SQLException {
        ArrayList listaClases = new ArrayList();
        String filtro = cadena.trim();
        
        Connection accesoDB = myConexion.getConexion();
        cSQL = " SELECT * FROM clases "
                + "     WHERE codigoClase::text LIKE '%"
                + filtro + "%' "
                + " UNION "
                + " SELECT * FROM clases"
                + " ORDER BY 1 "
                + " LIMIT 150 "
                + ";";

        Statement st = accesoDB.createStatement();
        ResultSet rs = st.executeQuery(cSQL);
        try {
            while(rs.next()){
                this.miClase = new modelClases();
                miClase.setCodigoClase(rs.getInt(1));
                miClase.setDescripcion(rs.getString(2));
                listaClases.add(miClase);
            }
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,  "Error en instruccion sql" + e.getMessage() + cSQL, "Error de conexion", JOptionPane.INFORMATION_MESSAGE );
           st.close();
           rs.close();
           ps.close();
           accesoDB.close();
        } finally {
           if(ps != null || ps != null) {
               st.close();
               rs.close();
               ps.close();
               accesoDB.close();
           }            
        }
        return listaClases;
    } // Fin del metodo Registros

}
