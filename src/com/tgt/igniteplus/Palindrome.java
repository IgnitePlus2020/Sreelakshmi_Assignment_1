package com.tgt.igniteplus;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str, rev = "";
        int len;
        System.out.println("enter a string");
        str = in.nextLine();
        len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev))
            System.out.println("The string is palindrome");
        else
            System.out.println("The string is not palindrome");
    }
}
