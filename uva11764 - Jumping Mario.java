/*
向上跳 up+1
向下跳down+1
*/
import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int cnt=1;
		
		for(int i=0;i<n;i++){
			int input = scn.nextInt();
			int int_array[] = new int[input];
			
			for(int j=0;j<input;j++){
				int_array[j] = scn.nextInt();
			}
			
			
			int up=0;
			int down=0;
			for(int j=0;j<input;j++){
				if(j==input-1) break;
				if(int_array[j]>int_array[j+1])
					down=down+1;
				else if(int_array[j]<int_array[j+1])
					up=up+1;
			}
			System.out.println("Case "+cnt+": "+up+" "+down);
			cnt++;
		}
	}
}