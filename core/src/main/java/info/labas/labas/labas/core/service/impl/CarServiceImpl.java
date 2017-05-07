package info.labas.labas.labas.core.service.impl;

import info.labas.labas.labas.core.dao.CarDao;
import info.labas.labas.labas.core.model.Car;
import info.labas.labas.labas.core.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> findAllCars() {
        return carDao.findAll();
    }

}
