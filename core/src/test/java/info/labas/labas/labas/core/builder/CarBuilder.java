package info.labas.labas.labas.core.builder;

import info.labas.labas.labas.core.model.Car;

public class CarBuilder {

    private Car car = new Car();

    public CarBuilder() {
        car.setId(1);
        car.setName("Mazda Premacy");
    }

    public static CarBuilder init() {
        return new CarBuilder();
    }

    public Car build() {
        return car;
    }

    public CarBuilder withId(Integer id) {
        car.setId(id);
        return this;
    }

    public CarBuilder withName(String name) {
        this.car.setName(name);
        return this;
    }
}
