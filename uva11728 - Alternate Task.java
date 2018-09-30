/*
題意:給定一個整數S，再從1~1000中找出最大的數字X，X的因數總和為S
作法:
由後往前數如果有因數相加等於s就成功。
*/

import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		int cnt=1;
		while(scn.hasNext()){
			
			int s = scn.nextInt();
			if (s==0) break;
			
			//找x從後往前找，找到就跳出。
			int sum=0;
			int find_x=0;
			boolean find = false;
			for(int x=s;x>1;x--){
			
				for(int j=1;j<=x;j++)
				{
					if (x%j==0) sum+=j;
					if (sum >s) break; //這行只是為了增加效率
				}
				//找到，所以跳出迴圈。
				if (sum==s)
				{
					find = true;
					find_x = x;
					break;
				}
				else sum=0; //這邊卡住過。
			}
			if(find==true)
				System.out.println("Case "+cnt+": "+find_x);
			else if(s == 1)
				System.out.println("Case "+cnt+": 1");
			else  
				System.out.println("Case "+cnt+": -1");
				
				
			cnt++;
		}
	}
}