package info.labas.labas.labas.web.config;

import info.labas.labas.labas.core.config.SimpleCoreConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {SimpleCoreConfiguration.class})
@ComponentScan(basePackages = "info.labas.labas.labas.web")
public class SimpleWebConfiguration {

}
