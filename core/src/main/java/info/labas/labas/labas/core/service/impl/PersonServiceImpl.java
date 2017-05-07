package info.labas.labas.labas.core.service.impl;

import info.labas.labas.labas.core.dao.PersonDao;
import info.labas.labas.labas.core.model.Person;
import info.labas.labas.labas.core.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public List<Person> findAllNames() {
        return personDao.findAll();
    }

}
