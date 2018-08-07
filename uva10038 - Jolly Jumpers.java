/*
題意:陣列中數字兩兩相減，若出現1~n-1(n為個數)且不重複則為Jolly
解法:
1.將每個數字存入陣列
2.兩兩相減，取絕對值Math.abs(array)，放入array2
3.利用boolean判斷array2是否有重複的，若有則break
*/
import java.util.*;
class main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		while(scn.hasNext()){
			int n = scn.nextInt();
			//故意設有n格
			int array[] = new int[n];
			
			//將每個數字存入陣列
			for(int i=0; i<n ;i++){
				 array[i]=scn.nextInt();
			}
			
			//array2用來存放絕對值，兩兩相減，所以會少一格
			int array2[]=new int[n-1];
			for(int i=0; i<array.length;i++){
				if(i==array.length-1)break; //防止超出陣列
				array2[i]=Math.abs(array[i]-array[i+1]);
			}
			
			
			//接著判斷array2中是否有重複的，布林true表示Jolly(無重複)
			boolean bool = true;
			for(int i=0; i<array2.length; i++){
				if (bool==false) break;
				
				for(int j=1;j<array2.length;j++){
					if(array2[i]==array2[j]){
						if (i==j) continue;	//i,j相同時就一定會數字相同
						bool = false;
						break;
					}		
				}
					
			}
		
		
			if(bool == false)
				System.out.println("Not jolly");
			else
				System.out.println("Jolly");
				
		}
	}
}
