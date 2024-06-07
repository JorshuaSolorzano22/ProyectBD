/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Combo {
    private int c_combo;
    private int c_menu;
    private String d_nom_combo;
    private double m_precio_combo;
    private boolean disponibilidad;
    private String d_combo;

    public Combo(int c_combo, int c_menu, String d_nom_combo, double m_precio_combo, boolean disponibilidad, String d_combo) {
        this.c_combo = c_combo;
        this.c_menu = c_menu;
        this.d_nom_combo = d_nom_combo;
        this.m_precio_combo = m_precio_combo;
        this.disponibilidad = disponibilidad;
        this.d_combo = d_combo;
    }

    public int getC_combo() {
        return c_combo;
    }

    public void setC_combo(int c_combo) {
        this.c_combo = c_combo;
    }

    public int getC_menu() {
        return c_menu;
    }

    public void setC_menu(int c_menu) {
        this.c_menu = c_menu;
    }

    public String getD_nom_combo() {
        return d_nom_combo;
    }

    public void setD_nom_combo(String d_nom_combo) {
        this.d_nom_combo = d_nom_combo;
    }

    public double getM_precio_combo() {
        return m_precio_combo;
    }

    public void setM_precio_combo(double m_precio_combo) {
        this.m_precio_combo = m_precio_combo;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getD_combo() {
        return d_combo;
    }

    public void setD_combo(String d_combo) {
        this.d_combo = d_combo;
    }

    @Override
    public String toString() {
        return "Combo{" + "c_combo=" + c_combo + ", c_menu=" + c_menu + ", d_nom_combo=" + d_nom_combo + ", m_precio_combo=" + m_precio_combo + ", disponibilidad=" + disponibilidad + ", d_combo=" + d_combo + '}';
    }
    
    
}
