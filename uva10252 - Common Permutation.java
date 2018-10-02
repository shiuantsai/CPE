/*
題意:
輸入兩個字串，輸出共同字母，
若某字母出現不只一次，則印出a和b之間較少的次數
例如: abccc  bcc  則印出 bcc

作法:
1.建立兩個26個大小的整數陣列
2.將字串A利用-97存入陣列A_array，字串B同理。
3.比較A_array，B_array，字母出現次數較小者印出。
4.因為迴圈從0開始，終止條件為0不會進入迴圈，故不用擔心字母為0次的問題
*/
import java.util.*;
class main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);	
		while(scn.hasNext()){
			
			String str1 = scn.nextLine();
			String str2 = scn.nextLine();
			
			//1
			int table1[] = new int[26];
			int table2[] = new int[26];
			
			//2
			for(int i=0;i<str1.length();i++){
				if(str1.charAt(i)>=97 && str1.charAt(i)<=122)
					table1[str1.charAt(i)-97]++;
			}
			
			for(int i=0;i<str2.length();i++){
				if(str2.charAt(i)>=97 && str2.charAt(i)<=122)
					table2[str2.charAt(i)-97]++;
			}
			
			//3,4
			for(int i=0;i<26;i++){
				int min = Math.min(table1[i],table2[i]);
				
				//這裡控制不會印出A 0 這種情況
				for(int j=0;j<min;j++)
					System.out.print((char)(i+97));
			}
			System.out.println();
		}
	}
}
