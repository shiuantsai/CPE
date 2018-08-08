/*
解法:
S為人數、D為日期
S+S+1+S+2+...一直加到>D時跳出
*/

import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		while(scn.hasNext()){
			long S = scn.nextLong();
			long D = scn.nextLong();
			long temp = S;
			long count= S;
			while(temp<D){
				count++;
				temp = temp+count;
			}
			System.out.println(count);
		}
	
	}
}


