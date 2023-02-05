package de.neuefische.car.service;

import de.neuefische.car.model.Car;
import de.neuefische.car.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Erstelle eine Klasse ```CarService``` mit den Methoden:
 * - addCar(Car car), ruft die addCar Methode des Repositorys auf,
 * - getCars(), ruft die getCars Methode vom Repository auf.
 */

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void addCar(Car car) {
        carRepository.addCar(car);
    }

    public List<Car> getCars() {
        return carRepository.getCars();
    }
}
