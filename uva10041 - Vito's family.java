/*
題意:
有個人有很多親戚，他常常去拜訪他們。
而他想找一間離所有親戚家最近的房子
，使得他拜訪所有親戚時，距離的總和是最小值。
並印出最小距離是多少

解法:找中位數
*/

import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		int cases = scn.nextInt();
		
		for(int i=0;i<cases;i++){
			int input = scn.nextInt();
			int array[] = new int[input];
			
			for(int j=0;j<input;j++){
				array[j]=scn.nextInt();
			}

			Arrays.sort(array);
			int sum=0;
			for(int k=0;k<input;k++){
			sum+=Math.abs(array[input/2]-array[k]);
			}
			System.out.println(sum);
		}
	}
}
