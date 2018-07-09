/*輸入兩個數i,j
介於i,j之間最大數的循環長度為何
規則:
如果n不等於1則:
如果是奇數3n+1 否則n/2
計算此迴圈共需要算幾次
*/
import java.util.*;
 class main{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		
		while(scn.hasNext()){
			int input1=scn.nextInt();
			int input2=scn.nextInt();
			
			int temp;
			//使input1較小
			if(input1 > input2){
				temp=input1;
				input1=input2;
				input2=temp;
			}
			int max=0;
			for(int i=input1;i<=input2;i++){
			
				int count=1;
				int incalculate=i;
				
				while(true)
				{
					if (incalculate==1)
						break;
					if(incalculate%2!=0)
						incalculate=3*incalculate+1;
					else
						incalculate=incalculate/2;
					count++;
				}
				
				if(count > max)
					max=count;
				
			}
			System.out.println(input1+" "+input2+" "+max);
		
		
		}
		
		
	}
	
}