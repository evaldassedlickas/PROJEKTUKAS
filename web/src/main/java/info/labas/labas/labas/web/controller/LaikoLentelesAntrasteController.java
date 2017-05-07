package info.labas.labas.labas.web.controller;

import info.labas.labas.labas.core.service.impl.LaikoLentelesAntrasteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Justas on 4/29/2017.
 */
@Controller
@RequestMapping("/laikoLentelesAntraste")
public class LaikoLentelesAntrasteController {

    @Autowired
    private LaikoLentelesAntrasteService laikoLentelesAntrasteService;


}
