package maths.java;
import java.util.Scanner;
// all population 
public class Population {
	
	Scanner scan = new Scanner(System.in);
	
	public String compPopAprox(int numDays,String sName) {
			int[] popSize = new int[numDays];
// Puts all of the numbers input into an array and converts it to a String
// type in order to be more legible to the average person
			for (int i = 0; i == numDays; i++) {
				System.out.print("Please enter the number of animals seen on day" );
				System.out.print(i);
				popSize[i] = scan.nextInt();
			}
			
			String x = new String(popSize.toString());
			
	return x;
	}	
}