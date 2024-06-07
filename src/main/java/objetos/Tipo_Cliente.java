/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Tipo_Cliente {
    private int c_tipo_cliente;
    private String d_tipo_cliente;

    public Tipo_Cliente(int c_tipo_cliente, String d_tipo_cliente) {
        this.c_tipo_cliente = c_tipo_cliente;
        this.d_tipo_cliente = d_tipo_cliente;
    }

    public int getC_tipo_cliente() {
        return c_tipo_cliente;
    }

    public void setC_tipo_cliente(int c_tipo_cliente) {
        this.c_tipo_cliente = c_tipo_cliente;
    }

    public String getD_tipo_cliente() {
        return d_tipo_cliente;
    }

    public void setD_tipo_cliente(String d_tipo_cliente) {
        this.d_tipo_cliente = d_tipo_cliente;
    }

    @Override
    public String toString() {
        return "Tipo_Cliente{" + "c_tipo_cliente=" + c_tipo_cliente + ", d_tipo_cliente=" + d_tipo_cliente + '}';
    }
    
    
}
