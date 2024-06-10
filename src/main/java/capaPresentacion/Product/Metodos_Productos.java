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
import objetos.Tipo_Producto;

/**
 *
 * @author cesar
 */
public class Metodos_Productos {

    Conexion conexion = Conexion.getInstance();
    Connection connection = conexion.getConnection();

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

        //conexion.closeConnection();
        return productos;
    }

    public ArrayList<Tipo_Producto> cargarObjTipoProduc(ArrayList<Tipo_Producto> productos) throws SQLException {

        CallableStatement cs = connection.prepareCall("EXEC select_tipo_product");

        cs.execute();

        ResultSet resultSet = cs.getResultSet();

        while (resultSet.next()) {
            Tipo_Producto tipo_producto = new Tipo_Producto();

            tipo_producto.setC_tipo_producto(resultSet.getInt("C_Tipo_Producto"));
            tipo_producto.setD_tipo_producto(resultSet.getString("D_Tipo_Producto"));

            productos.add(tipo_producto);
        }

        //conexion.closeConnection();
        return productos;
    }

    public void crearProduct(int ID, int tipo, String nombre, double precio, int codigoBodega, String descuento) throws SQLException {

        CallableStatement cs = connection.prepareCall("EXEC create_product "
                + "@ID = " + ID + ","
                + "@Tipo_producto = " + tipo + ","
                + "@Nombre_Producto = '" + nombre + "',"
                + "@Precio_Unitario = " + precio + ","
                + "@Codigo_En_Bodega = " + codigoBodega + ","
                + "@Descuento = " + descuento + ";");

        cs.execute();
    }

    public void crearTipoProduct(int ID, String nombre) throws SQLException {

        CallableStatement cs = connection.prepareCall("EXEC create_tipo_product "
                + "@tipo_Producto = " + ID + ","
                + "@d_Tipo_Producto = '" + nombre + "';");

        cs.execute();
    }

    public void deleteProduct(int ID) throws SQLException {

        CallableStatement cs = connection.prepareCall("EXEC delete_product "
                + "@ID = " + ID + ";");

        cs.execute();
    }

    public void deleteTipoProduct(int ID) throws SQLException {

        CallableStatement cs = connection.prepareCall("EXEC delete_Tipo_producto "
                + "@ID = " + ID + ";");

        cs.execute();
    }

}
