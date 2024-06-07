/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Distrito {
    private int c_distrito;
    private String d_nom_distrito;

    public Distrito(int c_distrito, String d_nom_distrito) {
        this.c_distrito = c_distrito;
        this.d_nom_distrito = d_nom_distrito;
    }

    public int getC_distrito() {
        return c_distrito;
    }

    public void setC_distrito(int c_distrito) {
        this.c_distrito = c_distrito;
    }

    public String getD_nom_distrito() {
        return d_nom_distrito;
    }

    public void setD_nom_distrito(String d_nom_distrito) {
        this.d_nom_distrito = d_nom_distrito;
    }

    @Override
    public String toString() {
        return "Distrito{" + "c_distrito=" + c_distrito + ", d_nom_distrito=" + d_nom_distrito + '}';
    }
    
    
}
