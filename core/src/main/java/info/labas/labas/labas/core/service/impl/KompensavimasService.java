package info.labas.labas.labas.core.service.impl;

import info.labas.labas.labas.core.dao.repository.KompensavimasRepository;
import info.labas.labas.labas.core.model.Kompensavimas;
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
public class KompensavimasService {

    @Autowired
    private KompensavimasRepository kompensavimasRepository;

    @Transactional
    public List<Kompensavimas> findAll() { return kompensavimasRepository.findAll(); }
}
