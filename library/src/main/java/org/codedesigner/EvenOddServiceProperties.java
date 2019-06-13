package org.codedesigner;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="service")
public class EvenOddServiceProperties {
    public String message;
}
