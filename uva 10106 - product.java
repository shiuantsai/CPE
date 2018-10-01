/*
兩顆星
*/
import java.util.*;
import java.math.BigInteger;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
	
		
		while(scn.hasNext()){
		String a  =  scn.next();
		String b  =  scn.next();
		BigInteger input  = new BigInteger(a);
		BigInteger input2 = new BigInteger(b);
		
		System.out.println(input.multiply(input2));
		}
	}
}