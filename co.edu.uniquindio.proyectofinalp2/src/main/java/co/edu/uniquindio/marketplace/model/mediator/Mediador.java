package co.edu.uniquindio.marketplace.model.mediator;

import co.edu.uniquindio.marketplace.model.Vendedor;

public interface Mediador {
    void enviarMensaje(String mensaje, Vendedor vendedor);

}
