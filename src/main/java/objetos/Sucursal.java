/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Sucursal {
    private int c_sucursal;
    private String d_descripcion;
    private String d_nom_sucursal;
    private int c_direccion_fisica;

    public Sucursal(int c_sucursal, String d_descripcion, String d_nom_sucursal, int c_direccion_fisica) {
        this.c_sucursal = c_sucursal;
        this.d_descripcion = d_descripcion;
        this.d_nom_sucursal = d_nom_sucursal;
        this.c_direccion_fisica = c_direccion_fisica;
    }

    public int getC_sucursal() {
        return c_sucursal;
    }

    public void setC_sucursal(int c_sucursal) {
        this.c_sucursal = c_sucursal;
    }

    public String getD_descripcion() {
        return d_descripcion;
    }

    public void setD_descripcion(String d_descripcion) {
        this.d_descripcion = d_descripcion;
    }

    public String getD_nom_sucursal() {
        return d_nom_sucursal;
    }

    public void setD_nom_sucursal(String d_nom_sucursal) {
        this.d_nom_sucursal = d_nom_sucursal;
    }

    public int getC_direccion_fisica() {
        return c_direccion_fisica;
    }

    public void setC_direccion_fisica(int c_direccion_fisica) {
        this.c_direccion_fisica = c_direccion_fisica;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "c_sucursal=" + c_sucursal + ", d_descripcion=" + d_descripcion + ", d_nom_sucursal=" + d_nom_sucursal + ", c_direccion_fisica=" + c_direccion_fisica + '}';
    }
    
    
}
