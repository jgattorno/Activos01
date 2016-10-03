/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activofijos.controler;

import activofijos.view.viewClases;
import activosfijos.model.clasesDAO;
import activosfijos.model.modelClases;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import validaciones.validarTexto;

/**
 *
 * @author jhsgattorno
 */
public class controlerClases implements ActionListener {
    private final viewClases vistaClases;
    private final modelClases Clases = new modelClases();
    private final clasesDAO clasesDAO = new clasesDAO();
    
    private final JTextField txtCodigoClase;
    private final JTextField txtDescripcion;
    
    public validarTexto validar = new validarTexto();
    
    public controlerClases(viewClases vistaClase){
        this.vistaClases = vistaClase;
        
        txtCodigoClase = vistaClase.getTxtCodigoClase();
        txtDescripcion = vistaClase.getTxtDescripcion();
        
        validar.soloNumeros(txtCodigoClase);
        validar.soloLetras(txtDescripcion, 50);
        
        txtCodigoClase.setEditable(false);
        
        limpiar();
        addListener();
        cargarPrimerRegistro();
        cargarGrid(vistaClases.getTblClases());
        seleccionarRegistro(vistaClases.getTblClases());
    }

    @Override
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == vistaClases.getBntGuardar()){
            guardar();
            cargarPrimerRegistro();
            cargarGrid(vistaClases.getTblClases());
        }else if (ae.getSource() == vistaClases.getBntNuevo()) {
            limpiar();
            nuevo();
        }else if (ae.getSource() == vistaClases.getBntBorrar()){
            borrar();
            cargarPrimerRegistro();
            cargarGrid(vistaClases.getTblClases());
        }        
        else if (ae.getSource() == vistaClases.getBntSalir()){
            vistaClases.dispose();
        }
                
    }
    
    public void limpiar(){
        txtCodigoClase.setText("");
        txtDescripcion.setText("");
    }
    
    public void nuevo(){
        try {
            clasesDAO.siguienteNumero(Clases);
            txtCodigoClase.setText(String.valueOf(Clases.getCodigoClase()) );
            txtDescripcion.setText(Clases.getDescripcion());
            txtDescripcion.requestFocus();
        } catch (Exception e) {
            Logger.getLogger(controlerClases.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void borrar(){
        Clases.setCodigoClase( Integer.valueOf(txtCodigoClase.getText()) );
        Clases.setDescripcion(txtDescripcion.getText());
        try {
            clasesDAO.borrar(Clases);
        } catch (SQLException ex) {
            Logger.getLogger(controlerClases.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addListener(){
        vistaClases.getBntNuevo().addActionListener(this);
        vistaClases.getBntGuardar().addActionListener(this);
        vistaClases.getBntBorrar().addActionListener(this);
        vistaClases.getBntSalir().addActionListener(this);
    }

    private void cargarPrimerRegistro() {
        try {
            clasesDAO.primerRegistro(Clases);
            txtCodigoClase.setText(String.valueOf(Clases.getCodigoClase()) );
            txtDescripcion.setText(Clases.getDescripcion());
        } catch (SQLException ex) {
            Logger.getLogger(controlerClases.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    


    private void guardar(){
        
        Clases.setCodigoClase(Integer.parseInt(vistaClases.getTxtCodigoClase().getText()) );
        Clases.setDescripcion(vistaClases.getTxtDescripcion().getText());
        try {
            clasesDAO.clasesDAO(Clases);
        } catch (SQLException ex) {
            Logger.getLogger(clasesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
 
    private void cargarGrid(JTable miTabla){
        String filtro = "";
        if (Integer.parseInt(txtCodigoClase.getText()) > 0 ){
            filtro = txtCodigoClase.getText();
        }
        // Definir modelo pero bloquear la edicion de celdas
        DefaultTableModel tablaModelo = new DefaultTableModel(){
            public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
        };
        miTabla.setModel(tablaModelo);
        tablaModelo.addColumn("No.");
        tablaModelo.addColumn("Descripcion");
        
        // controlar el ancho de las columas
        float nAncho = miTabla.getWidth();
        TableColumn tcCodigo = miTabla.getColumn("No.");
        TableColumn tcDescripcion = miTabla.getColumn("Descripcion");
        
        tcCodigo.setMaxWidth( (int)(nAncho * 0.20) );
        tcDescripcion.setMaxWidth( (int)(nAncho * 0.80) );        
        try {
            Object[] columna = new Object[2];
            ArrayList<modelClases> listaClases = new ArrayList<>();
            
            listaClases = clasesDAO.Registros(filtro);
            int numRegistros = listaClases.size();
            
            for (int i = 0; i < numRegistros; i++) {
                columna[0] = listaClases.get(i).getCodigoClase();
                columna[1] = listaClases.get(i).getDescripcion();
                tablaModelo.addRow(columna);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "error no se cargo nada");
        }
    }
    
    public void seleccionarRegistro (JTable miTabla){
        /*
        miTabla.addMouseListener(new java.awt.event.MouseAdapter() {
                 @Override
                 public void mouseClicked(MouseEvent e) {
                     int indice = miTabla.getSelectedRow();
                     String No = miTabla.getValueAt(indice, 0).toString();
                     String Descripcion = miTabla.getValueAt(indice, 1).toString();
                     
                     txtCodigoClase.setText(No);
                     txtDescripcion.setText(Descripcion);
                 }
         
         }
        );
        */
        
        miTabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Preguntar si han cambios 
        ListSelectionModel Seleccionada = miTabla.getSelectionModel();
        Seleccionada.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e) {
                //Ignore extra messages.
                if (e.getValueIsAdjusting()) return;

                ListSelectionModel lsm =
                    (ListSelectionModel)e.getSource();

                if (lsm.isSelectionEmpty()) {
                    //No se ha seleccionado fila
                } else {
                    int indice = lsm.getMinSelectionIndex();
                    String No = miTabla.getValueAt(indice, 0).toString();
                    String Descripcion = miTabla.getValueAt(indice, 1).toString();
                     
                    txtCodigoClase.setText(No);
                    txtDescripcion.setText(Descripcion);
                }
            }
        });
         
    }
    
    
}
