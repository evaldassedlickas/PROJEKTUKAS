package info.labas.labas.labas.core.builder;

import info.labas.labas.labas.core.model.Person;

public class PersonBuilder {

    private Person person = new Person();

    public PersonBuilder() {
        person.setId(1);
        person.setName("John Doe");
    }

    public static PersonBuilder init() {
        return new PersonBuilder();
    }

    public Person build() {
        return person;
    }

    public PersonBuilder withId(Integer id) {
        person.setId(id);
        return this;
    }

    public PersonBuilder withName(String name) {
        this.person.setName(name);
        return this;
    }
}
