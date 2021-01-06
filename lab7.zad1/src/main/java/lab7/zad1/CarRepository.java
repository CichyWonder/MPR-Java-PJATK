package lab7.zad1;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CarRepository extends CrudRepository<Car, Long> {
    Car searchForMake(String make);
    Car searchForRegistration(String registartion);
}
