/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Servicio_Expres {
  private int c_expres; 
  private int d_direccion_entrega;
  private String f_valor;

    public Servicio_Expres(int c_expres, int d_direccion_entrega, String f_valor) {
        this.c_expres = c_expres;
        this.d_direccion_entrega = d_direccion_entrega;
        this.f_valor = f_valor;
    }

    public int getC_expres() {
        return c_expres;
    }

    public void setC_expres(int c_expres) {
        this.c_expres = c_expres;
    }

    public int getD_direccion_entrega() {
        return d_direccion_entrega;
    }

    public void setD_direccion_entrega(int d_direccion_entrega) {
        this.d_direccion_entrega = d_direccion_entrega;
    }

    public String getF_valor() {
        return f_valor;
    }

    public void setF_valor(String f_valor) {
        this.f_valor = f_valor;
    }

    @Override
    public String toString() {
        return "Servicio_Expres{" + "c_expres=" + c_expres + ", d_direccion_entrega=" + d_direccion_entrega + ", f_valor=" + f_valor + '}';
    }
  
  
}
