/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica.Cliente;

import objetos.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private Connection conexion;

    public ClienteDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public void agregarCliente(int idCliente, String nombre, int telefono) throws SQLException {
        String sql = "{call sp_AgregarCliente(?, ?, ?)}";
        try (CallableStatement stmt = conexion.prepareCall(sql)) {
            stmt.setInt(1, idCliente);
            stmt.setString(2, nombre);
            stmt.setInt(3, telefono);
            stmt.executeUpdate();

        }
    }

    public void actualizarCliente(int idCliente, String nombre, int telefono) throws SQLException {
        String sql = "{call sp_ActualizarCliente(?, ?, ?)}";
        try (CallableStatement stmt = conexion.prepareCall(sql)) {
            stmt.setInt(1, idCliente);
            stmt.setString(2, nombre);
            stmt.setInt(3, telefono);
            stmt.executeUpdate();
        }
    }

    public void eliminarCliente(int idCliente) throws SQLException {
        String sql = "{call sp_EliminarCliente(?)}";
        try (CallableStatement stmt = conexion.prepareCall(sql)) {
            stmt.setInt(1, idCliente);
            stmt.executeUpdate();
        }
    }
    
    public List<Cliente> listaCliente() throws SQLException {
    List<Cliente> clientes = new ArrayList<>();
    String sql = "{call sp_ListarClientes()}";
    try (CallableStatement stmt = conexion.prepareCall(sql)) {
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            int idCliente = rs.getInt("idCliente");
            String nombre = rs.getString("nombre");
            int telefono = rs.getInt("telefono");
            Cliente cliente = new Cliente(idCliente, nombre, telefono);
            clientes.add(cliente);
        }
    }
    return clientes;
}

    public void AgregarCliente(int WIDTH) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void ActualizarCliente(int WIDTH) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void EliminarCliente(int WIDTH) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void ListaCliente(int WIDTH) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
