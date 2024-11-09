package co.edu.uniquindio.marketplace.mapping.proxy;

import co.edu.uniquindio.marketplace.model.ImagenReal;
import co.edu.uniquindio.marketplace.services.IImage;

public class ImageProxy implements IImage {

    private ImagenReal imagenReal;
    String rutaImagen;

    public ImageProxy(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    @Override
    public void mostrar() {
        if (imagenReal == null) {
            imagenReal = new ImagenReal(rutaImagen);  // Carga la imagen solo cuando se necesita.
        }
        imagenReal.mostrar();

    }
}
