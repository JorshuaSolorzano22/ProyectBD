/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Bodega {
    private int codigo_bodega;
    private int cantidad_bodega;
    private String unidad_medida;
    private int codigo_sucursal;

    public Bodega(int codigo_bodega, int cantidad_bodega, String unidad_medida, int codigo_sucursal) {
        this.codigo_bodega = codigo_bodega;
        this.cantidad_bodega = cantidad_bodega;
        this.unidad_medida = unidad_medida;
        this.codigo_sucursal = codigo_sucursal;
    }

    public int getCodigo_bodega() {
        return codigo_bodega;
    }

    public void setCodigo_bodega(int codigo_bodega) {
        this.codigo_bodega = codigo_bodega;
    }

    public int getCantidad_bodega() {
        return cantidad_bodega;
    }

    public void setCantidad_bodega(int cantidad_bodega) {
        this.cantidad_bodega = cantidad_bodega;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public int getCodigo_sucursal() {
        return codigo_sucursal;
    }

    public void setCodigo_sucursal(int codigo_sucursal) {
        this.codigo_sucursal = codigo_sucursal;
    }

    @Override
    public String toString() {
        return "Bodega{" + "codigo_bodega=" + codigo_bodega + ", cantidad_bodega=" + cantidad_bodega + ", unidad_medida=" + unidad_medida + ", codigo_sucursal=" + codigo_sucursal + '}';
    }
    
    
}
