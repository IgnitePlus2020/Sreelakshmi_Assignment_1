package com.tgt.igniteplus;

import java.util.Scanner;
import java.util.*;
public class Triangle
{
    public static void main(String[] args) {
        int n, i, j;
        Scanner in = new Scanner(System.in);
        System.out.println("enetr n");
        n = in.nextInt();
        for (i = 0; i < n; i++)
        {
            for (j = n - i; j > 1; j--) {
                System.out.print(" ");

            }
            for (j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
