package com.anji.allways.business.auth.test;

public class Calculate {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {

        return a - b;

    }

    public int multiply(int a, int b) {
        int c = 2;
        if (a==1){
            return 0;
        }else {
            return a*b;
        }


    }

    public int divide(int a, int b) {

        return a / b;

    }
}
