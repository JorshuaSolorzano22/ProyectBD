/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Producto_Menu {
    private int codigoProducto;
    private int c_menu;

    public Producto_Menu(int codigoProducto, int c_menu) {
        this.codigoProducto = codigoProducto;
        this.c_menu = c_menu;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getC_menu() {
        return c_menu;
    }

    public void setC_menu(int c_menu) {
        this.c_menu = c_menu;
    }

    @Override
    public String toString() {
        return "Producto_Menu{" + "codigoProducto=" + codigoProducto + ", c_menu=" + c_menu + '}';
    }
    
    
}
