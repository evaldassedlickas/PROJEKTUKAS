package info.labas.labas.labas.core.dao.impl;

import info.labas.labas.labas.core.dao.PersonDao;
import info.labas.labas.labas.core.dao.repository.PersonRepository;
import info.labas.labas.labas.core.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private PersonRepository personRepository;

    @Override
    @Cacheable("namesCache")
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person findByIdAndName(Integer id, String name) {
        return personRepository.findByIdAndName(id, name);
    }

}
