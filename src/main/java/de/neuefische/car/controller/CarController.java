package de.neuefische.car.controller;

import de.neuefische.car.model.Car;
import de.neuefische.car.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Erstelle einen ```CarController```
 * - Schreibe einen Post-Endpunkt der im Body ein Car entgegennimmt und die addCar() Methode vom CarService aufruft.
 * - Schreibe einen Get-Endpunkt der die getCar Methode vom CarService aufruft und dann eine Liste von allen Autos zurückgibt.
 */

@RestController
@RequestMapping("/api/cars")
@AllArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping
    public List<Car> getCars() {
        return carService.getCars();
    }

    @PostMapping
    public void addCar(@RequestBody Car car) {
        carService.addCar(car);
    }
}
