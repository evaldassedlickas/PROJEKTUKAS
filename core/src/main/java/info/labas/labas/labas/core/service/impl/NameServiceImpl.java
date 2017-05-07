package info.labas.labas.labas.core.service.impl;

import info.labas.labas.labas.core.service.NameService;
import org.springframework.stereotype.Service;

@Service
public class NameServiceImpl implements NameService {

    @Override
    public String getName() {
        return "Foo bar";
    }

}
