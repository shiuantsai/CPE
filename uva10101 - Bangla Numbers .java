import java.util.*;
class main
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		int count = 1;
		while (scn.hasNext())
		{
		
			System.out.printf("%4d.",count);
			long input = scn.nextLong();
			
			if(input==0) 
				System.out.print(" "+0);
			else
			  	recursive(input);
			count++;
			System.out.println("");
		}
		
	}
	public static void recursive(long num)
	{
		if(num>=10000000)
		{
			recursive(num/10000000);
			System.out.print(" kuti");
			num=num%10000000;
		}
		if(num>=100000)
		{
			recursive(num/100000);
			System.out.print(" lakh");
			num=num%100000;
		}
		if(num>=1000)
		{
			recursive(num/1000);
			System.out.print(" hajar");
			num=num%1000;
		}	
		if(num>=100)
		{
			recursive(num/100);
			System.out.print(" shata");
			num=num%100;
		}		
		
		if(num>0)	
		System.out.print(" "+num);	
		
	}
	
	
	
	
}