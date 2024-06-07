/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Canton {
    private int codigo_canton;
    private String nombre_canton;

    public Canton(int codigo_canton, String nombre_canton) {
        this.codigo_canton = codigo_canton;
        this.nombre_canton = nombre_canton;
    }

    public int getCodigo_canton() {
        return codigo_canton;
    }

    public void setCodigo_canton(int codigo_canton) {
        this.codigo_canton = codigo_canton;
    }

    public String getNombre_canton() {
        return nombre_canton;
    }

    public void setNombre_canton(String nombre_canton) {
        this.nombre_canton = nombre_canton;
    }

    @Override
    public String toString() {
        return "Canton{" + "codigo_canton=" + codigo_canton + ", nombre_canton=" + nombre_canton + '}';
    }
    
    
}
