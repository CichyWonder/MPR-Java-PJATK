package lab7.zad1;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
class CarController {

    private final CarService carService;

    CarController(CarService carService) {

        this.carService = carService;
    }


    @PostMapping("/Car/{id}")
    Long newCar(@RequestBody Car newCar) {
        return carService.saveCar(newCar);
    }



    @GetMapping("/Car/{id}")
    Optional<Car> searchByid(@PathVariable Long id) {

        return carService.searchCarById(id);
    }


    @GetMapping("/Car/{id}")
    Car searchByMake(@PathVariable String make) {

        return carService.searchCarByMake(make);
    }
    @GetMapping("/Car/{id}")
    Car searchByRegistartion(@PathVariable String registartion) {

        return carService.searchCarByRegistration(registartion);

    }

    @PutMapping("/Car/{id}")
    Long replaceCar(@RequestBody Car car, @PathVariable Long id) {

        Car updateCar = carService.searchCarById(id).get();
        updateCar.setMake(car.getMake());
        updateCar.setRegistartion(car.getRegistartion());
        return carService.saveCar(updateCar);


    }

    @DeleteMapping("/Car/{id}")
    void deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
    }
}
