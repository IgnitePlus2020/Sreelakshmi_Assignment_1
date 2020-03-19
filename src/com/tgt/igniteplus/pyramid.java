package com.tgt.igniteplus;

import java.util.Scanner;
import java.util.*;
public class pyramid
{
    public static void main(String[] args)
    {
        // write your code here
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("enter n");
        n=in.nextInt();
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
