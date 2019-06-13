package org.codedesigner;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.codedesigner"})
@EnableConfigurationProperties
public class EvenOddServiceConfig {
}
