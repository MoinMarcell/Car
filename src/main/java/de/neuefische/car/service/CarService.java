package de.neuefische.car.service;

import de.neuefische.car.model.Car;
import de.neuefische.car.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Erstelle eine Klasse ```CarService``` mit den Methoden:
 * - addCar(Car car), ruft die addCar Methode des Repositorys auf,
 * - getCars(), ruft die getCars Methode vom Repository auf.
 */

@Service
@AllArgsConstructor
public class CarService {
    private final CarRepository carRepository;

    public void addCar(Car car) {
        carRepository.addCar(car);
    }

    public List<Car> getCars() {
        return carRepository.getCars();
    }
}
