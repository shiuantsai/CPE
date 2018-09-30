/*
 此題未出現在瘋狂程設，但是是cpe考古題
題意:
給四個邊
如果是正方形印出square  
長方形印出rectangle 
四邊形印出quadrangle
都不是印出banana 

作法:
將四邊做排序
正方:四邊等長 (a[0]跟a[3]等長)
長方:短的兩邊等長、長的兩邊等長(a[0]==a[1] && a[2]==a[3])
四邊:任三邊之和<=最長邊
 */
import java.util.*;
public class uva11455_behold_my_Quardrangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int i=0;i<n;i++) {
			int array[] = new int[4];
			for(int j=0;j<4;j++) 
			{
				array[j] = scn.nextInt();
			}
			Arrays.sort(array);
			
			//開始判斷
			if(array[0]==array[3])
				System.out.println("square");
			else if(array[0]==array[1] && array[2]==array[3])
				System.out.println("rectangle");
			else if(array[0]+array[1]+array[2]>=array[3])
				System.out.println("quadrangle");
			else
				System.out.println("banana");
			
		}
	}

}
