import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		while(scn.hasNext()){
			int a = scn.nextInt();
			int b = scn.nextInt();
			int cnt=0,c;
			
			/*if(a>b)
			{c=a;a=b;b=c;}*/
			
			if(a==0 || b==0)break;
			
			for(int i=a;i<=b;i++)
			{
				if(Math.sqrt(i)%2==0 || Math.sqrt(i)%2==1)
					cnt++;
			}
			System.out.println(cnt);
		}
	}
}