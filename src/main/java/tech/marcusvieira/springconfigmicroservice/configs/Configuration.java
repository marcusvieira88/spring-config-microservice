package tech.marcusvieira.springconfigmicroservice.configs;

import org.springframework.beans.factory.annotation.Value;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Value("${configA}")
    private String configA;
    @Value("${configB}")
    private String configB;

    public String getConfigA() {
        return configA;
    }

    public void setConfigA(String configA) {
        this.configA = configA;
    }

    public String getConfigB() {
        return configB;
    }

    public void setConfigB(String configB) {
        this.configB = configB;
    }
}
