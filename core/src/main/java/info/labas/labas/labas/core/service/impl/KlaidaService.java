package info.labas.labas.labas.core.service.impl;

import info.labas.labas.labas.core.dao.repository.KlaidaRepository;
import info.labas.labas.labas.core.model.Klaida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Justas on 4/23/2017.
 */
@Service
@Repository
public class KlaidaService {

    @Autowired
    private KlaidaRepository klaidaRepository;

    @Transactional
    public List<Klaida> findAll() { return klaidaRepository.findAll(); }
}
