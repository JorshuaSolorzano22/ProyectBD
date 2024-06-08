package capaLogica.Main;

import capaLogica.Conexion;
import objetos.Product;
import capaLogica.Products.ProductDAO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Obtener la conexión a la base de datos
        Conexion conexion = Conexion.getInstance();
        Connection connection = conexion.getConnection();

        CallableStatement cs = connection.prepareCall("EXEC select_products");

        cs.execute();

        ResultSet resultSet = cs.getResultSet();

        while (resultSet.next()) {
            String nombre = resultSet.getString("D_Nombre_Producto");
            int precio = resultSet.getInt("M_Precio_Unitario");

            System.out.println("Nombre: " + nombre);
            System.out.println("Precio: " + precio);
        }

        // Cerrar la conexión
        conexion.closeConnection();
    }
}