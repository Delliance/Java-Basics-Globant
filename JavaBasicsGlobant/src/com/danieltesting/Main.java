package com.danieltesting;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //In this code I combine a lot of basics about Java, for that reason there are bits of code that look different from example to example
        // Please select the example that you want to run
        String[] exampleOptions = {"Hello World",
                "I know how to calculate",
                "I know how to calculate v2.0",
                "Do you want pie?",
                "I want to multiply",
                "Let's encrypt a text",
                "Let's decrypt your text",
                "Histogram"};

        String getExampleOption = (String) JOptionPane.showInputDialog(
                null,
                "Hello chosen one, in this short application I show different aspects of what I\n" +
                        "have been doing in Java, for this reason some  examples will have features that\n" +
                        "others not, such as showing windows to introduce your data, validation, outputs\n"+
                        "in the console, and so on.\n\n"+
                        "To start please select the example you want to run:",
                "Choose Example",
                JOptionPane.QUESTION_MESSAGE,
                null,
                exampleOptions,
                exampleOptions[0]);

        String chosenExample = getExampleOption;

        switch (chosenExample) {
            case "Hello World":

                HelloWorld.printHelloWorld();
                break;

            case "I know how to calculate":

                double gimmeRadius;
                gimmeRadius = Double.parseDouble(JOptionPane.showInputDialog("I will calculate you the area, circumference and diameter of a circle.\nGive me the radius:"));
                System.out.println("The area of the circle is: "+String.format("%.2f",IKnowHowToCalculate.areaCircle(gimmeRadius))+
                        "\nthe circumference of the circle is :"+String.format("%.2f",IKnowHowToCalculate.circunferenceCircle(gimmeRadius))+
                        "\nand finally the diameter is: "+String.format("%.2f",IKnowHowToCalculate.diameterCircle(gimmeRadius)));
                break;

            case "I know how to calculate v2.0":
                int number=0;
                String gimmeNumber = JOptionPane.showInputDialog("I'm lazy so I'll show you several things with one number.\nGimme a whole number please:\n(Don't you dare to write something different)");

                while (true) {
                    if (gimmeNumber == null) {
                        System.exit(0);
                    }
                    else if (gimmeNumber.equalsIgnoreCase("")) {
                        System.out.println("Hmmm I see you didn't select any number, did you expect an error?");
                        break;
                    }
                    else {
                        try {
                            number = Integer.parseInt(gimmeNumber);
                            IKnowHowToCalculate2.aLotOfMath(number);
                            break;
                        }
                        catch (Exception e) {
                            gimmeNumber = JOptionPane.showInputDialog("You rascal, this one has validation.\nEnter a valid number:");
                        }
                    }
                }
                break;

            case "Do you want pie?":
                JOptionPane.showMessageDialog(null,DoYouWantPie.setPie()+"\nWell is a not exactly pie, more\nharmonics will give a closer result!");
                break;

            case "I want to multiply":

                Scanner newScanner = new Scanner(System.in);

                JOptionPane.showMessageDialog(null,"This one will be done in the console\nI'll give you a times table as big as you want:");

                System.out.print("Tell me the number of rows you want: ");
                int int1 = newScanner.nextInt();
                System.out.print("And now the number of columns: ");
                int int2 = newScanner.nextInt();

                TimesTable.timesTables(int1,int2);
                break;

            case "Let's encrypt a text":
                //ignore this I was just testing things
//                String daniel="daniel g";
//                System.out.println(daniel.length());
//                System.out.println(daniel.charAt(0));
//                char a = '5';
//                int c = a;
//                char b = (char) c;
//                System.out.println(c+","+b);

                Encryptor.encryption(JOptionPane.showInputDialog("Please enter the text you want to encrypt\n" +
                        "(you can write whatever you want even\nnumbers, uppercase, spaces, etc.):"));
                break;

            case "Let's decrypt your text":
                Encryptor.decryptor(JOptionPane.showInputDialog("Please enter the code, without parenthesis"), Integer.parseInt(JOptionPane.showInputDialog("Please enter the key")));
                break;

            case "Histogram":
                Histogram.histogram(Integer.parseInt(JOptionPane.showInputDialog("How many grades do you want to input:")));
        }


    }
}
