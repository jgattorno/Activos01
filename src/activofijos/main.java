/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package activofijos;

import activofijos.controler.loginControler;
import activofijos.view.Login;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaime Gattorno
 */
public class main {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args){
       // Mejores pràcticas, modelo, vista - controlador 
        
        Login view = new Login(null, true);
        new loginControler(view);
        view.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            } 
        });
        view.pack();
        view.setLocationRelativeTo(null);
        view.setVisible(true);
       
        /*
        Asignaciones lAsignaciones = new Asignaciones(new java.awt.Frame(), true);
        lAsignaciones.pack(); //se asegura de que la ventana se dibuje completa
        lAsignaciones.setLocationRelativeTo(null);  // Centra el formulario en la pantalla
        lAsignaciones.setVisible(true);
        */
    }
}
