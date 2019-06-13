package org.codedesigner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {EvenOddServiceConfig.class})
public class EvenOddServiceConfigTest {

    @Autowired
    protected EvenOddService evenOddService;

    @Test
    public void evenOddServiceIsLoaded() {
        assertNotNull(evenOddService);
    }

}