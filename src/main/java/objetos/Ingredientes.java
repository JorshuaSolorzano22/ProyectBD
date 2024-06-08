/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Ingredientes {
    private int c_ingrediente;
    private int codigo_producto;
    private int C_Producto_En_Bodega;
    private String d_nombre_ingrediente;
    private double m_precio_unitario;

    public Ingredientes(int c_ingrediente, int codigo_producto, int codigo_bodega, String d_nombre_ingrediente, double m_precio_unitario) {
        this.c_ingrediente = c_ingrediente;
        this.codigo_producto = codigo_producto;
        this.C_Producto_En_Bodega = codigo_bodega;
        this.d_nombre_ingrediente = d_nombre_ingrediente;
        this.m_precio_unitario = m_precio_unitario;
    }

    public int getC_ingrediente() {
        return c_ingrediente;
    }

    public void setC_ingrediente(int c_ingrediente) {
        this.c_ingrediente = c_ingrediente;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public int getCodigo_bodega() {
        return C_Producto_En_Bodega;
    }

    public void setCodigo_bodega(int codigo_bodega) {
        this.C_Producto_En_Bodega = codigo_bodega;
    }

    public String getD_nombre_ingrediente() {
        return d_nombre_ingrediente;
    }

    public void setD_nombre_ingrediente(String d_nombre_ingrediente) {
        this.d_nombre_ingrediente = d_nombre_ingrediente;
    }

    public double getM_precio_unitario() {
        return m_precio_unitario;
    }

    public void setM_precio_unitario(double m_precio_unitario) {
        this.m_precio_unitario = m_precio_unitario;
    }

    @Override
    public String toString() {
        return "Ingredientes{" + "c_ingrediente=" + c_ingrediente + ", codigo_producto=" + codigo_producto + ", codigo_bodega=" + C_Producto_En_Bodega + ", d_nombre_ingrediente=" + d_nombre_ingrediente + ", m_precio_unitario=" + m_precio_unitario + '}';
    }
   
    
}
