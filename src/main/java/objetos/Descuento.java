/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Descuento {
    private int c_descuento;
    private String d_descr_descuento;
    private int c_cantidad_descuento;

    public Descuento(int c_descuento, String d_descr_descuento, int c_cantidad_descuento) {
        this.c_descuento = c_descuento;
        this.d_descr_descuento = d_descr_descuento;
        this.c_cantidad_descuento = c_cantidad_descuento;
    }

    public int getC_descuento() {
        return c_descuento;
    }

    public void setC_descuento(int c_descuento) {
        this.c_descuento = c_descuento;
    }

    public String getD_descr_descuento() {
        return d_descr_descuento;
    }

    public void setD_descr_descuento(String d_descr_descuento) {
        this.d_descr_descuento = d_descr_descuento;
    }

    public int getC_cantidad_descuento() {
        return c_cantidad_descuento;
    }

    public void setC_cantidad_descuento(int c_cantidad_descuento) {
        this.c_cantidad_descuento = c_cantidad_descuento;
    }

    @Override
    public String toString() {
        return "Descuento{" + "c_descuento=" + c_descuento + ", d_descr_descuento=" + d_descr_descuento + ", c_cantidad_descuento=" + c_cantidad_descuento + '}';
    }
    
    
}
