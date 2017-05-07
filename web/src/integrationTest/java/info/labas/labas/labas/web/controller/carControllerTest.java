package info.labas.labas.labas.web.controller;

import info.labas.labas.labas.core.builder.CarBuilder;
import info.labas.labas.labas.core.dao.repository.CarRepository;
import info.labas.labas.labas.core.model.Car;
import info.labas.labas.labas.web.AbstractIntegrationTest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class carControllerTest extends AbstractIntegrationTest {

    @Autowired
    private CarRepository carRepository;

    @Before
    public void setUp() {
        super.setUp();

        Car mazda = CarBuilder.init().withId(null).build();
        Car audi = CarBuilder.init().withId(null).withName("Audi").build();

        carRepository.save(mazda);
        carRepository.save(audi);
    }

    @Test
    public void testGetAllNames() throws Exception {
        mockMvc.perform(get("/cars/all")
            .accept(MediaType.TEXT_HTML))
            .andExpect(status().isOk())
            .andExpect(view().name("cars"))
            .andExpect(forwardedUrl("/WEB-INF/pages/cars.jsp"))
            .andExpect(model().attribute("cars", hasSize(2)));
    }

}
