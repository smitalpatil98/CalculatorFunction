package com.level1;
import java.util.Scanner;
public class Area
{
    public int calculateRectangleArea(int length,int breadth)
    {
        return length*breadth;
    }
    public double CalculateTraingleArea(int base,int height)
    {
    return 0.5*base*height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth = sc.nextInt();
        sc.close();

        Area areaCalculator = new Area();
        int rectangleArea = areaCalculator.calculateRectangleArea(length,breadth);
        double triangleArea = areaCalculator.CalculateTraingleArea(length,breadth);

        System.out.println("Area of Rectangle:-" +rectangleArea);
        System.out.println("Area of triangle:-" +triangleArea);

    }
}
