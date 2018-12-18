import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		while(scn.hasNext()){
		String str = scn.next();

		
		if(str.equals("0")) 
			break;
		int array[] ={0,0};
		
		for(int i=0;i<str.length();i++){
			array[i%2] += (str.charAt(i)-'0');
		}
		int abs = Math.abs(array[0]-array[1]); 
		int sum = (array[0]+array[1]);
		
		if(abs%11==0 || sum==11 )
			System.out.println(str+" is a multiple of 11.");
		else
		 	System.out.println(str+" is not a multiple of 11.");
		
		}
	}
}
