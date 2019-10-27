package tech.marcusvieira.springconfigmicroservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.marcusvieira.springconfigmicroservice.configs.Configuration;
import tech.marcusvieira.springconfigmicroservice.resource.ConfigResource;

@RestController
public class ConfigController {

    @Autowired
    private Configuration configuration;

    @GetMapping(name = "/configs")
    public ConfigResource getConfigs() {
        return new ConfigResource(configuration.getConfig(), configuration.getConfigB());
    }
}
