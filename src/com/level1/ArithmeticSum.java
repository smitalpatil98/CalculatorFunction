package com.level1;

public class ArithmeticSum
{
    public int add( int a, int b)
    {
        return a + b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public int add(int a,int b,int c,int d)
    {
        return a + b;
    }
    public static void main(String[] args)

    {
        ArithmeticSum sum = new ArithmeticSum();
        System.out.println("the addition is :" +sum.add(8,1));
        System.out.println("the addition is :" +sum.add(7,15,6));
        System.out.println("the addition is :" +sum.add(5,6,8,9));

    }
}
