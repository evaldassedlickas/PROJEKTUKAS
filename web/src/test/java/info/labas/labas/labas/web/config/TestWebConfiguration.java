package info.labas.labas.labas.web.config;

import info.labas.labas.labas.web.config.SimpleWebConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(SimpleWebConfiguration.class)
public class TestWebConfiguration {

}
