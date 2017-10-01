package com.zaptrapp.nishanth.testingexample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nishanth on 01-Oct-17.
 */
public class MainActivityTest {
    @BeforeClass
    public static void beforeAllTest(){
        System.out.println("Starting MainActivity test");
    }
    @Before
    public void beforeEachTest(){
        System.out.println("Starting Test");
    }

    @Test
    public void testUserNishanth(){
//        assertTrue("Failed",MainActivity.isUserAvailable("Nishanth"));
        assertEquals(MainActivity.isUserAvailable("Nishanth"),true);
    }
    @Test
    public void testUserPrasanna(){
        assertTrue("Failed",MainActivity.isUserAvailable("Prasanna"));

    }

    @After
    public void afterEachTest(){
        System.out.println("Ending Test");
    }

    @AfterClass
    public static void afterAllTest(){
        System.out.println("Ending MainActivity test");
    }

}