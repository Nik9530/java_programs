//Write a program that creates integer array of 10 elements, accepts values of arrays and then displays the values.

import java.util.*;
class array1
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter your range: ");
        int range=sc.nextInt();
        int numbers[]=new int[range];
        for(int i=0;i<range;i++)
        {
            numbers[i]=sc.nextInt();
        }
        System.out.println("the values are below");
        for(int j=0;j<range;j++)
        {
            System.out.println(numbers[j]);
        }



    }

}