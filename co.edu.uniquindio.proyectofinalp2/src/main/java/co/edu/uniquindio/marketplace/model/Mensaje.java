package co.edu.uniquindio.marketplace.model;

public class Mensaje {
    String contenido;
    private Usuario usuario;

    public Mensaje(String contenido, Usuario usuario) {
        this.contenido = contenido;
        this.usuario = usuario;

    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


}
