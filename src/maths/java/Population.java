package maths.java;
import java.util.Scanner;

public class Population {
//Variables for the entirity of the Population class
	static boolean optA;
	private int[] popArr;
	private int n;
	private Scanner scan = new Scanner(System.in);
	private int numDays = scan.nextInt();

	//Creates an array for each day with the number of animals
	public int[] PopArray() {
		
		int[] popSizes = new int[n];
			
		for(int i = 0; i<numDays; i++) {
				
			System.out.println("Please enter the number of animals seen on day ");
			System.out.println(i + 1);
			popSizes[i] = scan.nextInt();
			
		}
		return popArr;
	}
	
//*********//******//*******//*******//********//********//********//********//*******//*******//**********//*********
//*********//******//*******//*******//********//********//********//********//*******//*******//**********//*********//*********//******//*******//*******//********//********//********//********//*******//*******//**********//*********
//*********//******//*******//*******//********//********//********//********//*******//*******//**********//*********
	
	//Sub class for professional population ploting
	class ProPop {
		private int b;
		private int i;
		private int d;
		private int e;
		private int overallPop;
		
//*********//******//*******//*******//********//********//********//********//*******//*******//**********//*********
//*********//******//*******//*******//********//********//********//********//*******//*******//**********//*********
//*********//******//*******//*******//********//********//********//********//*******//*******//**********//*********
//*********//******//*******//*******//********//********//********//********//*******//*******//**********//*********

		//method for determining overall population
		public void oaPop() {
//determines the overall population size for the day
			try( Scanner scan = new Scanner(System.in)) {
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
			
			overallPop = n + b + i - d - e;
			
			System.out.println(overallPop);
			
		}
//*********//******//*******//*******//********//********//********//********//*******//*******//**********//*********
//*********//******//*******//*******//********//********//********//********//*******//*******//**********//*********
//*********//******//*******//*******//********//********//********//********//*******//*******//**********//*********
//*********//******//*******//*******//********//********//********//********//*******//*******//**********//*********
		public void dubTime() {
			
			final double dTime;
			final double lambda;
			
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
			
			lambda = (b - d) +  1;
			dTime = 0.693/Math.log(lambda);
			System.out.println(dTime);
		}
//*********//******//*******//*******//********//********//********//********//*******//*******//**********//*********
//*********//******//*******//*******//********//********//********//********//*******//*******//**********//*********
//*********//******//*******//*******//********//********//********//********//*******//*******//**********//*********
//*********//******//*******//*******//********//********//********//********//*******//*******//**********//*********
		public void halfTime() {
			final double hTime;
			final double lambda;
			
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
			
			lambda = (b - d) + 1;
			hTime = Math.log(.5) / Math.log(lambda);
			System.out.println(hTime);
			
		}
	}
//*********//******//*******//*******//********//********//********//********//*******//*******//**********//*********
//*********//******//*******//*******//********//********//********//********//*******//*******//**********//*********
//*********//******//*******//*******//********//********//********//********//*******//*******//**********//*********
//*********//******//*******//*******//********//********//********//********//*******//*******//**********//*********
}