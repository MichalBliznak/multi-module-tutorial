package org.codedesigner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EvenOddApplication {

    private EvenOddService evenOddService;

    @Autowired
    public EvenOddApplication(EvenOddService evenOddService) {
        this.evenOddService = evenOddService;
    }

    @GetMapping("/validate/")
    public String isEvenOrOdd(
            @RequestParam("number") Integer number) {
        return evenOddService.isEvenOrOdd(number);
    }

    public static void main(String[] args) {
        SpringApplication.run(EvenOddApplication.class, args);
    }
}