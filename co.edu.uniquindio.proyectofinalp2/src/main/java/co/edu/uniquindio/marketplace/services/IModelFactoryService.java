package co.edu.uniquindio.marketplace.services;

import co.edu.uniquindio.marketplace.mapping.dto.PublicacionDto;
import co.edu.uniquindio.marketplace.mapping.dto.UsuarioDto;
import co.edu.uniquindio.marketplace.mapping.dto.VendedorDto;

public interface IModelFactoryService {
    public boolean validarInicioSesion(UsuarioDto usuario);
    public boolean agregarPublicacion(PublicacionDto publidto);
}
