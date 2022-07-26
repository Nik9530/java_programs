package objects;
import java.util.*;  // java inbuild package

public class arithmetic_sums
{
	int a,b;	// globle variable 
	public static void main(String args[])	// main method 
	{
		
		arithmetic_sums obj=new arithmetic_sums();
		obj.accept();
		obj.addition();
		obj.multiplication();
		obj.subtraction();
		obj.division();

	}
	
	public void accept()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your first no. ");
		a=sc.nextInt();
		System.out.println("Enter your Second number  no. ");
		b=sc.nextInt();
	}
	
	public void addition()
	{
		int c;
		c=a+b;
		System.out.println("The sum of two numbers is "+c);	
	}
	public void multiplication()
	{
		int d;
		d=a*b;
		System.out.println("The product of two numbers is "+d);
	}
	public void subtraction()
	{
		int d;
		d=a-b;
		System.out.println("The diffrence between two numbers is "+d);
	}
	public void division()
	{
		float e;
		e=a/b;
		System.out.println("The division of two numbers is "+e);
	}  
	
	
	
	

	
}
