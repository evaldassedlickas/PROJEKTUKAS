package info.labas.labas.labas.core.service.impl;

import info.labas.labas.labas.core.dao.repository.VaistasRepository;
import info.labas.labas.labas.core.model.Vaistas;
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
public class VaistasService {

    @Autowired
    private VaistasRepository vaistasRepository;

    @Transactional
    public List<Vaistas> findAll() { return vaistasRepository.findAll(); }
}
