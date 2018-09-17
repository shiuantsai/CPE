/*照著該規則走，算出該範圍內有多少個數字*/
import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		while(scn.hasNext()){
			int a = scn.nextInt();
			int b = scn.nextInt();
			int aa = a;
			int bb = b;
			
			int temp;
			if(a>b){
				temp=a;
				a=b;
				b=temp;
			}
			
			int max=0;
			for(int i=a;i<=b;i++){
			int count=1;
			int compute = i;
				while(compute!=1){
				count++;
					if(compute%2==1)
						compute = 3*compute+1;
					else
					   compute = compute/2;
				}
				if(count>max){
					max=count;
				}
				
			}
			System.out.println(aa+" "+bb+" "+max);
		}
	}
}
