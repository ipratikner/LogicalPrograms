package com.bridgelabz;
import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args)
    {
        long n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextLong();

        int i=1;
        long sum=0;
        while(i <= n/2) {

             if(n % i == 0) {
         //calculates the sum of factors
                sum = sum + i;
                  }
            i++;
        }


        if(sum==n) {
            System.out.println(n+" is a perfect number.");
        }
        else
            System.out.println(n+" is not a perfect number.");
    }
}
