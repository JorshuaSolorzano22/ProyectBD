/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.sql.Date;

/**
 *
 * @author solor
 */
public class Factura {
    private int c_num_factura;
    private int c_moneda;
    private int c_metodo_pago;
    private int c_cliente;
    private Date f_fecha_factura;
    private double m_precio_total;
    private double m_impuesto_venta;
    private int c_sucursal;

    public Factura(int c_num_factura, int c_moneda, int c_metodo_pago, int c_cliente, Date f_fecha_factura, double m_precio_total, double m_impuesto_venta, int c_sucursal) {
        this.c_num_factura = c_num_factura;
        this.c_moneda = c_moneda;
        this.c_metodo_pago = c_metodo_pago;
        this.c_cliente = c_cliente;
        this.f_fecha_factura = f_fecha_factura;
        this.m_precio_total = m_precio_total;
        this.m_impuesto_venta = m_impuesto_venta;
        this.c_sucursal = c_sucursal;
    }

    public int getC_num_factura() {
        return c_num_factura;
    }

    public void setC_num_factura(int c_num_factura) {
        this.c_num_factura = c_num_factura;
    }

    public int getC_moneda() {
        return c_moneda;
    }

    public void setC_moneda(int c_moneda) {
        this.c_moneda = c_moneda;
    }

    public int getC_metodo_pago() {
        return c_metodo_pago;
    }

    public void setC_metodo_pago(int c_metodo_pago) {
        this.c_metodo_pago = c_metodo_pago;
    }

    public int getC_cliente() {
        return c_cliente;
    }

    public void setC_cliente(int c_cliente) {
        this.c_cliente = c_cliente;
    }

    public Date getF_fecha_factura() {
        return f_fecha_factura;
    }

    public void setF_fecha_factura(Date f_fecha_factura) {
        this.f_fecha_factura = f_fecha_factura;
    }

    public double getM_precio_total() {
        return m_precio_total;
    }

    public void setM_precio_total(double m_precio_total) {
        this.m_precio_total = m_precio_total;
    }

    public double getM_impuesto_venta() {
        return m_impuesto_venta;
    }

    public void setM_impuesto_venta(double m_impuesto_venta) {
        this.m_impuesto_venta = m_impuesto_venta;
    }

    public int getC_sucursal() {
        return c_sucursal;
    }

    public void setC_sucursal(int c_sucursal) {
        this.c_sucursal = c_sucursal;
    }

    @Override
    public String toString() {
        return "Factura{" + "c_num_factura=" + c_num_factura + ", c_moneda=" + c_moneda + ", c_metodo_pago=" + c_metodo_pago + ", c_cliente=" + c_cliente + ", f_fecha_factura=" + f_fecha_factura + ", m_precio_total=" + m_precio_total + ", m_impuesto_venta=" + m_impuesto_venta + ", c_sucursal=" + c_sucursal + '}';
    }
    
    
}
