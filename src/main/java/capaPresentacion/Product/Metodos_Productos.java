/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaPresentacion.Product;

import capaLogica.Conexion;
import java.sql.CallableStatement;
import objetos.Product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author cesar
 */
public class Metodos_Productos {

    Conexion conexion = Conexion.getInstance();
    Connection connection = conexion.getConnection();
    ArrayList<Product> productos = new ArrayList<>();

    public ArrayList<Product> cargarObjProduc(ArrayList<Product> productos) throws SQLException {
        
        CallableStatement cs = connection.prepareCall("EXEC select_products");

        cs.execute();

        ResultSet resultSet = cs.getResultSet();

        while (resultSet.next()) {
            Product producto = new Product();

            producto.setCodigoProducto(resultSet.getInt("C_Producto"));
            producto.setNombreProducto(resultSet.getString("D_Nombre_Producto"));
            producto.setPrecioUnitario(resultSet.getDouble("M_Precio_Unitario"));
            producto.setCodigoTipoProducto(resultSet.getInt("C_Tipo_Producto"));
            producto.setCodigo_bodega(resultSet.getInt("C_Producto_En_Bodega"));
            producto.setCodigoDescuento(resultSet.getInt("C_Descuento"));

            productos.add(producto);
        }

        conexion.closeConnection();
        return productos;
    }
    
}