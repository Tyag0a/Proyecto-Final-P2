package co.edu.uniquindio.marketplace.model;

import co.edu.uniquindio.marketplace.services.IImage;

public class ImagenReal implements IImage {

    String rutaImagen;

    public ImagenReal(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    @Override
    public void mostrar() {

    }
}
