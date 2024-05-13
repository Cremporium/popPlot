package main.java;
import maths.java.Population;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in))
		{
		
		System.out.println("Please enter the animal you would like to see the population plotted of: ");
		String sName = scan.next();
		
		System.out.println("Please enter the number of days you observed the animals for: ");
		int numDays = scan.nextInt();
		
		Population myPop = new Population(sName, numDays);
		myPop.setupArray();
	
		}
		catch(Exception e) {}
		finally {}
	}
	
}