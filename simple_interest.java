// A programe to calculate simple interest 

import java.util.*;
class simple_interest
{
    public static void main(String args[]) 
    {
        float principal_amt,rate_of_interestd,time_duration,simple_interest; // Variables
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amt: ");
        principal_amt=sc.nextFloat();
        System.out.println("Enter the Rate of interest: ");
        rate_of_interestd=sc.nextFloat();
        System.out.println("Enter the time duration: ");
        time_duration=sc.nextFloat();
        simple_interest=principal_amt*rate_of_interestd*time_duration/100; // Simple interest formula 
        System.out.println("Your simple interest is: "+simple_interest);

    }
}