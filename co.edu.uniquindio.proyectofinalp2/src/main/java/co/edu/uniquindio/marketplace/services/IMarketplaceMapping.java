package co.edu.uniquindio.marketplace.services;

import co.edu.uniquindio.marketplace.mapping.dto.AdministradorDto;
import co.edu.uniquindio.marketplace.mapping.dto.ProductoDto;
import co.edu.uniquindio.marketplace.mapping.dto.UsuarioDto;
import co.edu.uniquindio.marketplace.mapping.dto.VendedorDto;
import co.edu.uniquindio.marketplace.model.Administrador;
import co.edu.uniquindio.marketplace.model.Producto;
import co.edu.uniquindio.marketplace.model.Usuario;
import co.edu.uniquindio.marketplace.model.Vendedor;

import java.util.List;

public interface IMarketplaceMapping {
    List<AdministradorDto> getAdministradoresDto(List<Administrador> listaAdministradores);
    AdministradorDto administradorToAdministradorDto(Administrador administrador);
    Administrador administradorDtoToAdministrador(AdministradorDto administradorDto);

    List<ProductoDto> getProductosDto(List<Producto> listaProductos);
    ProductoDto productoToProductoDto(Producto producto);
    Producto productoDtoToProducto(ProductoDto productoDto);

    List<UsuarioDto> getUsuarioDto(List<Usuario> listaUsuarios);
    UsuarioDto usuarioToUsuarioDto(Usuario usuario);
    Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto);

    List<VendedorDto> getVendedorDto(List<Vendedor> listaVendedores);
    VendedorDto vendedorToVendedorDto(Vendedor vendedor);
    Vendedor vendedorDtoToVendedor(VendedorDto vendedorDto);
}
