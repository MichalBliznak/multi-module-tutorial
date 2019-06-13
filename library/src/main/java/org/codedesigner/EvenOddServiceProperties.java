package org.codedesigner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EvenOddServiceProperties {
    @Value("${service.message}")
    public String message;
}
