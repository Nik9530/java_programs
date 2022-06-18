package loop;

public class stars {
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=6;i++)
		{
			for(j=1;j<=67;j++)
			{
				if(i==1||i==6)
				{
					if(j==6||j==7||j==8||j==16||j==15||j==14||j==26||j==27||j==28||j==33||j==34||j==37||j==38||j==39||j==44||j==43||j==42||j==49||j==48||j==47||j==61||j==60||j==59)
					{
						System.out.print(" ");
					}
					else
					{
							System.out.print("*");
					}
				
				}
				else if(i==2)
				{
					if(j==2||j==3||j==4||j==5||j==10||j==11||j==20||j==21||j==31||j==30||j==34||j==41||j==40||j==46||j==45||j==53||j==54||j==63||j==62)
					{
						System.out.print("*");
					}
					else
						
					{
						System.out.print(" ");
					}
				}
				else if(i==3)
				{
					if(j==2||j==3||j==6||j==5||j==10||j==11||j==20||j==21||j==31||j==30||j==33||j==44||j==42||j==43||j==41||j==40||j==46||j==45||j==53||j==54||j==63||j==62)
					{
						System.out.print("*");
					}
					else
						
					{
						System.out.print(" ");
					}
				}
				else if(i==4)
				{
					if(j==2||j==3||j==7||j==6||j==10||j==11||j==20||j==21||j==31||j==30||j==33||j==44||j==42||j==43||j==41||j==40||j==46||j==45||j==53||j==54||j==63||j==62)
					{
						System.out.print("*");
					}
					else
						
					{
						System.out.print(" ");
					}
					
				}
				else if(i==5)
				{
					if(j==2||j==3||j==7||j==8||j==10||j==11||j==20||j==21||j==31||j==30||j==34||j==41||j==40||j==46||j==45||j==53||j==54||j==63||j==62)
					{
						System.out.print("*");
					}
					else 
						
					{
						System.out.print(" ");
					}

				}
			}			System.out.println();
			
		}		
		
	}

}
