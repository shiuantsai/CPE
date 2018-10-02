/*
解法:轉小寫 > 減2 
記得字元的空白是 ' ' (一個空白)
*/
import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		String check ="`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
		while(scn.hasNext()){
		
			String input =  scn.nextLine().toLowerCase();
			
			for(int i=0;i<input.length();i++){
			
				if(input.charAt(i)==' ')		
						System.out.print(" ");
				else{
							for(int j=0;j<check.length();j++){
								if(input.charAt(i)==check.charAt(j))
									System.out.print(check.charAt(j-2));
							}
						
					}
					
			}
		System.out.println("");
		}		

	}
}