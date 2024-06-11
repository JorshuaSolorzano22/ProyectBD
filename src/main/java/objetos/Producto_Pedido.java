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
    private int q_producto;
    private String selected;
    private int quantity;

    public Producto_Pedido(int codigoProducto, int c_pedido, int q_producto, String selected, int quantity) {
        this.codigoProducto = codigoProducto;
        this.c_pedido = c_pedido;
        this.q_producto = q_producto;
        this.selected = selected;
        this.quantity = quantity;
    }

    public Producto_Pedido(String selected, int quantity) {
        this.selected = selected;
        this.quantity = quantity;
    }

    public Producto_Pedido() {
        
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

    public int getQ_producto() {
        return q_producto;
    }

    public void setQ_producto(int q_producto) {
        this.q_producto = q_producto;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Producto_Pedido{" + "codigoProducto=" + codigoProducto + ", c_pedido=" + c_pedido + ", q_producto=" + q_producto + ", selected=" + selected + ", quantity=" + quantity + '}';
    }
    
    

    
    
}
