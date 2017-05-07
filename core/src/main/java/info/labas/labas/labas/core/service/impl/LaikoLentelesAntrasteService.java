package info.labas.labas.labas.core.service.impl;

import info.labas.labas.labas.core.dao.repository.LaikoLentelesAntrasteRepository;
import info.labas.labas.labas.core.model.LaikoLentelesAntraste;
import info.labas.labas.labas.core.model.LaikoLentelesEilute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Justas on 4/23/2017.
 */
@Service
@Repository
public class LaikoLentelesAntrasteService{

    @Autowired
    private LaikoLentelesAntrasteRepository laikoLentelesAntrasteRepository;

    @Autowired
    private LaikoLentelesEiluteService laikoLentelesEiluteService;

    @Transactional
    public List<LaikoLentelesAntraste> findAll() { return laikoLentelesAntrasteRepository.findAll(); }

    @Transactional
    public LaikoLentelesAntraste saveAndFlush(LaikoLentelesAntraste antraste)
    {


        if(antraste != null )
        {
            antraste = laikoLentelesAntrasteRepository.saveAndFlush(antraste);
            long msDiff = antraste.getDarbo_pabaiga().getTime() - antraste.getDarbo_pradzia().getTime();
            int minutes = (int) msDiff/(1000*60);
            int minutesPerPerson = minutes/antraste.getPacientu_sk_per_diena();

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(antraste.getDarbo_pradzia());

            for (int i = 0; i < antraste.getPacientu_sk_per_diena(); i++)
            {

                if (antraste.isPirmadienis() != 0)
                {
                    createTime(calendar, antraste, "Pr", minutesPerPerson);
                }
                if (antraste.isAntradienis() != 0)
                {
                    createTime(calendar, antraste, "A", minutesPerPerson);
                }
                if (antraste.isTreciadienis() != 0)
                {
                    createTime(calendar, antraste, "T", minutesPerPerson);
                }
                if (antraste.isKetvirtadienis() != 0)
                {
                    createTime(calendar, antraste, "K", minutesPerPerson);
                }
                if (antraste.isPenktadienis() != 0)
                {
                    createTime(calendar, antraste, "Pn", minutesPerPerson);
                }
                if (antraste.isSestadienis() != 0)
                {
                    createTime(calendar, antraste, "Š", minutesPerPerson);
                }
                if (antraste.isSekmadienis() != 0)
                {
                    createTime(calendar, antraste, "S", minutesPerPerson);
                }

            }
        }
        return antraste;
    }

    @Transactional
    public List<LaikoLentelesAntraste> listByDoctor(int gydytojoID)
    {
        List<LaikoLentelesAntraste> antrastes = findAll();
        List<LaikoLentelesAntraste> atrinktos = new ArrayList<>();

        for (LaikoLentelesAntraste antraste : antrastes)
        {
            if (antraste.getGydytojo_id() == gydytojoID)
            {
                atrinktos.add(antraste);
            }
        }

        return atrinktos;
    }

    private void createTime(Calendar calendar,LaikoLentelesAntraste antraste, String day, int minutesPerPerson)
    {
        LaikoLentelesEilute eilute = new LaikoLentelesEilute();

        eilute.setLaikas_nuo(calendar.getTime());
        calendar.add(Calendar.SECOND, minutesPerPerson);
        eilute.setLaikas_iki(calendar.getTime());
        eilute.setSavaites_diena(day);
        eilute.setLaiko_lenteles_antrastes_id(antraste.getLaiko_lenteles_antrastes_id());
        laikoLentelesEiluteService.saveAndFlush(eilute);

    }
}
