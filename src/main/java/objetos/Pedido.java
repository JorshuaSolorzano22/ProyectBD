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
public class Pedido {
   private int c_pedido;
   private String d_num_mesa;
   private String d_observacion;
   private Date f_duracion_entrega_pedido;
   private Date f_inicio;
   private Date f_final;
   private Date f_duracion;
   private int c_sucursal;

    public Pedido(int c_pedido, String d_num_mesa, String d_observacion, Date f_duracion_entrega_pedido, Date f_inicio, Date f_final, Date f_duracion, int c_sucursal) {
        this.c_pedido = c_pedido;
        this.d_num_mesa = d_num_mesa;
        this.d_observacion = d_observacion;
        this.f_duracion_entrega_pedido = f_duracion_entrega_pedido;
        this.f_inicio = f_inicio;
        this.f_final = f_final;
        this.f_duracion = f_duracion;
        this.c_sucursal = c_sucursal;
    }

    public int getC_pedido() {
        return c_pedido;
    }

    public void setC_pedido(int c_pedido) {
        this.c_pedido = c_pedido;
    }

    public String getD_num_mesa() {
        return d_num_mesa;
    }

    public void setD_num_mesa(String d_num_mesa) {
        this.d_num_mesa = d_num_mesa;
    }

    public String getD_observacion() {
        return d_observacion;
    }

    public void setD_observacion(String d_observacion) {
        this.d_observacion = d_observacion;
    }

    public Date getF_duracion_entrega_pedido() {
        return f_duracion_entrega_pedido;
    }

    public void setF_duracion_entrega_pedido(Date f_duracion_entrega_pedido) {
        this.f_duracion_entrega_pedido = f_duracion_entrega_pedido;
    }

    public Date getF_inicio() {
        return f_inicio;
    }

    public void setF_inicio(Date f_inicio) {
        this.f_inicio = f_inicio;
    }

    public Date getF_final() {
        return f_final;
    }

    public void setF_final(Date f_final) {
        this.f_final = f_final;
    }

    public Date getF_duracion() {
        return f_duracion;
    }

    public void setF_duracion(Date f_duracion) {
        this.f_duracion = f_duracion;
    }

    public int getC_sucursal() {
        return c_sucursal;
    }

    public void setC_sucursal(int c_sucursal) {
        this.c_sucursal = c_sucursal;
    }

    @Override
    public String toString() {
        return "Pedido{" + "c_pedido=" + c_pedido + ", d_num_mesa=" + d_num_mesa + ", d_observacion=" + d_observacion + ", f_duracion_entrega_pedido=" + f_duracion_entrega_pedido + ", f_inicio=" + f_inicio + ", f_final=" + f_final + ", f_duracion=" + f_duracion + ", c_sucursal=" + c_sucursal + '}';
    }
   
   
}
