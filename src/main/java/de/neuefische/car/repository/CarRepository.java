package de.neuefische.car.repository;

import de.neuefische.car.model.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Erstelle eine Klasse ```CarRepository``` mit einer Liste von Cars und den Methoden:
 * - addCar(Car car), die das Auto zu der Liste hinzufügt.
 * - getCars(), gibt die ganze Liste an Autos zurück.
 */

@Repository
@AllArgsConstructor
public class CarRepository {
    private final List<Car> cars;

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }
}
