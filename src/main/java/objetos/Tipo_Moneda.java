/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Tipo_Moneda {
    private int c_moneda;
    private String d_tipo_moneda;
    private double m_tipo_cambio;

    public Tipo_Moneda(int c_moneda, String d_tipo_moneda, double m_tipo_cambio) {
        this.c_moneda = c_moneda;
        this.d_tipo_moneda = d_tipo_moneda;
        this.m_tipo_cambio = m_tipo_cambio;
    }

    public int getC_moneda() {
        return c_moneda;
    }

    public void setC_moneda(int c_moneda) {
        this.c_moneda = c_moneda;
    }

    public String getD_tipo_moneda() {
        return d_tipo_moneda;
    }

    public void setD_tipo_moneda(String d_tipo_moneda) {
        this.d_tipo_moneda = d_tipo_moneda;
    }

    public double getM_tipo_cambio() {
        return m_tipo_cambio;
    }

    public void setM_tipo_cambio(double m_tipo_cambio) {
        this.m_tipo_cambio = m_tipo_cambio;
    }

    @Override
    public String toString() {
        return "Tipo_Moneda{" + "c_moneda=" + c_moneda + ", d_tipo_moneda=" + d_tipo_moneda + ", m_tipo_cambio=" + m_tipo_cambio + '}';
    }
    
    
}
