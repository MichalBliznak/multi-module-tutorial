package org.codedesigner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { EvenOddServiceConfig.class })
public class EvenOddServiceConfigTest {

    @Autowired
    protected EvenOddService evenOddService;

    @Autowired
    protected EvenOddServiceProperties evenOddServiceProperties;

    @Test
    public void evenOddServiceIsLoaded() {
        assertNotNull(evenOddService);
    }

    @Test
    public void isOddNumber() {
        assertEquals("Odd", evenOddService.isEvenOrOdd(1));
    }

    @Test
    public void isEvenNumber() {
        assertEquals("Even", evenOddService.isEvenOrOdd(2));
    }

    @Test
    public void evenOddServicePropertiesIsLoaded() {
        assertNotNull(evenOddServiceProperties);
    }

    @Test
    public void isMessageInPropertiesSet() {
        assertEquals("Hello World!", evenOddServiceProperties.message);
    }

}