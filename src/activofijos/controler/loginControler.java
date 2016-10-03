/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package activofijos.controler;

import activofijos.Menuprincipal;
import activofijos.view.Login;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaime Gattorno
 */
public class loginControler implements ActionListener {
    private Login view;
    
    public loginControler(Login view) {
        this.view = view;
        addListener();
        
    }
    
    private void addListener(){
        view.getAceptar().addActionListener(this);
        view.getCancelar().addActionListener(this);
    }
  
    private void showMessage(String msg){
        Toolkit.getDefaultToolkit();
        //JOptionPane.showConfirmDialog(view, msg, , JOptionPane.INFORMATION_MESSAGE  );
        JOptionPane.showMessageDialog(view, msg,"Error de autenticación", JOptionPane.INFORMATION_MESSAGE  );
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if( ae.getSource() == view.getAceptar()){
            String user = view.getUsuario().getText();
            String password = view.getPassword().getText();
            
            if(user.trim().length() <= 0 && password.trim().length() <= 0) {
                showMessage("Ingresa tu usuario y tu contraseña");
                view.getUsuario().requestFocus();
            }else if(user.trim().length() <= 0){
                showMessage("Ingresa tu usuario");
                view.getUsuario().requestFocus();
            }else if(password.trim().length() <= 0){
                showMessage("Ingresa tu contraseña");
                view.getPassword().requestFocus();
            }else if(user.equals("Juan") && password.equals("Melara")){
                showMessage("Bienvenido ... ");
                view.dispose();
                // llamar a menu principal
                Menuprincipal Menu = new Menuprincipal();
                Menu.setLocationRelativeTo(null);
                Menu.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
                Menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
                Menu.setVisible(true);
                
            }else {
                showMessage("Usuario o contraseña invàlida");
            }
        }
        if( ae.getSource() == view.getCancelar()){
            System.exit(0);
            return;
        }
    }
    
}
