package info.labas.labas.labas.core.service.impl;

import info.labas.labas.labas.core.dao.repository.AtaskaitaRepository;
import info.labas.labas.labas.core.model.Ataskaita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Justas on 4/25/2017.
 */
@Service
@Repository
public class AtaskaitaService {

    @Autowired
    private AtaskaitaRepository ataskaitaRepository;

    @Transactional(readOnly = true)
    public List<Ataskaita> getAll()
    {
        return ataskaitaRepository.findAll();
    }

    @Transactional
    public Ataskaita saveAndFlush(Ataskaita ataskaita)
    {
        if(ataskaita != null )
        {
            ataskaita = ataskaitaRepository.saveAndFlush(ataskaita);
        }
        return ataskaita;
    }


}
