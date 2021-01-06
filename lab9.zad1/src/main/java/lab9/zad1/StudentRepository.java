package lab9.zad1;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student>findByFirstName(String firstName);

    List<Student>findByLastName(String lastName);

    @Override
    List<Student> findAll();
}
