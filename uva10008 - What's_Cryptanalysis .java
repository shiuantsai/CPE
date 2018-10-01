import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		//把3後面的空白吃掉
		String eat = scn.nextLine();
		int array[] = new int[26];
		
		for(int i=0;i<n;i++){
			String input = scn.nextLine();
			
			//轉大寫
			input=input.toUpperCase();
			
			//System.out.println(input);
			for(int j=0;j<input.length();j++){
				if(input.charAt(j) >='A' && input.charAt(j) <='Z')
				
					//則A~Z的數量會依序落在array[0]~[25]
					array[input.charAt(j)-'A']++;
			}
			
			//找出最大
			int max=0;
			for(int j=0;j<26;j++){
				if(array[j]>max)
					max=array[j];
			}
			
			//從最大的往後減，看A到Z誰符合就優先印出
			if(i==n-1){
			for(int j=max;j>0;j--){
				for(int k=0;k<26;k++){
					if(array[k]==j)
						System.out.println((char)(k+'A')+" "+j);
				}
			}
			}
			
		
		
		}
		
	}
}