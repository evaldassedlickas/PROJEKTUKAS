package info.labas.labas.labas.core.service.impl;

import info.labas.labas.labas.core.dao.repository.PacientasRepository;
import info.labas.labas.labas.core.model.Pacientas;
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
public class PacientasService{

    @Autowired
    private PacientasRepository pacientasRepository;

    @Transactional
    public List<Pacientas> findAll() { return pacientasRepository.findAll(); }
}
