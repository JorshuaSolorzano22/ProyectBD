/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Tipo_Pago {
    private int c_tipo_pago;
    private String d_tipo_cambio;

    public Tipo_Pago(int c_tipo_pago, String d_tipo_cambio) {
        this.c_tipo_pago = c_tipo_pago;
        this.d_tipo_cambio = d_tipo_cambio;
    }

    public int getC_tipo_pago() {
        return c_tipo_pago;
    }

    public void setC_tipo_pago(int c_tipo_pago) {
        this.c_tipo_pago = c_tipo_pago;
    }

    public String getD_tipo_cambio() {
        return d_tipo_cambio;
    }

    public void setD_tipo_cambio(String d_tipo_cambio) {
        this.d_tipo_cambio = d_tipo_cambio;
    }

    @Override
    public String toString() {
        return "Tipo_Pago{" + "c_tipo_pago=" + c_tipo_pago + ", d_tipo_cambio=" + d_tipo_cambio + '}';
    }
    
    
}
