package com.bridgelabz;

import java.util.Scanner;

public class CouponNumber {

    public static void main(String[] args) {
        int dist = 1, count = 0;
        System.out.println("Enter the Total no of coupons Number : ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int[] colt = new int[n];

        while (dist <= n) {
            int value = (int) (Math.random() * n);
            count++;
            System.out.println("Generated value " + (value + 1));
            if (colt[value] != value + 1) {
                dist++;
                colt[value] = value + 1;
            }
        }
        System.out.println("Total no of trials to get "+n+" diffrent coupon number's are "+count);
        System.out.println(" ");
        System.out.println("Array : ");
        for (int i=0; i<n; i++){
            System.out.println(i+" elements in the array is "+colt[i]);


        }

    }
}
