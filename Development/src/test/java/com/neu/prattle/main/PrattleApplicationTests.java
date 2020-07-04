package com.neu.prattle.main;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for PrattleApplication.
 */
public class PrattleApplicationTests {
    private PrattleApplication application;

    @Before
    public void setUp() {
        application = new PrattleApplication();
    }

    @Test
    public void testClass() {
        assertNotNull(application);
        assertNotNull(application.getClasses());
        assertEquals(5, application.getClasses().size());
    }
}
