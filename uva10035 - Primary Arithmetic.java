/*
兩個整數相加總共進位了幾次?
想法:
假設a,b 
a,b(各%10)得到個位數在做相加，若相加>=10，則表示進位，且下一位數要做+1
否則 a/=10;b/=10;
*/

import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		while(scn.hasNext()){
			int input1=scn.nextInt();
			int input2=scn.nextInt();
			if(input1==0 && input2==0 ) break;
			
			//假設input2比較大
			int temp;
			if(input1>input2){
				temp=input1;
				input1=input2;
				input2=temp;
			}
			
			int cnt=0;
			while(input2>0)
			{
				if((input1%10 + input2%10)>9){
					cnt++;
					input1/=10;
					input2/=10;
					input1++;
				}
				else{
				input1/=10;
				input2/=10;
				}
			}
			if(cnt==0)
			System.out.println("No carry operation.");
			
			else if(cnt==1)
			System.out.println("1 carry operation.");
			
			else
			System.out.println(cnt+" carry operations.");
			
		}
	}
}