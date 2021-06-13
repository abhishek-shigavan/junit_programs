/**
 * TemperatureConversion
 * 
 * Program to convert temperature 
 * form Celsius to Farhenheit and vice-versa.
 * 
 * 
 * @author    Abhishek Shigavan
 */
import java.util.Scanner;

public class TemperatureConversion {
	
		static Scanner sc = new Scanner(System.in);
/**
 * 
 * This method prints temperature conversion 
 * option and takes conversion option from user
 * 
 * @return returning the conversion option
 *         selected by user
 */	
	public static int getOption() {
		
		System.out.println("*** Temperature Conversion ***");
		System.out.println("1. Celsius to Farhenheit");
		System.out.println("2. Farhenheit to Celsius");
		System.out.println("Enter conversion option");
		int optionValue = sc.nextInt();
		return optionValue;
	}
/**
 * 
 * This method gets temperature value
 * from user for conversion.
 * 
 * @return temperature value
 *         
 */	
	public static int getTemperature() {
		
		System.out.println("Enter temperature value : ");
		int inputValue = sc.nextInt();
		return inputValue;
	}
	
/**
 * 
 * This method convert temperature
 * in Farhenheit
 * 
 * @return temperature in Farhenheit
 *         
 */
	public static int getFarhenheit(int temperature) {
		
		int farenResult = (temperature * 9/5)+ 32;
		return farenResult;
	}
/**
 * 
 * This method convert temperature
 * in Celsius
 * 
 * @return temperature in Celsius
 *         
 */	
	public static int getCelsius(int temperature) {
		
		int celsiusResult = (temperature - 32)* 5/9;
		return celsiusResult;
	}
	
	public static void main(String[] args) {		
	
		int conversionOption = getOption();
		
		int tempValue = 0;
		int farhenValue = 0;
		int celsiusValue = 0;
		int flag=0;
		
		while(flag == 0) {
			switch (conversionOption) {
			case 1: {
				
				tempValue = getTemperature();
				farhenValue = getFarhenheit(tempValue);
				System.out.println(tempValue+" Celsius = "+farhenValue+" Farhenheit");
				flag =1;
				break;
			}
			case 2: {
				
				tempValue = getTemperature();
				celsiusValue = getCelsius(tempValue);
				System.out.println(tempValue+" Farhenheit = "+celsiusValue+" Celsius");
				flag =1;
				break;
			}
			default:
				System.out.println("Incorrect Option ");
				conversionOption = getOption();
				break;
			}
		}
	}

}
