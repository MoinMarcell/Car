package de.neuefische.car.service;

import de.neuefische.car.model.Car;
import de.neuefische.car.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void addCar(Car car) {
        Car carToAdd = new Car(UUID.randomUUID().toString(), car.brand(), car.tires(), car.hasTuev());
        carRepository.addCar(carToAdd);
    }

    public List<Car> getCars() {
        return carRepository.getCars();
    }

    public void deleteCar(String id) {
        carRepository.deleteCar(id);
    }

    public void updateCar(String id, Car car) {
        carRepository.updateCar(id, car);
    }
}
