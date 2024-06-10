/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author cesar
 */
public class Producto_Ingrediente {
    private int codigoProducto;
    private int c_ingrediente;

    public Producto_Ingrediente(int codigoProducto, int C_Ingrediente) {
        this.codigoProducto = codigoProducto;
        this.c_ingrediente = C_Ingrediente;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getC_Ingrediente() {
        return c_ingrediente;
    }

    public void setC_Ingrediente(int C_Ingrediente) {
        this.c_ingrediente = C_Ingrediente;
    }

    @Override
    public String toString() {
        return "Producto_Ingrediente{" + "codigoProducto=" + codigoProducto + ", C_Ingrediente=" + c_ingrediente + '}';
    }
    
    
}
