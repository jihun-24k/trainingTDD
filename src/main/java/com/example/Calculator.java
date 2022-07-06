package com.example;

public class Calculator {
    public static int calc(String data){
        String[] dataBits = data.split(" ");
        int n1 = Integer.parseInt(dataBits[0]);
        String operation1 = dataBits[1];
        int n2 = Integer.parseInt(dataBits[2]);
        String operation2 = dataBits[3];
        int n3 = Integer.parseInt(dataBits[4]);


        int result = 0;


        if (operation1.equals("+")){
            result = n1 + n2;
        } else if (operation1.equals("-")){
           result = n1-n2;
        }else if (operation1.equals("*")){
            result = n1*n2;
        }else if(operation1.equals("/")){
            result = n1/n2;
        }

        return result;
    }
}
