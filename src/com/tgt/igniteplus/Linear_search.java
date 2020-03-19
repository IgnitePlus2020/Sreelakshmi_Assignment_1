package com.tgt.igniteplus;
import java.util.*;
public class Linear_search {
    public static void main(String[] args) {
        int n, i, key,flag=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no. of elements in an array");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements to the array");
        for (i = 0; i < n; i++)
            a[i] = in.nextInt();
        System.out.println("Enter the element to be searched");
        key = in.nextInt();
        for (i = 0; i < n; i++) {
            if (key == a[i])
            {
                System.out.println("element found at index" + (i + 1));
                flag=1;
                break;
            }}
        if(flag==0)
            System.out.println("element not found");
    }
}
