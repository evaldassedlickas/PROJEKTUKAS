package info.labas.labas.labas.core.service.impl;

import info.labas.labas.labas.core.dao.repository.AsmuoRepository;
import info.labas.labas.labas.core.model.Asmuo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Justas on 4/22/2017.
 */
@Service
@Repository
public class AsmuoService{

    @Autowired
    private AsmuoRepository asmuoRepository;

    @Transactional
    public List<Asmuo> findAll() { return asmuoRepository.findAll(); }

    @Transactional
    public Asmuo gautiAsmeniPagalAsmensKoda(String asmensKodas)
    {
        return asmuoRepository.findOne(asmensKodas);
    }

    @Transactional
    public Asmuo tikrintiPrisijungimoDuomenis(String asmensKodas, String slaptazodis)
    {
        Asmuo asmuo = this.gautiAsmeniPagalAsmensKoda(asmensKodas);
        if (asmuo != null && asmuo.getSlaptazodis().equals(slaptazodis))
        {
            return asmuo;
        }
        return null;
    }
}
