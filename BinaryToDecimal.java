/**
 * BinaryToDecimal
 * 
 * Program to compute binary number of given decimal no .
 * Then swap the nibble of binary number & gives decimal
 * number for this new binary
 * Also checks decimal no is power of 2 or not
 * 
 * 
 * @author    Abhishek Shigavan
 */
import java.util.Scanner;

public class BinaryToDecimal {
/**
 * 
 * This method computes the binary of
 * number then reverse it and returns the same 
 * 
 * @return returning the binary of user 
 *         given number
 */	
	public static String toBinary(int number) {
		int quotient = 0;
		int remainder =0;
		String binary= "";
		String revBinary= "";
		
		while(number > 0) {
			
			// computing binary for decimal
			quotient=number/2;   //finding quotient
			remainder=number%2;  //finding remainder
			binary +=  String.valueOf(remainder); //storing binary
			number = quotient;  // swapping the number with quotient
		}
		
		int stringLength = binary.length();
		
		// reversing the binary number
		for(int i =stringLength-1; i >=0; i--) {
			revBinary +=  binary.charAt(i);
		}
		
		return revBinary;
	}
/**
 * 
 * This method computes decimal no of 
 * given binary number 
 * 
 * @return returning decimal number
 *         
 */
	public  static int toDecimal(String binaryNumber) {
		
		int numberLength = binaryNumber.length();
		int pow =numberLength-1;
		int decimalNumber =0;
		
		for(int i =0; i <= numberLength-1; i++) {
			
			char numChar =binaryNumber.charAt(i);  //reading character indexwise
			int bit =Character.getNumericValue(numChar); //getting integer value of character
			decimalNumber += bit * Math.pow(2, pow);
			pow--; // decrementing value
		}
		
		return decimalNumber;
	}
/**
 * 
 * This method takes binary no in the form
 * of string. 
 * Divides the string in two equal part to 
 * form Nibbles
 * Swap this Nibbles and returns the same 
 * 
 * 
 * @return returning swapped Nibble
 *         
 */	
	public static String getSwapNibbles(String binaryNo) {
		
		String nibble1 = "";
		String nibble2 = "";
		String swapNibble = "";
		int binaryLength = binaryNo.length();
		int nibbleLength = binaryLength / 2; // mid point
		
		//for Nibble1
		for(int i=0; i<=nibbleLength-1; i++) {
			
			nibble1 += binaryNo.charAt(i);
		}
		
		//for Nibble2 
		for(int j=nibbleLength; j<= binaryLength-1; j++) {
			
			nibble2 +=binaryNo.charAt(j);
		}
		
		System.out.println("Nibble : "+nibble1+" "+nibble2);
		swapNibble = nibble2 + nibble1;		//swapping nibbles
		
		return swapNibble;
		
	}
/**
 * 
 * This method computes the power of 2
 * till 2^30 & checks if any power matches 
 * with the given number
 * 
 * set flag =1 if match found
 * 
 * @return flag value 
 *         
 */	
	public static int getPower(int number) {
		
		int flag =0;
		int powerOf2 =0;
		
		for(int i=0; i<=30; i++) {
			
			powerOf2 = (int) Math.pow(2,i);
			if(powerOf2 == number) {
				flag = 1;
			}	
		}
		
		return flag;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int decimalNo = sc.nextInt();
		
		String binaryResult = toBinary(decimalNo);
		System.out.println("Binary representation of "+decimalNo+" : "+binaryResult);
		
		int resultLength = binaryResult.length(); // for checking octet
		
		if(resultLength == 8) {
		
			String swapNibble = getSwapNibbles(binaryResult);
			System.out.println("Nibbles after swapping : "+swapNibble);
			
			int decimalNumber = toDecimal(swapNibble);
			System.out.println("Decimal Representation of "+swapNibble+" : "+decimalNumber);
			
			int powerCheck = getPower(decimalNumber);
			
			if(powerCheck == 1) {
				System.out.println(decimalNumber+" is power of 2 ");
			}
			else {
				System.out.println(decimalNumber+" is not a power of 2 ");
			}
		}
	}
}
