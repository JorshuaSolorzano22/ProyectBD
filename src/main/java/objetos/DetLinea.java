/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class DetLinea {
    private int c_det_linea;
    private int c_num_factura;
    private double m_precio_detalle_linea;
    private int cant_detalle_linea;
    private int n_total_linea;
    private String d_descr_det_linea;

    public DetLinea(int c_det_linea, int c_num_factura, double m_precio_detalle_linea, int cant_detalle_linea, int n_total_linea, String d_descr_det_linea) {
        this.c_det_linea = c_det_linea;
        this.c_num_factura = c_num_factura;
        this.m_precio_detalle_linea = m_precio_detalle_linea;
        this.cant_detalle_linea = cant_detalle_linea;
        this.n_total_linea = n_total_linea;
        this.d_descr_det_linea = d_descr_det_linea;
    }

    public int getC_det_linea() {
        return c_det_linea;
    }

    public void setC_det_linea(int c_det_linea) {
        this.c_det_linea = c_det_linea;
    }

    public int getC_num_factura() {
        return c_num_factura;
    }

    public void setC_num_factura(int c_num_factura) {
        this.c_num_factura = c_num_factura;
    }

    public double getM_precio_detalle_linea() {
        return m_precio_detalle_linea;
    }

    public void setM_precio_detalle_linea(double m_precio_detalle_linea) {
        this.m_precio_detalle_linea = m_precio_detalle_linea;
    }

    public int getCant_detalle_linea() {
        return cant_detalle_linea;
    }

    public void setCant_detalle_linea(int cant_detalle_linea) {
        this.cant_detalle_linea = cant_detalle_linea;
    }

    public int getN_total_linea() {
        return n_total_linea;
    }

    public void setN_total_linea(int n_total_linea) {
        this.n_total_linea = n_total_linea;
    }

    public String getD_descr_det_linea() {
        return d_descr_det_linea;
    }

    public void setD_descr_det_linea(String d_descr_det_linea) {
        this.d_descr_det_linea = d_descr_det_linea;
    }

    @Override
    public String toString() {
        return "DetLinea{" + "c_det_linea=" + c_det_linea + ", c_num_factura=" + c_num_factura + ", m_precio_detalle_linea=" + m_precio_detalle_linea + ", cant_detalle_linea=" + cant_detalle_linea + ", n_total_linea=" + n_total_linea + ", d_descr_det_linea=" + d_descr_det_linea + '}';
    }
    
    
}
