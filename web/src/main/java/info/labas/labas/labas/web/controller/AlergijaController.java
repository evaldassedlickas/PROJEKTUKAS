package info.labas.labas.labas.web.controller;

import info.labas.labas.labas.core.service.impl.AlergijaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Justas on 4/27/2017.
 */
@Controller
@RequestMapping("/alergija")
public class AlergijaController {

    @Autowired
    private AlergijaService alergijaService;

    @RequestMapping("/visi")
    public String getAllList(Model model)
    {
        model.addAttribute("alergija",alergijaService.findAll());
        return "alergijos";
    }

}
