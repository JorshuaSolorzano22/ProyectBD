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
public class Cliente {
    private int c_cliente;
    private int c_distrito;
    private int c_telefono;
    private String nombre_cliente;
    private Date f_visita;
    private boolean b_cliente_frecuente;
    private String d_direccion_entrega;
    private int c_tipo_cliente;
    private int c_direccion_fisica;

    public Cliente(int c_cliente, int c_distrito, int c_telefono, String nombre_cliente, Date f_visita, boolean b_cliente_frecuente, String d_direccion_entrega, int c_tipo_cliente, int c_direccion_fisica) {
        this.c_cliente = c_cliente;
        this.c_distrito = c_distrito;
        this.c_telefono = c_telefono;
        this.nombre_cliente = nombre_cliente;
        this.f_visita = f_visita;
        this.b_cliente_frecuente = b_cliente_frecuente;
        this.d_direccion_entrega = d_direccion_entrega;
        this.c_tipo_cliente = c_tipo_cliente;
        this.c_direccion_fisica = c_direccion_fisica;
    }

    public int getC_cliente() {
        return c_cliente;
    }

    public void setC_cliente(int c_cliente) {
        this.c_cliente = c_cliente;
    }

    public int getC_distrito() {
        return c_distrito;
    }

    public void setC_distrito(int c_distrito) {
        this.c_distrito = c_distrito;
    }

    public int getC_telefono() {
        return c_telefono;
    }

    public void setC_telefono(int c_telefono) {
        this.c_telefono = c_telefono;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public Date getF_visita() {
        return f_visita;
    }

    public void setF_visita(Date f_visita) {
        this.f_visita = f_visita;
    }

    public boolean isB_cliente_frecuente() {
        return b_cliente_frecuente;
    }

    public void setB_cliente_frecuente(boolean b_cliente_frecuente) {
        this.b_cliente_frecuente = b_cliente_frecuente;
    }

    public String getD_direccion_entrega() {
        return d_direccion_entrega;
    }

    public void setD_direccion_entrega(String d_direccion_entrega) {
        this.d_direccion_entrega = d_direccion_entrega;
    }

    public int getC_tipo_cliente() {
        return c_tipo_cliente;
    }

    public void setC_tipo_cliente(int c_tipo_cliente) {
        this.c_tipo_cliente = c_tipo_cliente;
    }

    public int getC_direccion_fisica() {
        return c_direccion_fisica;
    }

    public void setC_direccion_fisica(int c_direccion_fisica) {
        this.c_direccion_fisica = c_direccion_fisica;
    }

    @Override
    public String toString() {
        return "Cliente{" + "c_cliente=" + c_cliente + ", c_distrito=" + c_distrito + ", c_telefono=" + c_telefono + ", nombre_cliente=" + nombre_cliente + ", f_visita=" + f_visita + ", b_cliente_frecuente=" + b_cliente_frecuente + ", d_direccion_entrega=" + d_direccion_entrega + ", c_tipo_cliente=" + c_tipo_cliente + ", c_direccion_fisica=" + c_direccion_fisica + '}';
    }
    
            
}
