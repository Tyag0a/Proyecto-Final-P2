package co.edu.uniquindio.marketplace.mapping.mappers;

import co.edu.uniquindio.marketplace.mapping.dto.*;
import co.edu.uniquindio.marketplace.mapping.proxy.ImageProxy;
import co.edu.uniquindio.marketplace.model.*;
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
        String image = producto.getRutaImage();
        return new ProductoDto(producto.getNombre(),image , producto.getCategoria(), producto.getPrecio(),producto.getEstadoProducto());
    }

    @Override
    public Producto productoDtoToProducto(ProductoDto productoDto) {
        return Producto.builder().setNombre(productoDto.nombre()).setImagen(productoDto.rutaImagen()).setCategoria(productoDto.categoria()).setPrecio(productoDto.precio()).build();
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
        return new UsuarioDto(usuario.getNombreUsuario(), usuario.getContraseña(),usuario.getPersonaAsociada());
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
        return new VendedorDto(vendedor.getNombre(), vendedor.getApellido(), vendedor.getCedula(), vendedor.getDireccion(),vendedor.getUsuarioAsociado());
    }

    @Override
    public Vendedor vendedorDtoToVendedor(VendedorDto vendedorDto) {
        return Vendedor.builder().setNombre(vendedorDto.nombre()).setApellido(vendedorDto.apellido()).setCedula(vendedorDto.cedula()).setDireccion(vendedorDto.direccion()).setUsuarioAsociado(vendedorDto.usuarioAsociado()).build();
    }

    @Override
    public List<PublicacionDto> getPublicacionDto(List<Publicacion> listaPublicaciones) {
        return List.of();
    }

    @Override
    public PublicacionDto publicacionToPublicacionDto(Publicacion publicacion) {
        return new PublicacionDto(
                publicacion.getFechaPublicacion(),
                publicacion.getHoraPublicacion(),
                publicacion.getDescripcionPublicacion(),
                publicacion.getProductoPublicado()
        );
    }

    @Override
    public Publicacion publicacionDtoToPublicacion(PublicacionDto publicacionDto) {
        return new Publicacion(
                publicacionDto.fechaPublicacion(),
                publicacionDto.horaPublicacion(),
                publicacionDto.producto(),
                publicacionDto.descripcion()
        );
    }
}


