package com.danieltesting;

import java.math.BigInteger;

public class IKnowHowToCalculate2 {

    public static void aLotOfMath(int a){
        String compare = (a>=50) ? a+" is greater or equal to 50" : a+" is less than 50";

        String odd = (a%2 == 0) ? a+" is even" : a+ " is odd";

        BigInteger factorial = BigInteger.ONE;
        for (int i = a; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        int random = (int) (Math.random()*100);

        System.out.println(
                compare+"" +
                "\n"+odd+"" +
                "\n"+"Factorial of "+a+" is: "+factorial+" (this value is a BigInteger, so feel free to use any number)"+
                "\n"+"Your random number of the day between 0 and 100 is: *insert drums here* "+random+"" +
                "\nDisclaimer: I'm not responsible on what you use these numbers for.");
    }

}
