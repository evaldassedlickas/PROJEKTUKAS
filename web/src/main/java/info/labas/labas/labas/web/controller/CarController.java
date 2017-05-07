package info.labas.labas.labas.web.controller;

import info.labas.labas.labas.core.model.Ataskaita;
import info.labas.labas.labas.core.service.impl.AtaskaitaService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private AtaskaitaService ataskaitaService;
    //private CarService carService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        sdf.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }

    @RequestMapping("/all")
    public String getAllNames(Model model) {
        model.addAttribute("cars", ataskaitaService.getAll());
        return "cars";
    }

    @RequestMapping(value = "/callendar")
    public String returnCalendar(Model model)
    {
        JSONObject object = new JSONObject();
        object.put("title", "Kazkoks sudas");
        object.put("start", "2017-05-29T20:00:00");
        System.out.println(object);

        model.addAttribute("events",object);
        return "bandymas2";
    }

    @RequestMapping(value = "/ataskaita", method = RequestMethod.GET)
    public ModelAndView ataskaita()
    {
        return new ModelAndView("ataskaita", "command", new Ataskaita());
    }

    @RequestMapping(value = "/pridejo")
    public String addAtaskaita(Ataskaita ataskaita)
    {
       // model.addAttribute("ataskaitos_id", ataskaita.getAtaskaitos_id());
       // model.addAttribute("data_nuo", ataskaita.getData_nuo());
        //model.addAttribute("data_iki", ataskaita.getData_iki());
       // model.addAttribute("sistemos_gydytoju_skaicius", ataskaita.getSistemos_gydytoju_skaicius());
       // model.addAttribute("sistemos_pacientu_skaicius", ataskaita.getSistemos_pacientu_skaicius());
       // model.addAttribute("sukurimo_dat", ataskaita.getSukurimo_data());
       // model.addAttribute("vizitu_skaicius", ataskaita.getVizitu_skaicius());
        ataskaitaService.saveAndFlush(ataskaita);

        return "cars";
    }

}
