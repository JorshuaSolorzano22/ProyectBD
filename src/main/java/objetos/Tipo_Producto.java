/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Tipo_Producto {
   private int c_tipo_producto;
   private String d_tipo_producto;

    public Tipo_Producto(int c_tipo_producto, String d_tipo_producto) {
        this.c_tipo_producto = c_tipo_producto;
        this.d_tipo_producto = d_tipo_producto;
    }

    public int getC_tipo_producto() {
        return c_tipo_producto;
    }

    public void setC_tipo_producto(int c_tipo_producto) {
        this.c_tipo_producto = c_tipo_producto;
    }

    public String getD_tipo_producto() {
        return d_tipo_producto;
    }

    public void setD_tipo_producto(String d_tipo_producto) {
        this.d_tipo_producto = d_tipo_producto;
    }

    @Override
    public String toString() {
        return "Tipo_Producto{" + "c_tipo_producto=" + c_tipo_producto + ", d_tipo_producto=" + d_tipo_producto + '}';
    }
   
   
}
