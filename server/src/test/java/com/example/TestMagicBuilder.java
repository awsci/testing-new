package com.example;

import static org.junit.Assert.assertEquals;

public class TestMagicBuilder {

    public void testLucky() {
        assertEquals(7, MagicBuilder.getLucky());
    }

}