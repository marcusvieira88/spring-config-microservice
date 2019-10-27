package tech.marcusvieira.springconfigmicroservice.configs;

import org.springframework.beans.factory.annotation.Value;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Value("${config}")
    private String config;
    @Value("${configb}")
    private String configB;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getConfigB() {
        return configB;
    }

    public void setConfigB(String configB) {
        this.configB = configB;
    }
}
