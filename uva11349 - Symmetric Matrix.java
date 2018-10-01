import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		//題目要求輸入
		int cases = scn.nextInt();
	 	int cnt=1;
		for(int i=0;i<cases;i++){
		String N = scn.next();	
		String S = scn.next();
	
		
		//矩陣是幾乘以幾
		int range = scn.nextInt();
			
		int matrix = range*range;
		
		
		int array[] = new int[matrix];
		for(int j=0;j<matrix;j++){
				array[j] = scn.nextInt();
			}
			
		//有一樣繼續比對，沒有的話就break;
		boolean check = true;	
		int j=matrix-1;	
		for(int k=0;k<matrix/2;k++){
		
			if(array[k]==array[j] && array[k]>=0){
				j--;
			}
			else{ 
				check = false;
				break;
			}
	
		}
		if(check == true)
			System.out.println("Test #"+cnt+": Symmetric.");
		else
			System.out.println("Test #"+cnt+": Non-symmetric.");
		
		cnt++;
		}	

	}
}