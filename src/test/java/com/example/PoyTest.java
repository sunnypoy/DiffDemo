package com.example;

import org.junit.Assert;

import static org.junit.Assert.*;

public class PoyTest {

    @org.junit.Test
    public void calculation() {
        Poy poy = new Poy();
        int result = poy.calculation(1,1);
        Assert.assertEquals("multiply test error", 1, result);
    }
}