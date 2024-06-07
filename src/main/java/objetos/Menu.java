/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Menu {
    
    private int c_menu;
    private double precio_colones;
    private String tipo_producto;
    private String producto_menu;
    private int venta_individual;
    private int venta_combos;

    public Menu(int c_menu, double precio_colones, String tipo_producto, String producto_menu, int venta_individual, int venta_combos) {
        this.c_menu = c_menu;
        this.precio_colones = precio_colones;
        this.tipo_producto = tipo_producto;
        this.producto_menu = producto_menu;
        this.venta_individual = venta_individual;
        this.venta_combos = venta_combos;
    }

    public int getC_menu() {
        return c_menu;
    }

    public void setC_menu(int c_menu) {
        this.c_menu = c_menu;
    }

    public double getPrecio_colones() {
        return precio_colones;
    }

    public void setPrecio_colones(double precio_colones) {
        this.precio_colones = precio_colones;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public String getProducto_menu() {
        return producto_menu;
    }

    public void setProducto_menu(String producto_menu) {
        this.producto_menu = producto_menu;
    }

    public int getVenta_individual() {
        return venta_individual;
    }

    public void setVenta_individual(int venta_individual) {
        this.venta_individual = venta_individual;
    }

    public int getVenta_combos() {
        return venta_combos;
    }

    public void setVenta_combos(int venta_combos) {
        this.venta_combos = venta_combos;
    }

    @Override
    public String toString() {
        return "Menu{" + "c_menu=" + c_menu + ", precio_colones=" + precio_colones + ", tipo_producto=" + tipo_producto + ", producto_menu=" + producto_menu + ", venta_individual=" + venta_individual + ", venta_combos=" + venta_combos + '}';
    }
    
    
}
