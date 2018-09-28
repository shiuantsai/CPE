import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		//ps:為何要兩個\，因為:特殊字元需要加上跳脫符號=>”\”+特殊字元
		String table = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		
		while(scn.hasNext()){
			String input = scn.nextLine();
			for(int i=0;i<input.length();i++){
				if(input.charAt(i)==' '){
					System.out.print(" ");
				}
			//比對若有一樣則往左跳一格
			for(int j=0;j<table.length();j++){
					if(input.charAt(i)==table.charAt(j))
						System.out.print(table.charAt(j-1));
				}
			}
			System.out.println("");
		
		}
	}
}