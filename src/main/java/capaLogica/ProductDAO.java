package capaLogica;

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
            String query = "INSERT INTO Producto (C_Descuento, C_Tipo_Producto, D_Nombre_Producto, M_Precio_Unitario) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setInt(1, codigoDescuento);
            statement.setInt(2, codigoTipoProducto);
            statement.setString(3, nombreProducto);
            statement.setDouble(4, precioUnitario);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para leer todos los productos
    public List<Product> obtenerProductos() {
        List<Product> productos = new ArrayList<>();
        try {
            String query = "SELECT C_Producto, C_Descuento, C_Tipo_Producto, D_Nombre_Producto, M_Precio_Unitario FROM Producto";
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int codigoProducto = resultSet.getInt("C_Producto");
                int codigoDescuento = resultSet.getInt("C_Descuento");
                int codigoTipoProducto = resultSet.getInt("C_Tipo_Producto");
                String nombreProducto = resultSet.getString("D_Nombre_Producto");
                double precioUnitario = resultSet.getDouble("M_Precio_Unitario");
                Product producto = new Product(codigoProducto, codigoDescuento, codigoTipoProducto, nombreProducto, precioUnitario);
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
            String query = "UPDATE Producto SET C_Descuento = ?, C_Tipo_Producto = ?, D_Nombre_Producto = ?, M_Precio_Unitario = ? WHERE C_Producto = ?";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setInt(1, codigoDescuento);
            statement.setInt(2, codigoTipoProducto);
            statement.setString(3, nombreProducto);
            statement.setDouble(4, precioUnitario);
            statement.setInt(5, codigoProducto);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar un producto
    public void eliminarProducto(int codigoProducto) {
        try {
            String query = "DELETE FROM Producto WHERE C_Producto = ?";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setInt(1, codigoProducto);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    }
