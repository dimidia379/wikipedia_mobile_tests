package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:selenoid.properties"})
public interface SelenoidConfig extends Config {
    String selenoidUser();
    String selenoidPassword();
}
