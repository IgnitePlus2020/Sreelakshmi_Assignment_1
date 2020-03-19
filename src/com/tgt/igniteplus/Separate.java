package com.tgt.igniteplus;

import java.util.Scanner;

public class Separate
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        float num;
        System.out.println("Enter number");
        num=in.nextFloat();
        float f=(num%1);
        int w=(int)(num-f);

        System.out.println(w+" "+f);}
}
