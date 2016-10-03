SELECT (codigoproveedor || Repeat(' ',7) || nombreempresa) As Proveedor, '*' AS Orden 
 FROM proveedores  
 WHERE codigoproveedor = '14       ' 
UNION 
SELECT (codigoproveedor || Repeat(' ',7) || nombreempresa) As Proveedor, '' AS Orden 
 FROM proveedores  
 WHERE codigoproveedor != '14       ' 
 ORDER BY 2 DESC, 1  