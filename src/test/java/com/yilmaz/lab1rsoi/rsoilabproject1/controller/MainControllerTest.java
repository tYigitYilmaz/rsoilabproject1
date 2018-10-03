package com.yilmaz.lab1rsoi.rsoilabproject1.controller;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainControllerTest {

    private static final String TEST_STRING = "world";
    private MainController mainController;

    @Before
    public void init() {
        mainController = new MainController();
    }

    @Test
    public void testHelloUser() {
        String response = mainController.helloUser(TEST_STRING);

        assertNotNull(response);
        assertEquals("Hello " + TEST_STRING, response);
    }
}