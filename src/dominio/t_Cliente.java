package dominio;

import java.util.ArrayList;
import java.util.List;

public class t_Cliente {
    private int id;
    private String nombre;
    private String numeroWhatsapp;
    private List<t_Venta> compras;

    public t_Cliente(int id, String nombre, String numeroWhatsapp) {
        this.id = id;
        this.nombre = nombre;
        this.numeroWhatsapp = numeroWhatsapp;
        this.compras = new ArrayList<>();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNumeroWhatsapp() { return numeroWhatsapp; }
    public void setNumeroWhatsapp(String numeroWhatsapp) { this.numeroWhatsapp = numeroWhatsapp; }

    public List<t_Venta> getCompras() { return compras; }
    public void setCompras(List<t_Venta> compras) { this.compras = compras; }
}
