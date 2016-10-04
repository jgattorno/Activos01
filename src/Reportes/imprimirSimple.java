/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import ClaseConectar.Conexion;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author jhsgattorno
 */
public class imprimirSimple {
    
 
    public void imprimirClases(String reporteRuta) throws JRException, JRException{

        Conexion miConexion = new Conexion();
        Connection conectar = miConexion.getConexion();
        
        //JOptionPane.showMessageDialog(null, "si se ejecuta");
        //String ubicacion = "src/carnetizacion/reportes/prueba.jasper";
        
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObjectFromFile(reporteRuta);
        //reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\NetBeansProjects\\Activos\\src\\Reportes\\clases.jasper");
        
        JasperPrint imprimir;
        Map parametros = new HashMap();
        parametros.clear();
        imprimir = JasperFillManager.fillReport(reporte, null, conectar);
        JasperViewer.viewReport(imprimir, false);
        
    }

}
