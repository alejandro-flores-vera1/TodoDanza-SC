package dominio;

public class t_Usuario {
    private String nombre;
    private String contrasenaHasheada;

    public t_Usuario(String nombre, String contrasenaHasheada) {
        this.nombre = nombre;
        this.contrasenaHasheada = contrasenaHasheada;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getContrasenaHasheada() { return contrasenaHasheada; }
    public void setContrasenaHasheada(String contrasenaHasheada) { this.contrasenaHasheada = contrasenaHasheada; }
}
