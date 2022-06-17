//A program to accept a no from user if no is even than find out the cube.

import java.util.*;
class even_or_not
{
    public static void main(String args[])
    {
        int value, cube; // variable declarition
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Value:");
        value=sc.nextInt();
        if(value%2==0)
        {
            System.out.println("Entered value is an Even number");
            cube=value*value*value;
            System.out.println("Cube of the value is: "+cube);
        }
        else
        {
            System.out.println("Entered value is an odd number");
        }
    }
}