/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objetos;

/**
 *
 * @author juan
 */
public class clases_activos {
    private int prpclase_id;
    private String prpDescripcion;
    
    public clases_activos() {}
    
    public clases_activos( int clase_id, String descripcion ) {
    
        setPrpclase_id(clase_id);
        setPrpDescripcion(descripcion);  
    
    } // Fin del constructor clases_activos

    /**
     * @return the prpclase_id
     */
    public int getPrpclase_id() {
        return prpclase_id;
    }

    /**
     * @param prpclase_id the prpclase_id to set
     */
    public void setPrpclase_id(int prpclase_id) {
        this.prpclase_id = prpclase_id;
    }

    /**
     * @return the prpDescripcion
     */
    public String getPrpDescripcion() {
        return prpDescripcion;
    }

    /**
     * @param prpDescripcion the prpDescripcion to set
     */
    public void setPrpDescripcion(String prpDescripcion) {
        this.prpDescripcion = prpDescripcion;
    }
    
} // fin de la definicion de personas

