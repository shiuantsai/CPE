/*
解法:
比如日期是3/7則:
將1~2月的天數加起來，再加上7，即31+28+7最後在%7 取餘數即為解 
*/
import java.util.*;
class main{
	public static void main(String[] args){
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int month[]  ={31,28,31,30,31,30,31,31,30,31,30,31};
		String week[] ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	
		for(int i=0; i<n; i++){
			int M = scn.nextInt();
			int D = scn.nextInt();
			
			//為了符合答案的最後修正
			D=D+4;
			
			//將天數加起來
			for(int j=1; j<M ;j++){
				D=D+month[j-1];
			}
			
			
			System.out.println(week[D%7]);
		}
	}
}