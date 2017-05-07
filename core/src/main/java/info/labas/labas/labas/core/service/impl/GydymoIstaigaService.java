package info.labas.labas.labas.core.service.impl;

import info.labas.labas.labas.core.dao.repository.GydymoIstaigaRepository;
import info.labas.labas.labas.core.model.GydymoIstaiga;
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
public class GydymoIstaigaService{

    @Autowired
    private GydymoIstaigaRepository gydymoIstaigaRepository;

    @Transactional
    public List<GydymoIstaiga> findAll() { return gydymoIstaigaRepository.findAll(); }
}
