package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void addTest1(){
        int rs = Calculator.run("10 + 10");
        assertEquals(20, rs);
    }

    @Test
    public void addTest2(){
        int rs = Calculator.run("20 + 20");
        assertEquals(40,rs);
    }

    @Test
    public void addTest4(){
        int rs = Calculator.run("30 + 20");
        assertEquals(50, rs);
    }

    @Test
    public void minusTest1(){
        int rs = Calculator.run("30 - 20");
        assertEquals(10,rs);
    }

    @Test
    public void minusTest2(){
        int rs = Calculator.run("40 - 20");
        assertEquals(20,rs);
    }
}


