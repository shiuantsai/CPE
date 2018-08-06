/*
解題:
用count來計數，
當餘數為1時(代表第一個雙引號)用 `` 取代
當餘數為0時(代表第二個雙引號)用 '' 取代
*/
import java.util.*;
class main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int count = 0; //用來計數
		while(scn.hasNextLine()){
		String str = scn.nextLine();
	
	
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='"' && count%2==0){
				System.out.print("``");
				count++;
				}
			else if(str.charAt(i)=='"' && count%2==1){
				System.out.print("''");
				count++;
				}
			else
				System.out.print(str.charAt(i));
		}
		
		System.out.println();
		}
	}
}