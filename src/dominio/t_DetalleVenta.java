package dominio;

public class t_DetalleVenta {
    private t_Variante varianteProducto;
    private int cantidadProducto;

    public t_DetalleVenta(t_Variante varianteProducto, int cantidadProducto) {
        this.varianteProducto = varianteProducto;
        this.cantidadProducto = cantidadProducto;
    }

    public t_Variante getVarianteProducto() { return varianteProducto; }
    public void setVarianteProducto(t_Variante varianteProducto) { this.varianteProducto = varianteProducto; }

    public int getCantidadProducto() { return cantidadProducto; }
    public void setCantidadProducto(int cantidadProducto) { this.cantidadProducto = cantidadProducto; }
}
