package com.level1;
import java.util.Scanner;
public class NestingMethods
{
    void volume(double height,double length,double breadth)
    {
        double volume = (height*length-breadth);
        System.out.println("The volume of cuboid : " +volume);
    }
   void area(double height,double length,double breadth)
   {
       double area = 2*(length*breadth)+(breadth*height)+(length*height);
       System.out.println("The area of cuboid is" +area);
       //Calling the volume method here:nestingmethods
       volume(height,length,breadth);
   }
   void perimeter(double height,double length,double breadth)
   {
       double perimeter = 4*(length+breadth+height);
       System.out.println("The perimeter of cuboid: "+perimeter);
       //Calling the area method here:nestingmethods
       area(height,length,breadth);

   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length,breadth and heigth: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double height = sc.nextDouble();

        //Object creation
        NestingMethods N1 = new NestingMethods();
        N1.perimeter(height,length,breadth);
        sc.close();
    }
}
