package info.labas.labas.labas.core.service.impl;

import info.labas.labas.labas.core.dao.repository.DiagnozeRepository;
import info.labas.labas.labas.core.model.Diagnoze;
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
public class DiagnozeService{

    @Autowired
    private DiagnozeRepository diagnozeRepository;

    @Transactional
    public List<Diagnoze> findAll() { return diagnozeRepository.findAll(); }
}
