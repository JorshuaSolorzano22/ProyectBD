// Product.java
package objetos;

    // Clase auxiliar para representar un Producto
    public class Product {
        private int codigoProducto;
        private int codigoDescuento;
        private int codigoTipoProducto;
        private String nombreProducto;
        private double precioUnitario;
        private int C_Producto_En_Bodega;

    public Product() {
    }
    
    public Product(int codigoProducto, int codigoDescuento, int codigoTipoProducto, String nombreProducto, double precioUnitario, int codigo_bodega) {
        this.codigoProducto = codigoProducto;
        this.codigoDescuento = codigoDescuento;
        this.codigoTipoProducto = codigoTipoProducto;
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
        this.C_Producto_En_Bodega = codigo_bodega;
    }

    
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCodigoDescuento() {
        return codigoDescuento;
    }

    public void setCodigoDescuento(int codigoDescuento) {
        this.codigoDescuento = codigoDescuento;
    }

    public int getCodigoTipoProducto() {
        return codigoTipoProducto;
    }

    public void setCodigoTipoProducto(int codigoTipoProducto) {
        this.codigoTipoProducto = codigoTipoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCodigo_bodega() {
        return C_Producto_En_Bodega;
    }

    public void setCodigo_bodega(int codigo_bodega) {
        this.C_Producto_En_Bodega = codigo_bodega;
    }

    @Override
    public String toString() {
        return "Product{" + "codigoProducto=" + codigoProducto + ", codigoDescuento=" + codigoDescuento + ", codigoTipoProducto=" + codigoTipoProducto + ", nombreProducto=" + nombreProducto + ", precioUnitario=" + precioUnitario + ", codigo_bodega=" + C_Producto_En_Bodega + '}';
    }

      
}
