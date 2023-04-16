package ir.edu.farhadi.samplecloudservices.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
@Data
public class Config {
    private int maximum;
    private int minimum;
}
