/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activofijos.controler;

import ClaseConectar.Conexion;
import activofijos.view.viewClases;
import javax.swing.JOptionPane;
/**
 *
 * @author jhsgattorno
 */
public class probar {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        viewClases miVista = new viewClases(null, true);
        new controlerClases(miVista);
        
        if (conexion.getConexion() != null) {
            miVista.pack();
            miVista.setLocationRelativeTo(null);
            miVista.setVisible(true);      
        } else{
            JOptionPane.showMessageDialog(null, "No se realizó la Conexión");
        }
         
    }
    
}
