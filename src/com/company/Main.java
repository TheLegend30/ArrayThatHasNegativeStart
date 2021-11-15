package com.company;

public class Main {

    public static void main(String[] args) {
        NegArray negArray = new NegArray(1,2);
        negArray.setValue(1000,1);
        System.out.println(negArray.getValue(1));
    }
}
