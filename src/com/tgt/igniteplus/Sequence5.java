package com.tgt.igniteplus;
import java.util.Scanner;
import java.lang.Math;

public class Sequence5
{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n;
            System.out.println("Enter number");
            n = in.nextInt();
            for (int i = 1; i < n; i++)
            {
                if(i==4)
                    continue;
                System.out.print((int)Math.pow(i,2)+" , ");

            }
            System.out.println((int)Math.pow(n,2));
        }

}

//1,4,9,25,36.......