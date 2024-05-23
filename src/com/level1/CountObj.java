package com.level1;

public class CountObj
{
    public static int counter = 0;

    public CountObj()
    {
        counter++;
    }

    public static void main(String[] args)
    {
        CountObj obj1 = new CountObj();
        CountObj obj2 = new CountObj();
        CountObj obj3 = new CountObj();
        System.out.println("number of objects called: "+counter);
    }
}
