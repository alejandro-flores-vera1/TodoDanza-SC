package dominio;

import java.time.LocalDate;

public class t_Pago {
    private LocalDate fecha;
    private double monto;
    private MetodoPago metodoPago;

    public t_Pago(LocalDate fecha, double monto, MetodoPago metodoPago) {
        this.fecha = fecha;
        this.monto = monto;
        this.metodoPago = metodoPago;
    }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

    public MetodoPago getMetodoPago() { return metodoPago; }
    public void setMetodoPago(MetodoPago metodoPago) { this.metodoPago = metodoPago; }
}
