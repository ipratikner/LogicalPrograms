package com.bridgelabz;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        System.out.println("Enter the Number : ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int a=0, b=1;
        int c;
        for (int i=1; i<=n; i++)
        {
            c= a+b;
            System.out.println(""+c);
            a=b;
            b=c;

        }
    }
}
