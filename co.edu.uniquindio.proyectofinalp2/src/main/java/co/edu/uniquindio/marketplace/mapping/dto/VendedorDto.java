package co.edu.uniquindio.marketplace.mapping.dto;

import co.edu.uniquindio.marketplace.model.Usuario;

public record VendedorDto(String nombre, String apellido, String cedula, String direccion, Usuario usuarioAsociado){
}
