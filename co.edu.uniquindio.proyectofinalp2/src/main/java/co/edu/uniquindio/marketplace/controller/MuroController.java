package co.edu.uniquindio.marketplace.controller;

import co.edu.uniquindio.marketplace.factory.ModelFactory;
import co.edu.uniquindio.marketplace.mapping.dto.PublicacionDto;
import co.edu.uniquindio.marketplace.mapping.dto.VendedorDto;
import co.edu.uniquindio.marketplace.services.IMuroControllerService;

public class MuroController implements IMuroControllerService {
    ModelFactory modelFactory;

    public MuroController() {
        modelFactory = ModelFactory.getInstance();
    }
    @Override
    public boolean agregarPublicacion(PublicacionDto publicaciondto, VendedorDto vendedordto) {
        return modelFactory.agregarPublicacion(publicaciondto, vendedordto);
    }
}
