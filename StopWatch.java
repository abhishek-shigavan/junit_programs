/**
 * StopWatch
 * 
 * Simulation of StopWatch
 * 
 * Program to compute time elapsed between
 * start and stop
 * 
 * @author    Abhishek Shigavan
 */
import java.util.Scanner;

public class StopWatch {
/**
 * 
 * This method store the timestamp at start 
 * of StopWatch in variable & returns same 
 * 
 * 
 * @return start time
 *         
 */
	public static long start() {
		
		long startTime = System.currentTimeMillis();
		return startTime;
	}
/**
 * 
 * This method stores the timestamp when StopWatch 
 * stops & returns same 
 * 
 * 
 * @return stop time
 *         
 */
	public static long stop() {
		
		long stopTime = System.currentTimeMillis();
		return stopTime;
	}
/**
 * 
 * This method computes difference between 
 * timestamp ( i.e between start & stop ) 
 * 
 * 
 * @return difference between timestamp (i.e time elapsed)
 *         
 */	
	public static long timeElapsed(long endTime, long startTime) {
		
		long timeElapsed = endTime - startTime;
		return timeElapsed;

	}
	
	public static void main(String[] args) {
	
		long startTime =0;
		long stopTime =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 to start StopWatch :");
		int start = sc.nextInt();
		
		if(start == 1) {
		 	startTime = start();
		}
		
		System.out.println("Enter 0 to stop StopWatch :");
		int stop = sc.nextInt();
		
		if(stop == 0) {
			stopTime = stop();
		}
		
		long elapsedTime = timeElapsed(stopTime, startTime);
		int timeSecond =(int) ((elapsedTime/1000)%60); // convert millisecond to second
		System.out.println("Elapsed Time in Second : "+ timeSecond);
	}
	
	
}
