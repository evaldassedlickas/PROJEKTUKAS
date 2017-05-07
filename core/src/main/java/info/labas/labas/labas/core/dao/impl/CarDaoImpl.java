package info.labas.labas.labas.core.dao.impl;

import info.labas.labas.labas.core.dao.CarDao;
import info.labas.labas.labas.core.dao.repository.CarRepository;
import info.labas.labas.labas.core.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

}
