package de.neuefische.car.controller;

import de.neuefische.car.model.Car;
import de.neuefische.car.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getCars() {
        return carService.getCars();
    }

    @PostMapping
    public void addCar(@RequestBody Car car) {
        carService.addCar(car);
    }

    /**
     * Füge einen Delete-Endpunkt hinzu, um ein zuvor hinzugefügtes `Car` wieder zu entfernen.
     */
    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable String id) {
        carService.deleteCar(id);
    }

    /**
     * Füge einen Put-Endpunkt hinzu, um ein bereits hinzugefügtes `Car zu verändern.
     * Hier soll im Body des Request das veränderte Objekt mitgeschickt werden.
     */
    @PutMapping("/{id}")
    public void updateCar(@PathVariable String id, @RequestBody Car car) {
        carService.updateCar(id, car);
    }
}
