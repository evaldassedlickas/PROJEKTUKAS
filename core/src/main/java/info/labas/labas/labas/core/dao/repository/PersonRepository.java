package info.labas.labas.labas.core.dao.repository;

import info.labas.labas.labas.core.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    Person findByIdAndName(Integer id, String name);

}
