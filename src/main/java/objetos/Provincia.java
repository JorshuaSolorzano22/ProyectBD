/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Provincia {
    private int c_provincia;
    private String nom_provincia;

    public Provincia(int c_provincia, String nom_provincia) {
        this.c_provincia = c_provincia;
        this.nom_provincia = nom_provincia;
    }

    public int getC_provincia() {
        return c_provincia;
    }

    public void setC_provincia(int c_provincia) {
        this.c_provincia = c_provincia;
    }

    public String getNom_provincia() {
        return nom_provincia;
    }

    public void setNom_provincia(String nom_provincia) {
        this.nom_provincia = nom_provincia;
    }

    @Override
    public String toString() {
        return "Provincia{" + "c_provincia=" + c_provincia + ", nom_provincia=" + nom_provincia + '}';
    }
    
    
}
