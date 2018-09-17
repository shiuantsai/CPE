/*
BigInteger大數字是字串的概念!!!
*/
import java.math.BigInteger;
import java.util.*;
class main{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		BigInteger eleven = new BigInteger("11");
		while(scn.hasNext()){
			
			String input = scn.next(); //容易忘記，大數字用的是字串
			BigInteger a = new BigInteger(input); //容易忘記
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