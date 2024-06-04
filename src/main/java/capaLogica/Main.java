package capaLogica;

import capaLogica.Conexion;
import capaLogica.Product;
import capaLogica.ProductDAO;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Obtener la conexión a la base de datos
        Conexion conexion = Conexion.getInstance();
        Connection connection = conexion.getConnection();

        // Crear una instancia de ProductDAO
        ProductDAO productDAO = new ProductDAO(connection);

        // Crear un nuevo producto
        productDAO.crearProducto(1, 1, "Hamburguesa Doble", 25.99);

        // Obtener todos los productos
        List<Product> productos = productDAO.obtenerProductos();
        for (Product producto : productos) {
            System.out.println("Código: " + producto.getCodigoProducto());
            System.out.println("Nombre: " + producto.getNombreProducto());
            System.out.println("Precio: " + producto.getPrecioUnitario());
            System.out.println("Categoría: " + producto.getCodigoTipoProducto());
            System.out.println("---");
        }

        // Actualizar un producto
        productDAO.actualizarProducto(1, 2, 2, "Hamburguesa Súper Doble", 29.99);

        // Eliminar un producto
        productDAO.eliminarProducto(1);

        // Cerrar la conexión
        conexion.closeConnection();
    }
}