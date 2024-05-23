package com.level1;
public class MethodOverloading
{
    public int area(int side)
    {
        System.out.println("Area of square is: ");
        return 2*side;
    }
    public double area(double radius)
    {
        System.out.println("Area of square: ");
        return 3.14*radius*radius;
    }
    public int area(int length,int breadth)
    {
        System.out.println("Area of rectangle is");
        return length*breadth;
    }
    public static void main(String[] args)
    {
   //Method overloading
        MethodOverloading area1 = new MethodOverloading();
        System.out.println(area1.area(9));
        System.out.println(area1.area(5,6));
        System.out.println(area1.area(8));
    }
}
