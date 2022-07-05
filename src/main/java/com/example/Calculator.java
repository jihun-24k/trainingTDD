package com.example;

public class Calculator {
    public static int add(String data){
        String[] dataBits = data.split(" \\+ ");
        int n1 = Integer.parseInt(dataBits[0]);
        int n2 = Integer.parseInt(dataBits[1]);

        return n1+n2;
    }
}
