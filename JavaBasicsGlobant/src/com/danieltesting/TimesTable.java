package com.danieltesting;

public class TimesTable {

    public static void timesTables(int a,int b){
        String table = "*\t|\t";
        int aux = 1;
        int aux2 = 1;

        //This is how it can be printed using a String, this way generates errors after certain amount of values
//        for (int i = 1; i <= a; i++) {
//            for (int j = 1; j <= b; j++) {
//                table += j*i+"\t";
//            }
//
//            if (aux == 1){
//                i=0;
//                aux =0;
//                table += "\n";
//                for (int j = 0; j < b+2; j++) {
//                    table += "---\t";
//                }
//            }
//
//            if (aux2 <= a) {
//                int aux3 = i+1;
//                table += "\n" + aux3 + "\t|\t";
//                aux2++;
//            }
//
//        }
//        System.out.println(table);

        //This is how it is printed using printf()
        boolean aux4=true;
        boolean aux5=true;
        for (int i = 1; i <= a; i++) {

            if (aux5){
                System.out.print("*\t|");
                aux5=false;
            }
            else{
                System.out.print("\t|");
            }

            for (int j = 1; j <= b; j++) {
                System.out.printf("%4d",i*j);
            }

            if (aux4){
                i=0;
                System.out.print("\n-----");
                for (int j = 0; j < b; j++) {
                    System.out.print("----");
                }
                aux4=false;
            }
            if (i<a) {
                System.out.print("\n" + (i + 1));
            }

        }
        System.out.println("\n\nI know know, no jokes here, I was surprised with the result of this (still a little bit\n" +
                "inefficient but I like it)");
    }
}
