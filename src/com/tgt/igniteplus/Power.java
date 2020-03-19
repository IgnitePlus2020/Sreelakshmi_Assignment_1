package com.tgt.igniteplus;
import java.util.*;

public class Power {

    public static void main(String[] args) {
        int n, X, res = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of X and n (X^n):");
        n = in.nextInt();
        X = in.nextInt();
        for (int i = 1; i <= X; i++) {
            res = res * n;
        }
        System.out.println("Result=" + res);
    }
}
