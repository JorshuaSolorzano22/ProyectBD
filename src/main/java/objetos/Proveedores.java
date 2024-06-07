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
public class Proveedores {
  private int c_proveedor;
  private String d_descr_proveedor;
  private Date f_dia_entrega;
  private double m_saldo_proveedor;
  private int c_telefono;
  private int c_sucursal;
  private int codigo_bodega;

    public Proveedores(int c_proveedor, String d_descr_proveedor, Date f_dia_entrega, double m_saldo_proveedor, int c_telefono, int c_sucursal, int codigo_bodega) {
        this.c_proveedor = c_proveedor;
        this.d_descr_proveedor = d_descr_proveedor;
        this.f_dia_entrega = f_dia_entrega;
        this.m_saldo_proveedor = m_saldo_proveedor;
        this.c_telefono = c_telefono;
        this.c_sucursal = c_sucursal;
        this.codigo_bodega = codigo_bodega;
    }

    public int getC_proveedor() {
        return c_proveedor;
    }

    public void setC_proveedor(int c_proveedor) {
        this.c_proveedor = c_proveedor;
    }

    public String getD_descr_proveedor() {
        return d_descr_proveedor;
    }

    public void setD_descr_proveedor(String d_descr_proveedor) {
        this.d_descr_proveedor = d_descr_proveedor;
    }

    public Date getF_dia_entrega() {
        return f_dia_entrega;
    }

    public void setF_dia_entrega(Date f_dia_entrega) {
        this.f_dia_entrega = f_dia_entrega;
    }

    public double getM_saldo_proveedor() {
        return m_saldo_proveedor;
    }

    public void setM_saldo_proveedor(double m_saldo_proveedor) {
        this.m_saldo_proveedor = m_saldo_proveedor;
    }

    public int getC_telefono() {
        return c_telefono;
    }

    public void setC_telefono(int c_telefono) {
        this.c_telefono = c_telefono;
    }

    public int getC_sucursal() {
        return c_sucursal;
    }

    public void setC_sucursal(int c_sucursal) {
        this.c_sucursal = c_sucursal;
    }

    public int getCodigo_bodega() {
        return codigo_bodega;
    }

    public void setCodigo_bodega(int codigo_bodega) {
        this.codigo_bodega = codigo_bodega;
    }

    @Override
    public String toString() {
        return "Proveedores{" + "c_proveedor=" + c_proveedor + ", d_descr_proveedor=" + d_descr_proveedor + ", f_dia_entrega=" + f_dia_entrega + ", m_saldo_proveedor=" + m_saldo_proveedor + ", c_telefono=" + c_telefono + ", c_sucursal=" + c_sucursal + ", codigo_bodega=" + codigo_bodega + '}';
    }
  
  
}
