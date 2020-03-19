package com.tgt.igniteplus;
import java.util.*;
public class Series23 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = in.nextInt();
        int a = 1, b = -2;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(a + "\t");
                a = a + 3;
            } else {
                System.out.print(b + "\t");
                b = b - 4;
            }
        }
    }
}

//1 -2 4 -6 7 -10 10 -14........