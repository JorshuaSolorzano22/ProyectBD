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
public class Horas_Laburadas {
    private int c_horas;
    private int cant_hora_extra;
    private int cant_hora_normal;
    private Date f_fecha;

    public Horas_Laburadas(int c_horas, int cant_hora_extra, int cant_hora_normal, Date f_fecha) {
        this.c_horas = c_horas;
        this.cant_hora_extra = cant_hora_extra;
        this.cant_hora_normal = cant_hora_normal;
        this.f_fecha = f_fecha;
    }

    public int getC_horas() {
        return c_horas;
    }

    public void setC_horas(int c_horas) {
        this.c_horas = c_horas;
    }

    public int getCant_hora_extra() {
        return cant_hora_extra;
    }

    public void setCant_hora_extra(int cant_hora_extra) {
        this.cant_hora_extra = cant_hora_extra;
    }

    public int getCant_hora_normal() {
        return cant_hora_normal;
    }

    public void setCant_hora_normal(int cant_hora_normal) {
        this.cant_hora_normal = cant_hora_normal;
    }

    public Date getF_fecha() {
        return f_fecha;
    }

    public void setF_fecha(Date f_fecha) {
        this.f_fecha = f_fecha;
    }

    @Override
    public String toString() {
        return "Horas_Laburadas{" + "c_horas=" + c_horas + ", cant_hora_extra=" + cant_hora_extra + ", cant_hora_normal=" + cant_hora_normal + ", f_fecha=" + f_fecha + '}';
    }
    
    
}

