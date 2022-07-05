package com.example;

public class Calculator {
    public static int run(String data){
        String[] dataBits = data.split(" ");
        int n1 = Integer.parseInt(dataBits[0]);
        String operation = dataBits[1];
        int n2 = Integer.parseInt(dataBits[2]);
        int result = 0;

        if (operation.equals("+")){
            result = n1 + n2;
        } else if (operation.equals("-")){
           result = n1-n2;
        }else if (operation.equals("*")){
            result = n1*n2;
        }else if(operation.equals("/")){
            result = n1/n2;
        }
        return result;
    }
}
