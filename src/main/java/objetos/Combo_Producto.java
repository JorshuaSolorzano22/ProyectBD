/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Combo_Producto {
    
    private int c_combo;
    private int c_producto;

    public Combo_Producto(int c_combo, int c_producto) {
        this.c_combo = c_combo;
        this.c_producto = c_producto;
    }

    public int getC_combo() {
        return c_combo;
    }

    public void setC_combo(int c_combo) {
        this.c_combo = c_combo;
    }

    public int getC_producto() {
        return c_producto;
    }

    public void setC_producto(int c_producto) {
        this.c_producto = c_producto;
    }

    @Override
    public String toString() {
        return "Combo_Producto{" + "c_combo=" + c_combo + ", c_producto=" + c_producto + '}';
    }
    
    
}
