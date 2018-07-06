/*
題意:
只能按上下鍵，則我要從a按到b最少要按幾次鍵?
卡住:
要怎麼判斷該從小按到大還是大按到小可得到最少按的次數?
0~99有100個頻道
故假設以下幾筆
29 80 相減=51 (從大到小可得最小次數)
30 80 相減=50 (沒差)
31 80 相減=49 (從小到大可得最小次數)

真正的題意:
找中位數

*/


import java.util.*;
class main{
	public static void main(String args[]){
	
		Scanner scn = new Scanner(System.in);
		int out = scn.nextInt();
		
			for(int i=1;i<=out;i++)
			{
				int in = scn.nextInt();
				int arr[]=new int[in];
				
				//將每個數塞入陣列
				for(int j=0;j<in;j++)
				{
					arr[j] = scn.nextInt(); 
					
				}
				Arrays.sort(arr);
				//將每個數與中位數做相減取絕對值並全部加起來
				int count=0;
				int mid=arr[in/2];
				 	
				for(int k=0;k<in;k++)
				{
					count+=(Math.abs(arr[k]-mid));
				}
				System.out.println(count);		
			
			}
			
			
	}
}