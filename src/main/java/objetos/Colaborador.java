/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Colaborador {
    private int c_colaborador;
    private int t_gefatura_directa;
    private int c_sucursal;
    private int c_salario;
    private int c_horas;
    private String d_nombre_colaborador;
    private boolean b_permiso_sin_salario;
    private String d_apellido_colaborador;
    private int c_puesto;

    public Colaborador(int c_colaborador, int t_gefatura_directa, int c_sucursal, int c_salario, int c_horas, String d_nombre_colaborador, boolean b_permiso_sin_salario, String d_apellido_colaborador, int c_puesto) {
        this.c_colaborador = c_colaborador;
        this.t_gefatura_directa = t_gefatura_directa;
        this.c_sucursal = c_sucursal;
        this.c_salario = c_salario;
        this.c_horas = c_horas;
        this.d_nombre_colaborador = d_nombre_colaborador;
        this.b_permiso_sin_salario = b_permiso_sin_salario;
        this.d_apellido_colaborador = d_apellido_colaborador;
        this.c_puesto = c_puesto;
    }

    public int getC_colaborador() {
        return c_colaborador;
    }

    public void setC_colaborador(int c_colaborador) {
        this.c_colaborador = c_colaborador;
    }

    public int getT_gefatura_directa() {
        return t_gefatura_directa;
    }

    public void setT_gefatura_directa(int t_gefatura_directa) {
        this.t_gefatura_directa = t_gefatura_directa;
    }

    public int getC_sucursal() {
        return c_sucursal;
    }

    public void setC_sucursal(int c_sucursal) {
        this.c_sucursal = c_sucursal;
    }

    public int getC_salario() {
        return c_salario;
    }

    public void setC_salario(int c_salario) {
        this.c_salario = c_salario;
    }

    public int getC_horas() {
        return c_horas;
    }

    public void setC_horas(int c_horas) {
        this.c_horas = c_horas;
    }

    public String getD_nombre_colaborador() {
        return d_nombre_colaborador;
    }

    public void setD_nombre_colaborador(String d_nombre_colaborador) {
        this.d_nombre_colaborador = d_nombre_colaborador;
    }

    public boolean isB_permiso_sin_salario() {
        return b_permiso_sin_salario;
    }

    public void setB_permiso_sin_salario(boolean b_permiso_sin_salario) {
        this.b_permiso_sin_salario = b_permiso_sin_salario;
    }

    public String getD_apellido_colaborador() {
        return d_apellido_colaborador;
    }

    public void setD_apellido_colaborador(String d_apellido_colaborador) {
        this.d_apellido_colaborador = d_apellido_colaborador;
    }

    public int getC_puesto() {
        return c_puesto;
    }

    public void setC_puesto(int c_puesto) {
        this.c_puesto = c_puesto;
    }

    @Override
    public String toString() {
        return "Colaborador{" + "c_colaborador=" + c_colaborador + ", t_gefatura_directa=" + t_gefatura_directa + ", c_sucursal=" + c_sucursal + ", c_salario=" + c_salario + ", c_horas=" + c_horas + ", d_nombre_colaborador=" + d_nombre_colaborador + ", b_permiso_sin_salario=" + b_permiso_sin_salario + ", d_apellido_colaborador=" + d_apellido_colaborador + ", c_puesto=" + c_puesto + '}';
    }
    
    
}
