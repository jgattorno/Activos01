/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activosfijos.model;

/**
 *
 * @author jhsgattorno
 */
public class modelClases {
    int codigoClase ;
    String descripcion;
    
    public modelClases(){
        codigoClase = 0;
        descripcion = "";
    }

    public int getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(int codigoClase) {
        this.codigoClase = codigoClase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
