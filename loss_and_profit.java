//A program to accept selling price and cost price for user and find out profit or loss.

import java.util.*;
class loss_and_profit
{
    public static void main(String args[])
    {
        int selling_price,cost_pric,diff;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Selling price");
        selling_price=sc.nextInt();
        System.out.println("Enter Cost price");
        cost_pric=sc.nextInt();
        diff=selling_price-cost_pric;

        if(selling_price>cost_pric)
        {
            System.out.println("Good you are in profit of about "+diff);
        }
        else
        {
            System.out.println("Bad you are in loss of about "+diff);
        }

 
    }
}