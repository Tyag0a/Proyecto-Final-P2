package co.edu.uniquindio.marketplace.services;

import co.edu.uniquindio.marketplace.mapping.dto.PublicacionDto;
import co.edu.uniquindio.marketplace.mapping.dto.VendedorDto;
import co.edu.uniquindio.marketplace.model.Publicacion;

public interface IMuroControllerService {

    public boolean agregarPublicacion (PublicacionDto publicacion, VendedorDto vendedor);
}
