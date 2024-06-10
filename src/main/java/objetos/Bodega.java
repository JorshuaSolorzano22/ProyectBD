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
    private int C_Producto_En_Bodega;
    private int cantidad_bodega;
    private String unidad_medida;
    private int codigo_sucursal;
    private int N_Bodega;

    public Bodega() {
    }

    public Bodega(int C_Producto_En_Bodega, int cantidad_bodega, String unidad_medida, int codigo_sucursal, int N_Bodega) {
        this.C_Producto_En_Bodega = C_Producto_En_Bodega;
        this.cantidad_bodega = cantidad_bodega;
        this.unidad_medida = unidad_medida;
        this.codigo_sucursal = codigo_sucursal;
        this.N_Bodega = N_Bodega;
    }

    public int getC_Producto_En_Bodega() {
        return C_Producto_En_Bodega;
    }

    public void setC_Producto_En_Bodega(int C_Producto_En_Bodega) {
        this.C_Producto_En_Bodega = C_Producto_En_Bodega;
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

    public int getN_Bodega() {
        return N_Bodega;
    }

    public void setN_Bodega(int N_Bodega) {
        this.N_Bodega = N_Bodega;
    }

    @Override
    public String toString() {
        return "Bodega{" + "C_Producto_En_Bodega=" + C_Producto_En_Bodega + ", cantidad_bodega=" + cantidad_bodega + ", unidad_medida=" + unidad_medida + ", codigo_sucursal=" + codigo_sucursal + ", N_Bodega=" + N_Bodega + '}';
    }

    
    
}
