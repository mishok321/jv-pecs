package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

public class Truck extends Machine {
    private List<Truck> truckStorage = new ArrayList<>();

    public Truck() {
    }

    public List<Truck> readStorage() {
        return truckStorage;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public void initalizeStorage() {
        truckStorage.add(new Truck());
        truckStorage.add(new Truck());
        truckStorage.add(new Truck());
        truckStorage.add(new Truck());
        truckStorage.add(new Truck());
    }
}
