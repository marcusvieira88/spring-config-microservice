package tech.marcusvieira.springconfigmicroservice.resource;

public class ConfigResource {

    private String configA;
    private String configB;

    public ConfigResource(String configA, String configB) {
        this.configA = configA;
        this.configB = configB;
    }

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
