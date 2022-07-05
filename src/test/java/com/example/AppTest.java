package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void addTest1(){
        int rs = Calculator.add("10 + 10");
        assertEquals(30, rs);
    }

    @Test
    public void addTest2(){
        int rs = Calculator.add("20 + 20");
        assertEquals(40,rs);
    }
}

