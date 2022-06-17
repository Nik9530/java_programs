//Write a program to accept radius from user and find out the area of circle and circumstances of circle

import java.util.*;
class area_of_circle
{
    public static void main(String args[])
    {
        double radius,area,circumfrence;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        radius=sc.nextDouble();
        area=Math.PI*radius*radius;
        System.out.println("area of circle is: "+area);
        circumfrence=2*Math.PI*radius;
        System.out.println("circumfrence of circle is: "+circumfrence);



    }
}