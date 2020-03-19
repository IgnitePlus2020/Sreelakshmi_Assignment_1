package com.tgt.igniteplus;
import java.util.Scanner;
public class Sequence4
{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n;
            System.out.println("enter value for n");
            n = in.nextInt();
            int[] arr = new int[n];
            arr[0] = 1;
            arr[1] = 4;
            arr[2] = 7;
            for (int i = 3; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            }
            System.out.println("Sequence:");
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + "\t");
        }


}

//1,4,7,12,23,..........N