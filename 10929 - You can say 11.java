import java.math.BigInteger;
import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		BigInteger eleven = new BigInteger("11");
		while(scn.hasNext()){
			
			String input = scn.next();
			BigInteger a = new BigInteger(input);
			BigInteger b = a.mod(eleven);
			if (input.equals("0"))
				 break;
			
			if(b==BigInteger.ZERO){
				System.out.println(input+" is a multiple of 11.");
			}
			else
				System.out.println(input+" is not a multiple of 11.");
		}
	}
}