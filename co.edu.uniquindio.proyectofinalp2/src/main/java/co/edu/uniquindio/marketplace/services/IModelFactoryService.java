package co.edu.uniquindio.marketplace.services;

import co.edu.uniquindio.marketplace.mapping.dto.PublicacionDto;
import co.edu.uniquindio.marketplace.mapping.dto.UsuarioDto;
import co.edu.uniquindio.marketplace.mapping.dto.VendedorDto;
import co.edu.uniquindio.marketplace.model.Usuario;

public interface IModelFactoryService {
    public boolean validarInicioSesion(UsuarioDto usuario);
    public boolean agregarPublicacion(PublicacionDto publidto);
    public boolean agregarAliado(Usuario usuario);
}
