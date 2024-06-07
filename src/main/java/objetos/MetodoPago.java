/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class MetodoPago {
    private int c_metodo_pago;
    private String d_metodo_pago;

    public MetodoPago(int c_metodo_pago, String d_metodo_pago) {
        this.c_metodo_pago = c_metodo_pago;
        this.d_metodo_pago = d_metodo_pago;
    }

    public int getC_metodo_pago() {
        return c_metodo_pago;
    }

    public void setC_metodo_pago(int c_metodo_pago) {
        this.c_metodo_pago = c_metodo_pago;
    }

    public String getD_metodo_pago() {
        return d_metodo_pago;
    }

    public void setD_metodo_pago(String d_metodo_pago) {
        this.d_metodo_pago = d_metodo_pago;
    }

    @Override
    public String toString() {
        return "MetodoPago{" + "c_metodo_pago=" + c_metodo_pago + ", d_metodo_pago=" + d_metodo_pago + '}';
    }
    
    
}
