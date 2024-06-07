/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Puesto {
    private int c_puesto;
    private String descr_puesto;

    public Puesto(int c_puesto, String descr_puesto) {
        this.c_puesto = c_puesto;
        this.descr_puesto = descr_puesto;
    }

    public int getC_puesto() {
        return c_puesto;
    }

    public void setC_puesto(int c_puesto) {
        this.c_puesto = c_puesto;
    }

    public String getDescr_puesto() {
        return descr_puesto;
    }

    public void setDescr_puesto(String descr_puesto) {
        this.descr_puesto = descr_puesto;
    }

    @Override
    public String toString() {
        return "Puesto{" + "c_puesto=" + c_puesto + ", descr_puesto=" + descr_puesto + '}';
    }
    
    
}
