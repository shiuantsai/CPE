/*
題意:
下次來住的人數會等於目前人數+1
每行輸入的第一個數字為旅行團人數(S)、第二個數字為指定日期(D)
求第D天人數有多少個。

解法:
S為人數、D為日期
S+S+1+S+2+...一直加到>=D時跳出
ex:
1 6
就是 1+2+3>=6 ，所以是3
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


