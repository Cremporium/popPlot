package maths.java;
import java.util.Scanner;

public class Population {
//Variables for the entirity of the Population class 
//method for determining overall population
	public static void overallPopulation() {		
		final int overallPop;		
		try( Scanner scan = new Scanner(System.in)) {
//print and accept input for each of the variables
			System.out.println("Please enter the overall count for the day: ");
			n = scan.nextInt();
			System.out.println("Please enter the number of Births: ");
			births = scan.nextInt();
			System.out.println("Please enter the number of Deaths: ");
			deaths = scan.nextInt();
			System.out.println("Please enter the number of Immigrants: ");
			immigrants = scan.nextInt();
			System.out.println("Please enter the number of Emmigrants: ");
			emmigrants = scan.nextInt();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
//set the overallPop var to the equation and print it
		overallPop = n + births + immigrants - deaths - emmigrants;
		System.out.println("Overall pop. count: ");
		System.out.println(overallPop);
			
	}		
//Method for determining the double time of the population
	public static void doubleTimer() {
		final double doubleTime;
		final double lambda;
		if(births + deaths > 0) {
			try( Scanner scan = new Scanner(System.in)) {	
				System.out.println("Please enter the number of births: ");
				births = scan.nextInt();
				System.out.println("Please enter the number of deaths: ");
				deaths = scan.nextInt();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		lambda = (births - deaths) +  1;
		doubleTime = 0.693/(Math.log(lambda));
		System.out.println("Double time for population: ");
		System.out.println(doubleTime);
	}	
//Method for determining the half life of the population
	public static void halfTimer() {
		final double halfTime;
		final double lambda;
		if(births + deaths == 0) {
			try( Scanner scan = new Scanner(System.in)) {
				System.out.println("Please enter the number of births: ");
				births = scan.nextInt();
				System.out.println("Please enter the number of deaths: ");
				deaths = scan.nextInt();
			}
			catch(Exception e) {
			e.printStackTrace();	
			}
			finally {}
		}
		lambda = (b - d) + 1;
		halfTime = (Math.log(.5)) / (Math.log(lambda));
		System.out.println("Half life for population: ");
		System.out.println(halfTime);
	}
}