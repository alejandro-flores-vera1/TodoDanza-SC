package dominio;

import java.time.LocalDate;

public class t_HistorialInventario {
    private int id;
    private LocalDate fecha;
    private t_Variante variante;
    private int diferencia;
    private String motivo;

    public t_HistorialInventario(int id, LocalDate fecha, t_Variante variante, int diferencia, String motivo) {
        this.id = id;
        this.fecha = fecha;
        this.variante = variante;
        this.diferencia = diferencia;
        this.motivo = motivo;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public t_Variante getVariante() { return variante; }
    public void setVariante(t_Variante variante) { this.variante = variante; }

    public int getDiferencia() { return diferencia; }
    public void setDiferencia(int diferencia) { this.diferencia = diferencia; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
}
