/**
 * VendingMachine
 * 
 * Simulation of Vending Machine
 * 
 * Program to take change amount as input
 * and compute the minimum no of note denomination 
 * required to give change amount. 
 * 
 * @author    Abhishek Shigavan
 */
import java.util.Scanner;

public class VendingMachine {

/**
 * 
 * This method takes input as change amount 
 * and note denomination.
 * Computes the no of notes required of given
 * denomination to give back change 
 * 
 * @return No of notes
 *        
 */
	public static int getNoOfNotes(int change, int denomination) {
		
		int count =0;
		while(change >= denomination) {
			
			change = change - denomination;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Change Amount : ");
		int changeAmount = sc.nextInt();
		
		int noOfNotes =0;
		int noteCounter=0; //for storing total no of notes
		int noteDenomination =0; //for storing note denomination
		
		while(changeAmount > 0) {
		
			//checking amount with note denomination 
			if(changeAmount >= 1000) {
				
				noteDenomination =1000;
				noOfNotes = getNoOfNotes(changeAmount,noteDenomination);
				System.out.println("No of 1000 Rs. notes : "+noOfNotes);
				changeAmount = changeAmount - (noOfNotes * 1000);	//updating change amount
				noteCounter += noOfNotes;	//Adding no of notes
			}
			else if(changeAmount >= 500) {
				
				noteDenomination =500;
				noOfNotes = getNoOfNotes(changeAmount,noteDenomination);
				System.out.println("No of 500 Rs. notes : "+noOfNotes);
				changeAmount = changeAmount - (noOfNotes * 500);
				noteCounter += noOfNotes;
			}
			else if(changeAmount >= 100) {
				
				noteDenomination =100;
				noOfNotes = getNoOfNotes(changeAmount,noteDenomination);
				System.out.println("No of 100 Rs. notes : "+noOfNotes);
				changeAmount = changeAmount - (noOfNotes * 100);
				noteCounter += noOfNotes;
			}
			else if(changeAmount >= 50) {
				
				noteDenomination =50;
				noOfNotes = getNoOfNotes(changeAmount,noteDenomination);
				System.out.println("No of 50 Rs. notes : "+noOfNotes);
				changeAmount = changeAmount - (noOfNotes * 50);
				noteCounter += noOfNotes;
			}
			else if(changeAmount >= 10) {
				
				noteDenomination =10;
				noOfNotes = getNoOfNotes(changeAmount,noteDenomination);
				System.out.println("No of 10 Rs. notes : "+noOfNotes);
				changeAmount = changeAmount - (noOfNotes * 10);
				noteCounter += noOfNotes;
			}
			else if(changeAmount >= 5) {
				
				noteDenomination =5;
				noOfNotes = getNoOfNotes(changeAmount,noteDenomination);
				System.out.println("No of 5 Rs. notes : "+noOfNotes);
				changeAmount = changeAmount - (noOfNotes * 5);
				noteCounter += noOfNotes;
			}
			else if(changeAmount >= 2) {
				
				noteDenomination =2;
				noOfNotes = getNoOfNotes(changeAmount,noteDenomination);
				System.out.println("No of 2 Rs. notes : "+noOfNotes);
				changeAmount = changeAmount - (noOfNotes * 2);
				noteCounter += noOfNotes;
			}
			else if(changeAmount >= 1) {
				
				noteDenomination =1;
				noOfNotes = getNoOfNotes(changeAmount,noteDenomination);
				System.out.println("No of 1 Rs. notes : "+noOfNotes);
				changeAmount = changeAmount - (noOfNotes * 1);
				noteCounter += noOfNotes;
			}
		}
		
		System.out.println("******************");
		System.out.println("Total no of notes required to give chage : "+noteCounter);
	}
}
