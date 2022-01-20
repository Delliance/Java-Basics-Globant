package com.danieltesting;

import javax.swing.*;
import java.util.Arrays;

public class Histogram {
    public static void histogram(int numberGrades){
        double [] grades = new double[numberGrades];
        double grade = 0.2;
        StringBuilder rank1 = new StringBuilder();
        StringBuilder rank2 = new StringBuilder();
        StringBuilder rank3 = new StringBuilder();
        StringBuilder rank4 = new StringBuilder();
        StringBuilder rank5 = new StringBuilder();
        StringBuilder outRange = new StringBuilder();
        int aux1 = 0;
        int aux2 = 0;
        int aux3 = 0;
        int aux4 = 0;
        int aux5 = 0;
        int auxOutRange = 0;
        int max = 0;

        for (int i = 0; i < numberGrades; i++) {
            grades [i] = Double.parseDouble(JOptionPane.showInputDialog("Please enter grade "+i+" (between 0.0 and 5.0):"));
        }

        for (int i = 0; i < numberGrades; i++) {
            if (grades[i]<=1.0&&grades[i]>=0){
                rank1.append("*");
                aux1++;
            }
            else if (grades[i]<=2.0&&grades[i]>=0){
                rank2.append("*");
                aux2++;
            }
            else if (grades[i]<=3.0&&grades[i]>=0){
                rank3.append("*");
                aux3++;
            }
            else if (grades[i]<=4.0&&grades[i]>=0){
                rank4.append("*");
                aux4++;
            }
            else if (grades[i]<=5.0&&grades[i]>=0){
                rank5.append("*");
                aux5++;
            }
            else{
                outRange.append("*");
                auxOutRange++;
            }

            max = Math.max(aux1,Math.max(aux2,Math.max(aux3,Math.max(aux4,Math.max(aux5,auxOutRange))))); //What a horrible piece of code,but I'm lazy to use other

        }

        System.out.println("Grades 0.0-1.0:\t"+rank1.toString());
        System.out.println("Grades 1.1-2.0:\t"+rank2.toString());
        System.out.println("Grades 2.1-3.0:\t"+rank3.toString());
        System.out.println("Grades 3.1-4.0:\t"+rank4.toString());
        System.out.println("Grades 4.1-5.0:\t"+rank5.toString());
        System.out.println("Outside range: \t"+outRange.toString());

        int rowsHist = 6;
        String [][] horizontalHistogram = new String[rowsHist][max];
        int horAux1 = 0;
        int horAux2 = 0;
        int horAux3 = 0;
        int horAux4 = 0;
        int horAux5 = 0;
        int horAuxOut = 0;

        //filling the 2D array just in case
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < max; j++) {
                horizontalHistogram [i][j] = " ";
            }
        }

        // I feel these lines of code can be combined with the previous cycle, but I don't know yet or my head is too tired to figure out that logic
        for (int i = 0; i < numberGrades; i++) {

            if (grades[i]<=1.0&&grades[i]>=0){
                horizontalHistogram [0][horAux1] = "*";
                horAux1++;
            }
            else if (grades[i]<=2.0&&grades[i]>=0){
                horizontalHistogram [1][horAux2] = "*";
                horAux2++;
            }
            else if (grades[i]<=3.0&&grades[i]>=0){
                horizontalHistogram [2][horAux3] = "*";
                horAux3++;
            }
            else if (grades[i]<=4.0&&grades[i]>=0){
                horizontalHistogram [3][horAux4] = "*";
                horAux4++;
            }
            else if (grades[i]<=5.0&&grades[i]>=0){
                horizontalHistogram [4][horAux5] = "*";
                horAux5++;
            }
            else{
                horizontalHistogram [5][horAuxOut] = "*";
                horAuxOut++;
            }

        }

        System.out.println("\n 0.0-1.0|1.1-2.0|2.1-3.0|3.1-4.0|4.1-5.0|Out Range");
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < rowsHist; j++) {
                System.out.print("\t"+horizontalHistogram[j][i]+"\t");
            }
            System.out.println("");
        }

    }
}
