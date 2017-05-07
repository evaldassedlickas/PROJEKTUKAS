package info.labas.labas.labas.core.service;

import info.labas.labas.labas.core.dao.PersonDao;
import info.labas.labas.labas.core.model.Person;
import info.labas.labas.labas.core.service.PersonService;
import info.labas.labas.labas.core.service.impl.PersonServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.util.ReflectionTestUtils.setField;

public class PersonServiceTest {

    private PersonService personService;

    @Before
    public void setUp() {
        personService = new PersonServiceImpl();

        PersonDao personDao = mock(PersonDao.class);
        when(personDao.findAll()).thenReturn(getMockNamesList());

        setField(personService, "personDao", personDao);
    }

    @Test
    public void testFindAllNames() {
        List<Person> results = personService.findAllNames();

        assertEquals(2, results.size());

        Person john = results.get(0);
        assertTrue(john.getId().equals(1));
        assertEquals("John Doe", john.getName());

        Person betty = results.get(1);
        assertTrue(betty.getId().equals(2));
        assertEquals("Betty Jones", betty.getName());
    }

    private List<Person> getMockNamesList() {
        Person john = new Person();
        john.setId(1);
        john.setName("John Doe");

        Person betty = new Person();
        betty.setId(2);
        betty.setName("Betty Jones");

        List<Person> persons = new ArrayList<>();
        persons.add(john);
        persons.add(betty);

        return persons;
    }

}
