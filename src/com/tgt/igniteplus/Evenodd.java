package com.tgt.igniteplus;

import java.util.Scanner;

public class Evenodd
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter number");
        num=in.nextInt();
        if(num%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
