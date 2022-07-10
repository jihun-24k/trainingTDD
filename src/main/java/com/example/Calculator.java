package com.example;

public class Calculator {
    public static int calc(String data){
        boolean isBarcket = data.contains("(");
        boolean isSum = data.contains(" + ") ;
        boolean isMinus = data.contains(" - ");
        boolean isMulti = data.contains(" * ");
        boolean isDivide = data.contains(" / ");

        if (isBarcket){
            int iStart = data.indexOf("(");
            int iEnd = data.lastIndexOf(")");

            return 2 * calc(data.substring(iStart+1,iEnd));
        }

        if(isSum){
            int idxSum = data.indexOf(" + ");
            return calc(data.substring(0,idxSum)) + calc(data.substring(idxSum+3));
        }else if(isMinus){
            int idxMinus = data.indexOf(" - ");
            return calc(data.substring(0,idxMinus)) - calc(data.substring(idxMinus+3));
        }
        else if (isMulti) {
            int idxMulti = data.indexOf(" * ");
            return calc(data.substring(0,idxMulti)) * calc(data.substring(idxMulti+3));
        }
        else if (isDivide){
            int idxDivide = data.indexOf(" / ");
            return calc(data.substring(0,idxDivide)) / calc(data.substring(idxDivide+3));
        }

        return Integer.parseInt(data);
    }
}