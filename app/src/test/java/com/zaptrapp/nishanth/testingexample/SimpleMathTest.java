package com.zaptrapp.nishanth.testingexample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nishanth on 01-Oct-17.
 */
public class SimpleMathTest {
    private SimpleMath sm;

    @Before
    public void setup(){
        sm = new SimpleMath();
        System.out.println("ready for testing...");
    }
    @Test
    public void add() throws Exception {
        assertEquals(sm.add(1,2),3);
    }

    @Test
    public void diff() throws Exception {
        assertEquals(sm.diff(2,1),1);

    }

    @Test
    public void div() throws Exception {
        assertEquals("Division Error",sm.div(10,2),4,0);

    }

}