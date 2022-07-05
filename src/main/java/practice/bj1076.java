package practice;

import java.util.Scanner;

public class bj1076 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
//        int [] value = {0,1,2,3,4,5,6,7,8,9};
//        double [] multiply = {1, 10,
        int value1 = 0;
        int value2 = 0;
        double multiply = 0;
        for (int i = 0; i < color.length; i++) {
            if (a.equals(color[i])) {
                value1 = i*10;
            } if (b.equals(color[i])) {
                value2 = i;
            } if (c.equals(color[i])) {
                 multiply = Math.pow(10, i);
            }
        } double ohm = ((value1 + value2) * multiply);
        System.out.println(Math.round(ohm));
    }
}

