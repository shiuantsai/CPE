/*
題意:陣列中數字兩兩相減，若出現了1~n-1(n為個數)則為jolly。
解法:
1.將每個數字存入陣列
2.兩兩相減，取絕對值Math.abs(array)，放入array2
3.判斷array2是否有出現1~n-1每個數字。
判斷方法:
將array2做排序，再用迴圈1~n-1判斷，
利用因為4個數相減完恰巧是3個數
所以陣列必定剛好是1~3 若條件不成立即not jolly
ex:
1 4 2 3 相減過後 3 2 1 所以出現了1~3 : jolly
*/
import java.util.*;
class main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		while(scn.hasNext()){
			int n = scn.nextInt();
			int array[] = new int[n];
		
			//將每個數字存入陣列
			for(int i=0; i<n ;i++){
				 array[i]=scn.nextInt();
			}
			
		
			boolean flag=true;
			if(n!=1){
			
				//array2用來存放絕對值，兩兩相減，所以會少一格
				int array2[]=new int[n-1];
				for(int i=0; i<array.length;i++){
					if(i==array.length-1)break; /**防止超出陣列**/
				array2[i]=Math.abs(array[i]-array[i+1]);
			}
			
			Arrays.sort(array2);
			
			for(int i=0; i<array2.length; i++){
				if(array2[i]!=i+1){
					flag = false;
					break;
					}
				}
			}
			
			
		
		if(flag) System.out.println("Jolly");
		
		else System.out.println("Not jolly");
		}
	}
}
