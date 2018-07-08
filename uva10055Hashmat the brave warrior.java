import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		while(scn.hasNext())
		{	
			
			long a = scn.nextLong();
			long b = scn.nextLong();
			long temp=0;
			if (a>b)
			{
			  temp=a;
			  a=b;
			  b=temp;
			}
			System.out.println(b-a);
		}
	}
}