package info.labas.labas.labas.web.controller;

import info.labas.labas.labas.core.dao.repository.AsmuoRepository;
import info.labas.labas.labas.core.model.Asmuo;
import info.labas.labas.labas.core.service.impl.AsmuoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by Justas on 4/30/2017.
 */
@Controller
public class LoginController {

    @Autowired
    private AsmuoService asmuoService;

    @RequestMapping(value = "/pacientaslogin", method = RequestMethod.GET)
    public  String showLoginForm()
    {
        return  "pacientaslogin";
    }

    @RequestMapping(value = "/pacientaslogin", method = RequestMethod.POST)
    public  String vertifyLogin(@RequestParam String asmensKodas, @RequestParam String slaptazodis,
                                HttpSession session, Model model)
    {
         Asmuo asmuo = asmuoService.tikrintiPrisijungimoDuomenis(asmensKodas, slaptazodis);
         if(asmuo == null)
         {
             model.addAttribute("loginError", "Blogai įvesti duomenys. Bandykite dar kartą");
             return "pacientaslogin";
         }

         session.setAttribute("loggedInUser", asmuo);
         return "redirect: /pacientas/index";


    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session)
    {
        session.removeAttribute("loggedInUser");
        return "index";
    }
}
