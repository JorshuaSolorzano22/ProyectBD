package capaLogica.Products;

import objetos.Product;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private Connection conexion;

    public ProductDAO(Connection conexion) {
        this.conexion = conexion;
    }

    // Método para crear un nuevo producto
public void crearProducto(int codigoDescuento, int codigoTipoProducto, String nombreProducto, double precioUnitario) {
    try {
        String query = "{CALL CrearProducto(?, ?, ?, ?)}";
        CallableStatement statement = conexion.prepareCall(query);
        statement.setInt(1, codigoDescuento);
        statement.setInt(2, codigoTipoProducto);
        statement.setString(3, nombreProducto);
        statement.setDouble(4, precioUnitario);
        statement.execute();
        statement.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


    // Método para leer todos los productos
public List<Product> obtenerProductos() {
    List<Product> productos = new ArrayList<>();
    try {
        String query = "{CALL ObtenerProductos}";
        CallableStatement statement = conexion.prepareCall(query);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            int codigoProducto = resultSet.getInt("C_Producto");
            int codigoDescuento = resultSet.getInt("C_Descuento");
            int codigoTipoProducto = resultSet.getInt("C_Tipo_Producto");
            String nombreProducto = resultSet.getString("D_Nombre_Producto");
            double precioUnitario = resultSet.getDouble("M_Precio_Unitario");
            int codigo_bodega = resultSet.getInt("C_Bodega");
            Product producto = new Product(codigoProducto, codigoDescuento, codigoTipoProducto, nombreProducto, precioUnitario, codigo_bodega);
            productos.add(producto);
        }

        resultSet.close();
        statement.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return productos;
}


    // Método para actualizar un producto existente
public void actualizarProducto(int codigoProducto, int codigoDescuento, int codigoTipoProducto, String nombreProducto, double precioUnitario) {
    try {
        String query = "{CALL ActualizarProducto(?, ?, ?, ?, ?)}";
        CallableStatement statement = conexion.prepareCall(query);
        statement.setInt(1, codigoProducto);
        statement.setInt(2, codigoDescuento);
        statement.setInt(3, codigoTipoProducto);
        statement.setString(4, nombreProducto);
        statement.setDouble(5, precioUnitario);
        statement.execute();
        statement.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


    // Método para eliminar un producto
public void eliminarProducto(int codigoProducto) {
    try {
        String query = "{CALL EliminarProducto(?)}";
        CallableStatement statement = conexion.prepareCall(query);
        statement.setInt(1, codigoProducto);
        statement.execute();
        statement.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}



    }
