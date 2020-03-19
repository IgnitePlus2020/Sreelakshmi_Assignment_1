package com.tgt.igniteplus;
import java.util.Scanner;
public class Dec_to_Bin {
    public static void DecToBin(int n) {
        int[] bin = new int[1000];
        int i = 0;
        while (n > 0) {
            bin[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(bin[j]);
    }

    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value:");
        num = in.nextInt();
        DecToBin(num);
    }

}
