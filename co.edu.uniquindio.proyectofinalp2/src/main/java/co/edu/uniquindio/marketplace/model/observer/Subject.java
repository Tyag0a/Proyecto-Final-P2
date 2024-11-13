package co.edu.uniquindio.marketplace.model.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void agregarObserver(Observer observer) {
        observers.add(observer);
    }

    public void eliminarObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificarObservers(String notification) {
        for (Observer observer : observers) {
            observer.update(notification);
        }
    }
}
