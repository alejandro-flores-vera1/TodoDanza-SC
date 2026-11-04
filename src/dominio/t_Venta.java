package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class t_Venta {
    private int id;
    private LocalDate fecha;
    private List<t_DetalleVenta> detalles;
    private t_Cliente comprador;
    private TipoPrecio tipoPrecio;
    private List<t_Pago> pagos;
    private EstadoVenta estado;

    public t_Venta(int id, LocalDate fecha, t_Cliente comprador, TipoPrecio tipoPrecio, EstadoVenta estado) {
        this.id = id;
        this.fecha = fecha;
        this.comprador = comprador;
        this.tipoPrecio = tipoPrecio;
        this.estado = estado;
        this.detalles = new ArrayList<>();
        this.pagos = new ArrayList<>();
    }

    public void configurarEstado(EstadoVenta estadoVenta) {
        this.estado = estadoVenta;
    }

    /**
     * PENDIENTE: el UML no relaciona t_Variante con t_Producto, por lo que
     * no hay forma de obtener el precio de cada detalle.
     */
    public double calcularTotal(List<t_DetalleVenta> detalles) {
        throw new UnsupportedOperationException("Pendiente: el UML no define de dónde se obtiene el precio.");
    }

    /** PENDIENTE: depende de calcularTotal. */
    public EstadoPago estaPagado(List<t_Pago> pagos) {
        throw new UnsupportedOperationException("Pendiente: depende de calcularTotal.");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public List<t_DetalleVenta> getDetalles() { return detalles; }
    public void setDetalles(List<t_DetalleVenta> detalles) { this.detalles = detalles; }

    public t_Cliente getComprador() { return comprador; }
    public void setComprador(t_Cliente comprador) { this.comprador = comprador; }

    public TipoPrecio getTipoPrecio() { return tipoPrecio; }
    public void setTipoPrecio(TipoPrecio tipoPrecio) { this.tipoPrecio = tipoPrecio; }

    public List<t_Pago> getPagos() { return pagos; }
    public void setPagos(List<t_Pago> pagos) { this.pagos = pagos; }

    public EstadoVenta getEstado() { return estado; }
}
