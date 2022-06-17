// Programe to calculate area and the perimeter of the rectangle 

import java.util.*;
class area_of_rectangle
{
    public static void main(String args[])
    {
        float length,breath,area,perimeter;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        length=sc.nextFloat();
        System.out.println("Enter the breath of the rectangle");
        breath=sc.nextFloat();
        area=length*breath;
        System.out.println(area+ " is the area of the rectangle");
        perimeter=2*(length+breath);
        System.out.println(perimeter+ " is the perimeter of the rectangle");


    }
}