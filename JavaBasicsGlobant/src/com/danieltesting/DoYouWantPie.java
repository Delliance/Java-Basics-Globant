package com.danieltesting;

public class DoYouWantPie {

    public static double setPie(){
        double sum=0.0;
        int maxDenominator = 10000;
        double aux = 0;

        for (int denominator = 3; denominator <= maxDenominator; denominator+=2) {

            if (denominator%4==1) {
                sum += 1.0/denominator;
            }
            else if (denominator%4==3) {
                sum -= 1.0/denominator;
            }
            else {
                System.out.println("Something went wrong here");
            }
        }
        double pie=4*(1+sum);
        return pie;
    }

}
