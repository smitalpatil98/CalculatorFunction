
package com.level1;
import java.util.Scanner;
public class calculator {
    //Method to get input from the user
    public static double input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = sc.nextDouble();
        return number;
    }
    //Method to perform addition and return the result
    public static double add(double num1, double num2)
    {
        return num1 + num2;
    }
    public static void main(String[] args)
    {
        //get input for two numbers
        double num1 = input(); //calling input method here
        double num2 = input();
        //Perform addition
        double result = add(num1,num2);
        //Print the result
        System.out.println("Result of Addition: " + result);
}}
