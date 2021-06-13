/**
 * DecimalToBinary
 * 
 * Program to compute binary of decimal
 * number and prints the same.
 * 
 * 
 * @author    Abhishek Shigavan
 */
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no to convert : ");
		int decimalNo = sc.nextInt();
		
		String binaryResult = toBinary(decimalNo);
		System.out.println("Binary representation of "+decimalNo+" : "+binaryResult);
	}
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
}
