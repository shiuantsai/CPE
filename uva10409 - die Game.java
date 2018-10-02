import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		while(scn.hasNext()){
			int n = scn.nextInt();
			if (n==0) break;
		
			int top=1,north=2,west=3,east=4,south=5;
			
			
			for(int i=0;i<n;i++){
				
				String str = scn.next();
				
				if(str.equals("north")){
					north=top;
					top=south;
					south=7-north;
				}
				else if(str.equals("south")){
					south=top;
					top=north;
					north=7-south;
					
				}
				else if(str.equals("east")){
					east=top;
					top=west;
					west=7-east;
				}
				else if(str.equals("west")){
					west=top;
					top=east;
					east=7-west;
				}
				
			}
			System.out.println(top);
			
		}
	}
}
