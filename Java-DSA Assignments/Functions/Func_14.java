package com.anshika;

import java.util.Scanner;

public class Func_14 {
    public static void main(String[] args) {
        System.out.println("Enter the no. of terms: ");
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        System.out.println("The sum of first "+ n + " natural numbers is: "+ sum(n));
    }

    static int sum(int n){
        int sum = (n*(n+1))/2;
        return sum;
    }
}
