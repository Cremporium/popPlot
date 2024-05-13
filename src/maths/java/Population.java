package maths.java;
import java.util.Scanner;

public class Population {
	private static String sName;
	private static int numDays;
	private static int[] popArr;
	private Scanner scan = new Scanner(System.in);
//Constructor grabs the basic information
	public Population(String sName, int numDays) {

		Population.sName = sName;
		Population.numDays = numDays;
		Population.popArr = popArr;	
	}
//Sets up an array that is used to organize the data received
	public void setupArray() {
		
		final int[] popSizes = new int[numDays];
		int popIn = scan.nextInt();
		
		for(int i = 0; i<=Population.numDays; i++) {
			System.out.println("Please enter the number of animals seen on day ");
			System.out.print(i);
			popSizes[i] = popIn;
		}
	}
}