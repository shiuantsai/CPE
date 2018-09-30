/*
要找到一串數列中，使數列中每個數字去減特定數字X得到最小值。
作法:要找中位數
output:
1.X的最小值
2.在數列中X有幾個
3.符合X的可能性有哪些(即假設:2 2 5 10 則為2~5之間所有數字，4個。)
*/
import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		while(scn.hasNext()){
			int input = scn.nextInt();
			
			int array[] = new int[input];
			for(int i=0;i<input;i++){
				array[i] = scn.nextInt();
			}
				
			Arrays.sort(array);
			//X的最小值
			System.out.print(array[input/2-1]+" ");
			
			//X數列中X有幾個
			int cnt=0;
			for(int i=0;i<input;i++){
				if(array[i]==array[input/2-1] || array[i]==array[input/2])
				 	cnt++;
			}
			System.out.print(cnt+" ");
			
			//符合X的有哪些，比如2~6就是6-2再+1個
			System.out.print((array[input/2]-array[input/2-1])+1);
			System.out.println("");
			
		
		}
	}
}