/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Parametros {
    private int m_rango_uno;
    private int f_rango_dos;

    public Parametros(int m_rango_uno, int f_rango_dos) {
        this.m_rango_uno = m_rango_uno;
        this.f_rango_dos = f_rango_dos;
    }

    public int getM_rango_uno() {
        return m_rango_uno;
    }

    public void setM_rango_uno(int m_rango_uno) {
        this.m_rango_uno = m_rango_uno;
    }

    public int getF_rango_dos() {
        return f_rango_dos;
    }

    public void setF_rango_dos(int f_rango_dos) {
        this.f_rango_dos = f_rango_dos;
    }

    @Override
    public String toString() {
        return "Parametros{" + "m_rango_uno=" + m_rango_uno + ", f_rango_dos=" + f_rango_dos + '}';
    }
    
    
}
