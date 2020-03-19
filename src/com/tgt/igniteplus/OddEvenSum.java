package com.tgt.igniteplus;

import java.util.Scanner;

public class OddEvenSum
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,odd_sum=0,even_sum=0;
        System.out.println("Enter N");
        n = in.nextInt();
        for(int i=0;i<n+1;i++)
        {
            if(i%2!=0)
               odd_sum = odd_sum+i;
            else
                even_sum=even_sum+i;
        }
        System.out.println("Even sum= "+even_sum);
        System.out.println("Odd sum= "+odd_sum);




    }
}
