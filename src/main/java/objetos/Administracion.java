/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Administracion {
    private int codigo_administracion;
    private double cierre_caja;
    private double apertura_caja;
    private double balance_resultados;

    public Administracion(int codigo_administracion, double cierre_caja, double apertura_caja, double balance_resultados) {
        this.codigo_administracion = codigo_administracion;
        this.cierre_caja = cierre_caja;
        this.apertura_caja = apertura_caja;
        this.balance_resultados = balance_resultados;
    }

    public int getCodigo_administracion() {
        return codigo_administracion;
    }

    public void setCodigo_administracion(int codigo_administracion) {
        this.codigo_administracion = codigo_administracion;
    }

    public double getCierre_caja() {
        return cierre_caja;
    }

    public void setCierre_caja(double cierre_caja) {
        this.cierre_caja = cierre_caja;
    }

    public double getApertura_caja() {
        return apertura_caja;
    }

    public void setApertura_caja(double apertura_caja) {
        this.apertura_caja = apertura_caja;
    }

    public double getBalance_resultados() {
        return balance_resultados;
    }

    public void setBalance_resultados(double balance_resultados) {
        this.balance_resultados = balance_resultados;
    }

    @Override
    public String toString() {
        return "Administracion{" + "codigo_administracion=" + codigo_administracion + ", cierre_caja=" + cierre_caja + ", apertura_caja=" + apertura_caja + ", balance_resultados=" + balance_resultados + '}';
    }
    
   
}
