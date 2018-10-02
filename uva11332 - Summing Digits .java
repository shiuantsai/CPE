import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		while(scn.hasNext()){
			int n = scn.nextInt();
			
			if (n==0) break;
			int sum=0;
			
		
			//sum==0是一開始進，sum>=10是2次check
			while(sum==0||sum>=10){
				
				while(n%10>0 || n>=10){
					sum+=n%10;
					n/=10;
				}
				n=sum;
				if(sum>=10) sum=0;
			}
			
			System.out.println(sum);
		}
	}	                
}