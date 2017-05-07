package info.labas.labas.labas.core.dao;

import info.labas.labas.labas.core.model.Person;

import java.util.List;

public interface PersonDao {

    List<Person> findAll();

    Person findByIdAndName(Integer id, String name);

}
