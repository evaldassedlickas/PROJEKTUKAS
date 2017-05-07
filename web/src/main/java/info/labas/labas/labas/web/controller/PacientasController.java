package info.labas.labas.labas.web.controller;

import info.labas.labas.labas.core.model.*;
import info.labas.labas.labas.core.service.impl.GydytojasService;
import info.labas.labas.labas.core.service.impl.LaikoLentelesAntrasteService;
import info.labas.labas.labas.core.service.impl.LaikoLentelesEiluteService;
import info.labas.labas.labas.core.service.impl.PacientasService;
import org.hibernate.loader.custom.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.datetime.joda.DateTimeParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.Console;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Justas on 4/30/2017.
 */
@Controller
@RequestMapping("/pacientas")
public class PacientasController {

    @Autowired
    private PacientasService pacientasService;

    @Autowired
    private GydytojasService gydytojasService;

    @Autowired
    private LaikoLentelesAntrasteService antrasteService;

    @Autowired
    private LaikoLentelesEiluteService eiluteService;

    @RequestMapping("/index")
    public String mainPage(HttpSession session)
    {
        return "pacientas";
    }

    @RequestMapping(value = "/doctorSearch", method = RequestMethod.GET)
    public String showSearch()
    {
        //System.out.println("TUREJO KAZKA RAST");
        return "gydytojoPaieska";
    }

    @RequestMapping(value = "/doctorSearch", method = RequestMethod.POST)
    public String showSearchResults(@RequestParam String vardas, @RequestParam String pavarde, Model model)
    {
        List<Gydytojas> gydytojas = new ArrayList<>();
        List<Asmuo> asmuoList = gydytojasService.searchListByVardasPavarde(vardas, pavarde);
        for (Asmuo asmuo : asmuoList)
        {
            gydytojas.add(gydytojasService.searchGydytojasByAsmensKodas(asmuo.getAsmens_kodas()));
        }
        model.addAttribute("asmresults", asmuoList);
        model.addAttribute("gydresults", gydytojas);
        return "gydytojoPaieska";
    }

    @RequestMapping(value = "/setTime={gydytojo_id}", method = RequestMethod.GET)
    public String showTimeTable(@PathVariable(value = "gydytojo_id") int gydytojo_id, Model model)
    {
        System.out.println(gydytojo_id);
        return "selectTime";
    }

    //----------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------
    //-------------------TOLIAU   TURI BUTI PERKELTA I GYDYTOJOOO VALDYMA---------------------
    //----------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------

    private int getInt(boolean param)
    {
        if (param == true) return 1;
        return 0;
    }

    @RequestMapping(value = "/createTimeTable", method = RequestMethod.GET)
    public String showTableCreator()
    {
        //System.out.println("TUREJO KAZKA RAST");
        return "timeTableCreation";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH/mm");
        sdf.setLenient(true);
        sdf.setTimeZone(TimeZone.getTimeZone("CET"));
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }

    @RequestMapping(value = "/createTimeTable", method = RequestMethod.POST)
    public String getAndSaveTimeTable(@RequestParam String pavadinimas,
                                      @RequestParam String darbo_pradzia, @RequestParam String darbo_pabaiga,
                                      @RequestParam int pacientu_sk_per_diena, @RequestParam boolean naudojama,
                                      @RequestParam boolean pirm, @RequestParam boolean antr, @RequestParam boolean trec,
                                      @RequestParam boolean ketv, @RequestParam boolean penkt, @RequestParam boolean sest,
                                      @RequestParam boolean sekm)
    {
        //pattern="([01]?[0-9]|2[0-3]):[0-5][0-9]"
        DateFormat df = new SimpleDateFormat("HH:mm");
        Date newDarbo_pradzia = new Date();
        Date newDarbo_pabaiga = new Date();
        try {
            newDarbo_pradzia = df.parse(darbo_pradzia);
            newDarbo_pabaiga = df.parse(darbo_pabaiga);
        } catch (ParseException e)
        {
            e.printStackTrace();
        }

        LaikoLentelesAntraste antraste = new LaikoLentelesAntraste();
        antraste.setPavadinimas(pavadinimas);
        antraste.setDarbo_pradzia(newDarbo_pradzia);
        antraste.setDarbo_pabaiga(newDarbo_pabaiga);
        antraste.setPacientu_sk_per_diena(pacientu_sk_per_diena);
        antraste.setSiuo_metu_naudojamas(getInt(naudojama));
        antraste.setPirmadienis(getInt(pirm));
        antraste.setAntradienis(getInt(antr));
        antraste.setTreciadienis(getInt(trec));
        antraste.setKetvirtadienis(getInt(ketv));
        antraste.setPenktadienis(getInt(penkt));
        antraste.setSestadienis(getInt(sest));
        antraste.setSekmadienis(getInt(sekm));
        antraste.setGydytojo_id(69);

        antrasteService.saveAndFlush(antraste);

        List<LaikoLentelesEilute> eilutes = eiluteService.listByDoctorAndDate(69);
        for (LaikoLentelesEilute eilute : eilutes)
        {
            System.out.println(eilute);
        }

        return "redirect: /pacientas/createTimeTable";

    }
}
