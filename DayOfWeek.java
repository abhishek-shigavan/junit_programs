/**
 * DayOfWeak
 * 
 * Program to take date (dd/mm/yyyy) as input 
 * and returns day of the weak for same.
 * 
 * 
 * @author    Abhishek Shigavan
 */
import java.util.Scanner;

public class DayOfWeak {
/**
 * 
 * This method takes day, month & year as input
 * and computes a number for day of weak.
 * 
 * @return returning day number
 *        
 */		
	public static int getDayNumber(int d, int m, int y) {
		
		int y0 = y - (14-m) /12;
		int x = y0 + (y0/4) - (y0/100) + (y0/400);
		int m0 = m + 12 * ((14 - m )/12) -2;
		int d0 = (d+x+ 31*m0 /12)%7;
		
		return d0;
	}
/**
 * 
 * This method takes dayNumber as input
 * and returns the day assigned with dayNumber
 * 
 * @return returning day of the weak
 *        
 */	
	public static String getDayOfWeak(int dayNumber) {
		
		String day = new String("");
		
		switch(dayNumber) {
			case 0:{
				day ="Sunday";
				break;
			}
			case 1:{
				day ="Monday";
				break;
			}
			case 2:{
				day ="Tuesday";
				break;
			}
			case 3:{
				day ="Wednessday";
				break;
			}
			case 4:{
				day ="Thursday";
				break;
			}
			case 5:{
				day ="Friday";
				break;
			}
			default:
				day ="Saturday";
				break;
		}
		
		return day;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter day value (dd) : ");
		int dayValue = sc.nextInt();
		System.out.println("Enter month value (mm) : ");
		int monthValue = sc.nextInt();
		System.out.println("Enter year value (yyyy) : ");
		int yearValue = sc.nextInt();
		
		int dayNumber = getDayNumber(dayValue, monthValue, yearValue);
		
		String dayOfWeak = getDayOfWeak(dayNumber);
		
		System.out.println("On "+dayValue+"/"+monthValue+"/"+yearValue+" Day is "+dayOfWeak);
	}

}
