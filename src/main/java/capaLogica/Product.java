// Product.java
package capaLogica;

    // Clase auxiliar para representar un Producto
    public class Product {
        private int codigoProducto;
        private int codigoDescuento;
        private int codigoTipoProducto;
        private String nombreProducto;
        private double precioUnitario;

        public Product(int codigoProducto, int codigoDescuento, int codigoTipoProducto, String nombreProducto, double precioUnitario) {
            this.codigoProducto = codigoProducto;
            this.codigoDescuento = codigoDescuento;
            this.codigoTipoProducto = codigoTipoProducto;
            this.nombreProducto = nombreProducto;
            this.precioUnitario = precioUnitario;
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
        
}
