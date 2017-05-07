package info.labas.labas.labas.web.controller;

import info.labas.labas.labas.web.AbstractIntegrationTest;
import org.junit.Test;
import org.springframework.http.MediaType;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class ArithmeticControllerTest extends AbstractIntegrationTest {

    @Test
    public void testGetInitialPage() throws Exception {
        mockMvc.perform(get("/arithmetic/")
            .accept(MediaType.TEXT_HTML))
            .andExpect(status().isOk())
            .andExpect(view().name("arithmetic"))
            .andExpect(forwardedUrl("/WEB-INF/pages/arithmetic.jsp"))
            .andExpect(model().attribute("form", notNullValue()));
    }

    @Test
    public void testCalculateAllResultsWeb() throws Exception {
        mockMvc.perform(get("/arithmetic/all")
            .param("firstNumber", "10.5")
            .param("secondNumber", "4.4")
            .accept(MediaType.TEXT_HTML))
            .andExpect(status().isOk())
            .andExpect(view().name("arithmeticResults"))
            .andExpect(forwardedUrl("/WEB-INF/pages/arithmeticResults.jsp"))
            .andExpect(model().attribute("sum", is(14.9)))
            .andExpect(model().attribute("subtract", is(6.1)))
            .andExpect(model().attribute("multiply", is(46.2)))
            .andExpect(model().attribute("divide", is(2.3863636363636362)));
    }

}
