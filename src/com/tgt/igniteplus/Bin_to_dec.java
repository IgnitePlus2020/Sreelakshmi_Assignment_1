package com.tgt.igniteplus;
import java.util.*;
public class Bin_to_dec
{
    public static int BinToDec(int n) {
        int num = n;
        int dec = 0;
        int base = 1;
        int temp = num;
        while (temp > 0) {
            int dig = temp % 10;
            temp = temp / 10;

            dec += dig * base;

            base = base * 2;
        }

        return dec;
    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any binary value:");
        n = in.nextInt();
        System.out.print("Decimal value of " + n + " is: " + BinToDec(n));

    }
}

