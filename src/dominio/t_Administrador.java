package dominio;

public class t_Administrador extends t_Usuario {
    private String numeroWhatsapp;

    public t_Administrador(String nombre, String contrasenaHasheada, String numeroWhatsapp) {
        super(nombre, contrasenaHasheada);
        this.numeroWhatsapp = numeroWhatsapp;
    }

    public String obtenerNumeroWhatsapp() {
        return numeroWhatsapp;
    }
}
