/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Pago {
    private int c_tipo_pago;
    private int codigo_administracion;
    private double m_monto_total;

    public Pago(int c_tipo_pago, int codigo_administracion, double m_monto_total) {
        this.c_tipo_pago = c_tipo_pago;
        this.codigo_administracion = codigo_administracion;
        this.m_monto_total = m_monto_total;
    }

    public int getC_tipo_pago() {
        return c_tipo_pago;
    }

    public void setC_tipo_pago(int c_tipo_pago) {
        this.c_tipo_pago = c_tipo_pago;
    }

    public int getCodigo_administracion() {
        return codigo_administracion;
    }

    public void setCodigo_administracion(int codigo_administracion) {
        this.codigo_administracion = codigo_administracion;
    }

    public double getM_monto_total() {
        return m_monto_total;
    }

    public void setM_monto_total(double m_monto_total) {
        this.m_monto_total = m_monto_total;
    }

    @Override
    public String toString() {
        return "Pago{" + "c_tipo_pago=" + c_tipo_pago + ", codigo_administracion=" + codigo_administracion + ", m_monto_total=" + m_monto_total + '}';
    }
    
    
}
