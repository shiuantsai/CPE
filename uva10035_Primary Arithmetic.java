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
			int a_temp,b_temp;
			int carry=0;
			int a= scn.nextInt();
			int b= scn.nextInt();
			
			if(a==0&&b==0)
				break;
				
			while(a!=0 && b!=0){
			
				a_temp = a%10;
				b_temp = b%10;
				
				if((a_temp+b_temp)>=10){
					carry++;
					a/=10;
					b/=10;
					a++;  //進位
				}
				else{ 
					a/=10;
					b/=10;
				}
				
			}
			if(carry==0)
			System.out.println("No carry operation.");
			
			else if (carry ==1)
			System.out.println(carry+" "+"carry operation.");
			
			else 
			System.out.println(carry+" "+"carry operations.");
		}
	}
}
