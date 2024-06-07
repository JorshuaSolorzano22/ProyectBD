/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Telefono {
    private int c_telefono;
    private String d_num_telefono;
    private String d_cod_pais;

    public Telefono(int c_telefono, String d_num_telefono, String d_cod_pais) {
        this.c_telefono = c_telefono;
        this.d_num_telefono = d_num_telefono;
        this.d_cod_pais = d_cod_pais;
    }

    public int getC_telefono() {
        return c_telefono;
    }

    public void setC_telefono(int c_telefono) {
        this.c_telefono = c_telefono;
    }

    public String getD_num_telefono() {
        return d_num_telefono;
    }

    public void setD_num_telefono(String d_num_telefono) {
        this.d_num_telefono = d_num_telefono;
    }

    public String getD_cod_pais() {
        return d_cod_pais;
    }

    public void setD_cod_pais(String d_cod_pais) {
        this.d_cod_pais = d_cod_pais;
    }

    @Override
    public String toString() {
        return "Telefono{" + "c_telefono=" + c_telefono + ", d_num_telefono=" + d_num_telefono + ", d_cod_pais=" + d_cod_pais + '}';
    }
    
    
}
