/*
卡住!!!!!!!!!!!!!!!!!!!!!!!
題意:
給定兩個數字:N,M
N代表有幾個數，M代表除數，最後依照每個數mod M的餘數去做排序(小到大)，
若餘數一樣則按照:
若兩個元素值分別為一個奇數與一個偶數，則將奇數排在偶數前面。
若兩個元素皆為奇數，則較大的奇數將排在較小的奇數前面。
若兩個元素皆為偶數，則較小的偶數將排在較大的偶數前面。
order: 大奇數 小奇數 小偶數 大偶數

作法:
將奇數的儲存成一個陣列array_odd(decrement)，偶數的儲存成一個陣列array_even(increment)

目前:
array未反向過來
*/
import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner (System.in);
		while(scn.hasNext()){
		//N表有N個數字,M表除數
		int N = scn.nextInt();
		int M = scn.nextInt();
		System.out.println(N+" "+M);
		if(N==0 && M==0 ) break;
		
		//要用遞減排序，要用Integer
		Integer array[] = new Integer[N];
		int odd=0,even=0;
		for(int i=0;i<N;i++){
			array[i] = scn.nextInt();
			if(array[i]%2!=0) odd++;
			else even++;
		}
		
		
		Integer array_odd[] = new Integer[odd];
		int array_even[] = new int[even];
		int j=0,k=0;
		for(int i=0;i<N;i++){
			if(array[i]%2!=0){ 
				array_odd[j]=array[i];
				j++;
				}
			else{
				array_even[k]=array[i];
				k++;
			}
		}
		
		//遞減排序(奇數)
		Arrays.sort(array_odd,Comparator.reverseOrder());
		
		//遞增排序(偶數)
		Arrays.sort(array_even);
		
		
	
		//餘0 餘1 餘2 令count=M,(M-count),count--
		//最外圈先跑M次
		
		int count=M;
		for(int i=0;i<M;i++){
			for(int a=0;a<odd;a++){
				if(array_odd[a]%M==M-count)
					System.out.println(array_odd[a]);
			}
			for(int a=0;a<even;a++){
				if(array_even[a]%M==M-count)
					System.out.println(array_even[a]);
			}
			count--;
		}
		
		
		
		
		
		/*
		for(int i=0;i<odd;i++){
			System.out.println(array_odd[i]);
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		//會少跑%M==0的
		for(int i=0;i<N;i++){
				if(array[i]%M == 0 ) System.out.println(array[i]);
			}
		
		
		//迴圈由後往前跑
		int cnt=1;
		while(cnt<M){
		for(int i=N-1;i>=0;i--){
				
				//餘數大的會先印出。
				
					if(array[i]%M == (M-cnt)) System.out.println(array[i]);
				
				}
					cnt++;
			}*/
		
		}
	}
}