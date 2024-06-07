/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Producto_Pedido {
    private int codigoProducto;
    private int c_pedido;

    public Producto_Pedido(int codigoProducto, int c_pedido) {
        this.codigoProducto = codigoProducto;
        this.c_pedido = c_pedido;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getC_pedido() {
        return c_pedido;
    }

    public void setC_pedido(int c_pedido) {
        this.c_pedido = c_pedido;
    }

    @Override
    public String toString() {
        return "Producto_Pedido{" + "codigoProducto=" + codigoProducto + ", c_pedido=" + c_pedido + '}';
    }
    
    
}
