package info.labas.labas.labas.core.service.impl;

import info.labas.labas.labas.core.dao.repository.NusiskundimasRepository;
import info.labas.labas.labas.core.model.Nusiskundimas;
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
public class NustatymaiService{

    @Autowired
    private NusiskundimasRepository nusiskundimasRepository;

    @Transactional
    public List<Nusiskundimas> findAll() { return nusiskundimasRepository.findAll(); }
}
