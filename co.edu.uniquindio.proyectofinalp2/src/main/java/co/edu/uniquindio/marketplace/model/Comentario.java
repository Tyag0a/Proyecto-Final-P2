package co.edu.uniquindio.marketplace.model;

public class Comentario {

    public String contenido;
    Usuario usuario;

    public Comentario(String contenido, Usuario usuario) {
        contenido = "";
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
