package info.labas.labas.labas.core.service.impl;

import info.labas.labas.labas.core.dao.repository.AsmuoRepository;
import info.labas.labas.labas.core.dao.repository.GydytojasRepository;
import info.labas.labas.labas.core.model.Asmuo;
import info.labas.labas.labas.core.model.Gydytojas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Console;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Justas on 4/23/2017.
 */
@Service
@Repository
public class GydytojasService {

    @Autowired
    private GydytojasRepository gydytojasRepository;

    @Autowired
    private AsmuoRepository asmuoRepository;


    @Transactional
    public List<Gydytojas> findAll() { return gydytojasRepository.findAll(); }

    @Transactional
    public List<Asmuo> searchListByVardasPavarde(String vardas, String pavarde)
    {
        List<Asmuo> found = new ArrayList<>();
        List<Gydytojas> gydytojai = gydytojasRepository.findAll();
        if (vardas == null || pavarde == null)
        {
        }
        for (Gydytojas gydytojas : gydytojai)
        {
            System.out.println("TUREJO KAZKA RAST");
            System.out.println(asmuoRepository.getOne(gydytojas.getAsmens_kodas()).getVardas());
            System.out.println(vardas);
            if (asmuoRepository.getOne(gydytojas.getAsmens_kodas()).getVardas().equals(vardas) ||
                    asmuoRepository.getOne(gydytojas.getAsmens_kodas()).getPavarde().equals(pavarde))
            {
                found.add(asmuoRepository.getOne(gydytojas.getAsmens_kodas()));
                System.out.println("TUREJO KAZKA RAST");
            }
        }
        return found;
    }

    @Transactional
    public Gydytojas searchGydytojasByAsmensKodas(String asmensKodas)
    {
        List<Gydytojas> gydytojai = gydytojasRepository.findAll();
        for (Gydytojas gydytojas : gydytojai)
        {
            if (gydytojas.getAsmens_kodas().equals(asmensKodas))
            {
                return gydytojas;
            }
        }
        return null;
    }
}
