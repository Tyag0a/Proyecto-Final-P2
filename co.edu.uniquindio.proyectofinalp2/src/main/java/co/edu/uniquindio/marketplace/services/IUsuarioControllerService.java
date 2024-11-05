package co.edu.uniquindio.marketplace.services;

import co.edu.uniquindio.marketplace.mapping.dto.UsuarioDto;
import co.edu.uniquindio.marketplace.mapping.dto.VendedorDto;
import co.edu.uniquindio.marketplace.model.Usuario;

public interface IUsuarioControllerService {

    public boolean validarUsuario(UsuarioDto usuario);

    public UsuarioDto getUsuario(UsuarioDto usuario);

    public Usuario getUsuarioNormal(Usuario usuario);

    public boolean agregarVendedor (VendedorDto vendedorDto);

}
