package com.company;

public class Main {

    public static void main(String[] args) {
	    int start = 5;
        System.out.println(factorial(start));
    }

    public static int factorial(int fac){
        if(fac==0)
            return 1;
        
        return fac * factorial(fac-1);
    }
}
