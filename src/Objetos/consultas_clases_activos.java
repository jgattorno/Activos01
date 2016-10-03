/*
   - Clase para la consulta de datos de activos
   - Incluye instrucciones para guardar los datos de la clase.

 */

package Objetos;

/**
 *
 * @author Jaime Sierra Gattorn y Juan Carlos Melara
 */

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import ClaseConectar.Conectar;


public class consultas_clases_activos { 
 
    Conectar nConexion = new Conectar();
    private PreparedStatement todasLasClases = null;
    private PreparedStatement guardarClase = null;
    
    public consultas_clases_activos()
    {
    // Crear una consulta que regrese el contenido de la tabla
    try
    {
        todasLasClases = nConexion.conexion.prepareStatement("SELECT * FROM clases_activos ");
        guardarClase = nConexion.conexion.prepareStatement("INSERT INTO clases_activos " +
                        " (clase_id, descripcion)" +
                        " VALUES (?, ?)") ;
        
    } catch (SQLException excepcionSql) {
        excepcionSql.printStackTrace();
        System.exit(1);
    }
    } // Fin del constructor consultar activos
    
    // Seleccionar todos los datos
    public List< clases_activos > gettodasLasClases() 
    {
        List< clases_activos > resultados = null;
        ResultSet conjuntoResultados = null;
        
        try {
            // Seleccionar todas las clases
            conjuntoResultados = todasLasClases.executeQuery();
            resultados = new ArrayList< clases_activos >();
            
            while ( conjuntoResultados.next())
            {
                resultados.add(new clases_activos 
                    (
                        conjuntoResultados.getInt("Prpclase_id"),
                        conjuntoResultados.getString("PrpDescripcion")
                    )
                ) ;
            }
            
        } catch ( SQLException excepcionSql) 
        {
            excepcionSql.printStackTrace();
            
        
        }
        nConexion.desconectar();
    
        return resultados;
    } // fin del metodo gettodasLasClases
    
    
    
    
}
