package co.edu.uniquindio.marketplace.model.mediator;

import co.edu.uniquindio.marketplace.model.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class MediadorVendedor implements Mediador{
    private List<Vendedor> vendedores;
    
    public MediadorVendedor(){
        this.vendedores = new ArrayList<>();
    }

    // Metodo para enviar el mensaje a los demas vendedores

    @Override
    public void enviarMensaje(String mensaje, Vendedor vendedor){
        for(Vendedor v : vendedores){
            if(!v.equals(vendedor)){
                v.recibirMensaje(mensaje);
            }
        }
    }

    // Metodo para agregar vendedores al mediador
    public void agregarVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
    }
    


}
