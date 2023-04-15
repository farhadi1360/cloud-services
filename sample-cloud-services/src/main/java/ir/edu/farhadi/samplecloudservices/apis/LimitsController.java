package ir.edu.farhadi.samplecloudservices.apis;

import ir.edu.farhadi.samplecloudservices.Config;
import ir.edu.farhadi.samplecloudservices.models.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    Config config;
    @GetMapping("/limits")
    public Limit retrieveLimitsFromConfig(){
        return new Limit(config.getMaximum(), config.getMinimum());
    }
}
