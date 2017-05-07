package info.labas.labas.labas.core.service.impl;

import info.labas.labas.labas.core.dao.repository.LaikoLentelesEiluteRepository;
import info.labas.labas.labas.core.model.LaikoLentelesAntraste;
import info.labas.labas.labas.core.model.LaikoLentelesEilute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Justas on 4/23/2017.
 */
@Service
@Repository
public class LaikoLentelesEiluteService {

    @Autowired
    private LaikoLentelesEiluteRepository laikoLentelesEiluteRepository;

    @Autowired
    private LaikoLentelesAntrasteService laikoLentelesAntrasteService;

    @Transactional
    public List<LaikoLentelesEilute> findAll() { return laikoLentelesEiluteRepository.findAll(); }

    @Transactional
    public LaikoLentelesEilute saveAndFlush(LaikoLentelesEilute eilute)
    {
        if(eilute != null )
        {
            eilute = laikoLentelesEiluteRepository.saveAndFlush(eilute);
        }
        return eilute;
    }

    @Transactional
    public List<LaikoLentelesEilute> listByDoctorAndDate(int gydytojoID)
    {
        List<LaikoLentelesEilute> eilutes = findAll();
        List<LaikoLentelesEilute> atrinktos = new ArrayList<>();
        List<LaikoLentelesAntraste> gydytojoAntrastes = laikoLentelesAntrasteService.listByDoctor(gydytojoID);

        for (LaikoLentelesEilute eilute : eilutes)
        {
            for ( LaikoLentelesAntraste antraste : gydytojoAntrastes)
            {
                if (antraste.isSiuo_metu_naudojamas() != 0 && eilute.getLaiko_lenteles_antrastes_id() == antraste.getLaiko_lenteles_antrastes_id())
                {
                    atrinktos.add(eilute);
                }
            }
        }

        return atrinktos;
    }
}
