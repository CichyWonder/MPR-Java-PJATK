package lab7.zad1;

import org.springframework.stereotype.Service;


@Service
public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository){
         this.carRepository = carRepository;
     }


    public java.util.Optional<Car> searchCarById(Long id){
       return carRepository.findById(id);
    }

    public Long saveCar(Car car){
        return carRepository.save(car).getId();
    }

    public Car searchCarByMake(String make){

        return carRepository.searchForMake(make);
    }

    public Car searchCarByRegistration(String registration){

        return carRepository.searchForRegistration(registration);
    }

    public void deleteCar(Long id){
        carRepository.deleteById(id);
    }
}