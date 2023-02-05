package de.neuefische.car.repository;

import de.neuefische.car.model.Car;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarRepository {
    private final List<Car> cars;

    public CarRepository(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void deleteCar(String id) {
        cars.removeIf(car -> car.id().equals(id));
    }

    public void updateCar(String id, Car car) {
        deleteCar(id);
        cars.add(car);
    }
}
