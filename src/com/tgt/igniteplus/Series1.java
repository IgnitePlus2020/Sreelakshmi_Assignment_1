package com.tgt.igniteplus;
import java.util.*;
public class Series1
{
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = in.nextInt();
        System.out.println("Series=");
        int a = 1, b = 0, i = 0;
        while (b < n) {
            b = a + (i * i);
            if (i % 2 != 0)
                System.out.print(b * (-1) + "\t");
            else
                System.out.print(b + "\t");
            a = b;
            i += 1;
        }
    }}

    //1 -2 6 -15 31 -56