/*
題意:每三個空瓶可以換一瓶來喝，如果剩下兩個空瓶則可以借一個空瓶來補。
解法:
假設現在有n瓶，最多可以喝sum瓶(一開始就給他一個空瓶)
n     1 2 3 4 5 6 7  8  9
sum	  1 3 4 6 7 9 10 12 13

由以上規律推得:
sum=1.5*n
*/
import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		while(scn.hasNext()){
			int n = scn.nextInt();
			System.out.println((int)(n*1.5));
		}
	}
}