package co.edu.uniquindio.marketplace.mapping.dto;

public record UsuarioDto(String nombreUsuario, String contraseña) {

    public String contraseña() {
        return contraseña;
    }

    @Override
    public String nombreUsuario() {
        return nombreUsuario;
    }

}
