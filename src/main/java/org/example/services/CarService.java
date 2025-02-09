package org.example.services;

import org.example.models.Car;
import org.example.repositories.CarRepository;

import java.util.List;

public class CarService {
    private final CarRepository carRepository = new CarRepository();

    public Car get(int id) {
        return this.carRepository.get(id);
    }

    public List<Car> getAll() {
        return this.carRepository.getAll();
    }

    public String addCar(String make, String model, String horsePower, String engineType, String year) {
        if (make.isBlank()) {
            return "Make is required!";
        }

        if (engineType.isBlank()) {
            return "Engine Type is required!";
        }

        if (!"diesel".equalsIgnoreCase(engineType) && !"petrol".equalsIgnoreCase(engineType)) {
            return "Engine type must be either diesel or petrol!";
        }

        Car car = new Car(make, engineType);

        if (!horsePower.isBlank()) {
            try {
                car.setHorsePower(Integer.parseInt(horsePower));
            } catch (NumberFormatException e) {
                return "Horse Power must be a valid number!";
            }
        }

        if (!model.isBlank()) {
            car.setModel(model);
        }

        if (!year.isBlank()) {
            try {
                car.setYear(Integer.parseInt(year));
            } catch (NumberFormatException e) {
                return "Year must be a valid number!";
            }
        }

        this.carRepository.addCar(car);

        return "Car added successfully!";
    }
}
