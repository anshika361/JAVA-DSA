package com.anshika;

import java.util.Scanner;

public class Func_12 {
    public static void main(String[] args) {
        System.out.println("Enter triplet: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(isPythagoreanTriplet(a,b,c));

    }

    static Boolean isPythagoreanTriplet(int a, int b, int c){
       if((a*a + b*b == c*c) || (b*b + c*c == a*a) || (c*c + a*a == b*b)){
           return true;
       }
           return false;
    }
}
