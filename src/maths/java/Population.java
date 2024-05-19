package maths.java;
import java.util.Scanner;

public class Population {
//Variables for the entirity of the Population class 
	public Population() {}
	private int n;
	private int b;
	private int i;
	private int d;
	private int e;
//method for determining overall population
	public void oaPop() {		
		final int overallPop;		
		try( Scanner scan = new Scanner(System.in)) {
//print and accept input for each of the variables
			System.out.println("Please enter the overall count for the day: ");
			n = scan.nextInt();
			System.out.println("Please enter the number of Births: ");
			b = scan.nextInt();
			System.out.println("Please enter the number of Deaths: ");
			d = scan.nextInt();
			System.out.println("Please enter the number of Immigrants: ");
			i = scan.nextInt();
			System.out.println("Please enter the number of Emmigrants: ");
			e = scan.nextInt();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {}
//set the overallPop var to the equation and print it
		overallPop = n + b + i - d - e;
		System.out.println("Overall pop. count: ");
		System.out.println(overallPop);
			
	}		
//Method for determining the double time of the population
	public void dubTime() {
		final double dTime;
		final double lambda;
		if(b + d == 0) {
			try( Scanner scan = new Scanner(System.in)) {	
				System.out.println("Please enter the number of births: ");
				b = scan.nextInt();
				System.out.println("Please enter the number of deaths: ");
				d = scan.nextInt();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {}
		}
		lambda = (b - d) +  1;
		dTime = 0.693/(Math.log(lambda));
		System.out.println("Double time for population: ");
		System.out.println(dTime);
	}	
//Method for determining the half life of the population
	public void halfTime() {
		final double hTime;
		final double lambda;
		if(b + d == 0) {
			try( Scanner scan = new Scanner(System.in)) {
				System.out.println("Please enter the number of births: ");
				b = scan.nextInt();
				System.out.println("Please enter the number of deaths: ");
				d = scan.nextInt();
			}
			catch(Exception e) {
			e.printStackTrace();	
			}
			finally {}
		}
		lambda = (b - d) + 1;
		hTime = (Math.log(.5)) / (Math.log(lambda));
		System.out.println("Half life for population: ");
		System.out.println(hTime);
	}
}