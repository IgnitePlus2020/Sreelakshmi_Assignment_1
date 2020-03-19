package com.tgt.igniteplus;

import java.util.Scanner;
import java.lang.Math;
public class Sequence3
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter number");
        n = in.nextInt();
        for(int i=1;i<n;i++)
        {
            System.out.print((int)Math.pow(i,i)+" , ");
        }
        System.out.println((int)Math.pow(n,n));
    }
}

//1,4,27,256,3125..........N