package org.codedesigner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { EvenOddApplication.class })
public class EvenOddApplicationTest {

    @Autowired
    protected EvenOddService evenOddService;

    @Test
    public void evenOddServiceIsLoaded() {
        assertNotNull(evenOddService);
    }
}
