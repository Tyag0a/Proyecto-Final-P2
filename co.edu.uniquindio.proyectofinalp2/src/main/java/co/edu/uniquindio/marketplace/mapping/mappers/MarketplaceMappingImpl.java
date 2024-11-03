package co.edu.uniquindio.marketplace.mapping.mappers;

import co.edu.uniquindio.marketplace.mapping.dto.AdministradorDto;
import co.edu.uniquindio.marketplace.mapping.dto.ProductoDto;
import co.edu.uniquindio.marketplace.mapping.dto.UsuarioDto;
import co.edu.uniquindio.marketplace.mapping.dto.VendedorDto;
import co.edu.uniquindio.marketplace.model.Administrador;
import co.edu.uniquindio.marketplace.model.Producto;
import co.edu.uniquindio.marketplace.model.Usuario;
import co.edu.uniquindio.marketplace.model.Vendedor;
import co.edu.uniquindio.marketplace.services.IMarketplaceMapping;

import co.edu.uniquindio.marketplace.services.IMarketplaceMapping;

import java.util.ArrayList;
import java.util.List;

public class MarketplaceMappingImpl implements IMarketplaceMapping {

    @Override
    public List<AdministradorDto> getAdministradoresDto(List<Administrador> listaAdministradores) {
        if (listaAdministradores == null) {
            return null;
        }

        List<AdministradorDto> listaAdministradoresDto = new ArrayList<AdministradorDto>(listaAdministradores.size());
        for (Administrador administrador : listaAdministradores) {
            listaAdministradoresDto.add(administradorToAdministradorDto(administrador));
        }
        return listaAdministradoresDto;
    }


    @Override
    public AdministradorDto administradorToAdministradorDto(Administrador administrador) {
        return new AdministradorDto(
                administrador.getNombre(), administrador.getApellido(), administrador.getCedula(), administrador.getDireccion());
    }


    @Override
    public Administrador administradorDtoToAdministrador(AdministradorDto administradorDto) {
        return Administrador.builder()
                .setNombre(administradorDto.nombre())
                .setApellido(administradorDto.apellido())
                .setCedula(administradorDto.cedula())
                .setDireccion(administradorDto.direccion())
                .build();
    }

    @Override
    public List<ProductoDto> getProductosDto(List<Producto> listaProductos) {
        if (listaProductos == null) {
            return null;
        }
        List<ProductoDto> listaProductosDto = new ArrayList<ProductoDto>(listaProductos.size());
        for (Producto producto : listaProductos) {
            listaProductosDto.add(productoToProductoDto(producto));
        }
        return listaProductosDto;
    }

    @Override
    public ProductoDto productoToProductoDto(Producto producto) {
        return new ProductoDto(producto.getNombre(), producto.getImagen(), producto.getCategoria(), producto.getPrecio());
    }

    @Override
    public Producto productoDtoToProducto(ProductoDto productoDto) {
        return Producto.builder().setNombre(productoDto.nombre()).setImagen(productoDto.imagen()).setCategoria(productoDto.categoria()).setPrecio(productoDto.precio()).build();
    }

    @Override
    public List<UsuarioDto> getUsuarioDto(List<Usuario> listaUsuarios) {
        if (listaUsuarios == null) {
            return null;
        }
        List<UsuarioDto> listaUsuariosDto = new ArrayList<UsuarioDto>(listaUsuarios.size());
        for (Usuario usuario : listaUsuarios) {
            listaUsuariosDto.add(usuarioToUsuarioDto(usuario));
        }
        return listaUsuariosDto;
    }

    @Override
    public UsuarioDto usuarioToUsuarioDto(Usuario usuario) {
        return new UsuarioDto(usuario.getNombreUsuario(), usuario.getContraseña());
    }

    @Override
    public Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto) {
        return Usuario.builder().setNombreUsuario(usuarioDto.nombreUsuario()).setContraseña(usuarioDto.contraseña()).build();
    }

    @Override
    public List<VendedorDto> getVendedorDto(List<Vendedor> listaVendedores) {
        if (listaVendedores == null) {
            return null;
        }
        List<VendedorDto> listaVendedoresDto = new ArrayList<VendedorDto>(listaVendedores.size());
        for (Vendedor vendedor : listaVendedores) {
            listaVendedoresDto.add(vendedorToVendedorDto(vendedor));
        }
        return listaVendedoresDto;
    }

    @Override
    public VendedorDto vendedorToVendedorDto(Vendedor vendedor) {
        return new VendedorDto(vendedor.getNombre(), vendedor.getApellido(), vendedor.getCedula(), vendedor.getDireccion());
    }

    @Override
    public Vendedor vendedorDtoToVendedor(VendedorDto vendedorDto) {
        return Vendedor.builder().setNombre(vendedorDto.nombre()).setApellido(vendedorDto.apellido()).setCedula(vendedorDto.cedula()).setDireccion(vendedorDto.direccion()).build();
    }
}


