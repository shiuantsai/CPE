/*
題目:
https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1119
*/
import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		
		int n = scn.nextInt();
		for(int i=0;i<n;i++)
		{
			int a = scn.nextInt();
			int b = scn.nextInt();
			
			/*int temp=0;
			if(a>b){
				temp = a;
				a = b;
				b = temp;
			}*/
			
			int sum=0;
			for(int j=a;j<=b;j++){
				if(j%2==1)
					sum+=j;
			}
			System.out.println("Case "+(i+1)+": "+sum);
		}
	}
}
