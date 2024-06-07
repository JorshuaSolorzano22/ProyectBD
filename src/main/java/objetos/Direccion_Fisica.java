/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Direccion_Fisica {
    
    private int c_direccion_fisica;
    private int c_distrito;
    private int canton;
    private int provincia;
    private String d_direccion_fisica;

    public Direccion_Fisica(int c_direccion_fisica, int c_distrito, int canton, int provincia, String d_direccion_fisica) {
        this.c_direccion_fisica = c_direccion_fisica;
        this.c_distrito = c_distrito;
        this.canton = canton;
        this.provincia = provincia;
        this.d_direccion_fisica = d_direccion_fisica;
    }

    public int getC_direccion_fisica() {
        return c_direccion_fisica;
    }

    public void setC_direccion_fisica(int c_direccion_fisica) {
        this.c_direccion_fisica = c_direccion_fisica;
    }

    public int getC_distrito() {
        return c_distrito;
    }

    public void setC_distrito(int c_distrito) {
        this.c_distrito = c_distrito;
    }

    public int getCanton() {
        return canton;
    }

    public void setCanton(int canton) {
        this.canton = canton;
    }

    public int getProvincia() {
        return provincia;
    }

    public void setProvincia(int provincia) {
        this.provincia = provincia;
    }

    public String getD_direccion_fisica() {
        return d_direccion_fisica;
    }

    public void setD_direccion_fisica(String d_direccion_fisica) {
        this.d_direccion_fisica = d_direccion_fisica;
    }

    @Override
    public String toString() {
        return "Direccion_Fisica{" + "c_direccion_fisica=" + c_direccion_fisica + ", c_distrito=" + c_distrito + ", canton=" + canton + ", provincia=" + provincia + ", d_direccion_fisica=" + d_direccion_fisica + '}';
    }
    
    
}
