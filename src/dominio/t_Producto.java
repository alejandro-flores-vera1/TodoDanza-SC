package dominio;

import java.util.ArrayList;
import java.util.List;

public class t_Producto {
    private int id;
    private String nombre;
    private String categoria;
    private String rutaFoto;
    private String descripcion;
    private double costo;
    private double precioPublico;
    private double precioMayoreo;
    private List<t_Variante> variantes;

    public t_Producto(int id, String nombre, String categoria, String rutaFoto, String descripcion,
                      double costo, double precioPublico, double precioMayoreo) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.rutaFoto = rutaFoto;
        this.descripcion = descripcion;
        this.costo = costo;
        this.precioPublico = precioPublico;
        this.precioMayoreo = precioMayoreo;
        this.variantes = new ArrayList<>();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getRutaFoto() { return rutaFoto; }
    public void setRutaFoto(String rutaFoto) { this.rutaFoto = rutaFoto; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public double getCosto() { return costo; }
    public void setCosto(double costo) { this.costo = costo; }

    public double getPrecioPublico() { return precioPublico; }
    public void setPrecioPublico(double precioPublico) { this.precioPublico = precioPublico; }

    public double getPrecioMayoreo() { return precioMayoreo; }
    public void setPrecioMayoreo(double precioMayoreo) { this.precioMayoreo = precioMayoreo; }

    public List<t_Variante> getVariantes() { return variantes; }
    public void setVariantes(List<t_Variante> variantes) { this.variantes = variantes; }
}
