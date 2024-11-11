package co.edu.uniquindio.marketplace.controller;

import co.edu.uniquindio.marketplace.factory.ModelFactory;
import co.edu.uniquindio.marketplace.mapping.dto.PublicacionDto;
import co.edu.uniquindio.marketplace.mapping.dto.UsuarioDto;
import co.edu.uniquindio.marketplace.mapping.dto.VendedorDto;
import co.edu.uniquindio.marketplace.model.Marketplace;
import co.edu.uniquindio.marketplace.model.Usuario;
import co.edu.uniquindio.marketplace.services.IMuroControllerService;

public class MuroController implements IMuroControllerService {
    private UsuarioDto usuario;
    ModelFactory modelFactory;

    public MuroController() {
        modelFactory = ModelFactory.getInstance();
    }
    @Override
    public boolean agregarPublicacion(PublicacionDto publicaciondto) {
        return modelFactory.agregarPublicacion(publicaciondto);
    }

    public void setUsuario(UsuarioDto usuario) {
        this.usuario = usuario;
    }

    public UsuarioDto getUsuario() {
        return usuario;
    }

    public Marketplace inicializarData(){
        return modelFactory.inicializarDatos();
    }

}
