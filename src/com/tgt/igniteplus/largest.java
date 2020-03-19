package com.tgt.igniteplus;

import java.util.Scanner;

public class largest
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, large, sec_large;
        System.out.println("Enter 3 numbers");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if (a > b && a > c) {
            System.out.println("Largest: " + a);
            if (b > c)
                System.out.println("Second largest: " + b);
            else
                System.out.println("Second largest: " + c);
        }
        if (b > a && b > c) {
            System.out.println("Largest: " + b);
            if (a > c)
                System.out.println("Second largest: " + a);
            else
                System.out.println("Second largest: " + c);
        }
        if (c > a && c > b) {
            System.out.println("Largest: " + c);
            if (a > b)
                System.out.println("Second largest: " + a);
            else
                System.out.println("Second largest: " + b);
        }
    }
}
