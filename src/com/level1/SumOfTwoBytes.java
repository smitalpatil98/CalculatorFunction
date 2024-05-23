package com.level1;

import java.util.Scanner;

public class SumOfTwoBytes
{
    public static byte addition(byte a,byte b)
    {
       return (byte)(a+b);
    }
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        byte num1 = sc.nextByte();
        System.out.println("Enter the second number: ");
        byte num2 = sc.nextByte();
        System.out.println("The addition of two byte numbers is :" +addition(num1,num2));
        sc.close();
    }
}
