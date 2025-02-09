package org.example.repositories;

import org.example.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    private final ArrayList<Car> cars = new ArrayList<>();

    public CarRepository() {
        this.cars.add(new Car("Toyota", "diesel", "Yaris", 120, 2006));
        this.cars.add(new Car("Subaru", "petrol", "Impreza", 230, 2005));
        this.cars.add(new Car("Opel", "petrol"));
    }

    public List<Car> getAll() {
        return cars;
    }

    public Car get(int id) {
        return cars.get(id);
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }
}
