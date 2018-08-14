/*
題意:
s代表相加，d代表相減
解法:
1.s不可能大於d
2.x跟y必定大於0
3.x+y=s,x-y=d
2x=s+d , 2y=s-d  
所以x=(s+d)/2,y=(s-d)/2
由此可知x跟y不可能是奇數


*/

import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i=0;i<n;i++)
		{
			int s = scn.nextInt();
			int d = scn.nextInt();
			int x=(s+d);
			int y=(s-d);
			
			if(x<0 || y<0 || s<d ||(x%2!=0 || y%2!=0))
				System.out.println("impossible");
			else
				System.out.println(x/2+" "+y/2);
			
		}
	}
}