package com.danieltesting;

import java.util.Arrays;

public class Encryptor {

    public static void encryption(String textHere){

        int a = (int) (Math.random()*10000);
        String toEncrypt = textHere;
        int [] numbers = new int[textHere.length()];
        int [] encryptHere = new int [textHere.length()];

        for (int i = 0; i < toEncrypt.length(); i++) {

            numbers[i] = toEncrypt.charAt(i);
            encryptHere [i] = numbers[i]+a;

        }

        System.out.println("your encrypted text is: "+ Arrays.toString(encryptHere)+" Copy it without the parenthesis");
        System.out.println("Your key is: "+a+" Without this key you won't be able to decrypt the code");
    }

    public static void decryptor(String code, int key){

        int [] encrypted = new int[code.length()]; //I know there is a lot of code that can be optimized
        char [] decrypted = new char[code.length()];
        int aux1 = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {

            if (code.charAt(i)==','){
                encrypted [aux1] = Integer.parseInt(sb.toString());
                aux1++;
                sb.setLength(0);
            }else if (code.charAt(i)==' ') {
            }
            else {
                sb.append(Character.getNumericValue(code.charAt(i)));
            }

        }
        encrypted [aux1] = Integer.parseInt(sb.toString());
        sb.setLength(0);

        for (int i = 0; i <= aux1; i++) {
            sb.append ((char) (encrypted [i]-key));
        }

        System.out.println(sb.toString());

    }

}
