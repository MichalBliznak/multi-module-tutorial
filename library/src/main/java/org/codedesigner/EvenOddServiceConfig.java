package org.codedesigner;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@EnableConfigurationProperties
@Configuration
@ComponentScan(basePackages = {"org.codedesigner"})
public class EvenOddServiceConfig {
}
