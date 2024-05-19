package setup;
import java.util.Scanner;
import maths.java.Population;

public class Setup {
	public Setup() {}
	boolean x = true;
	Population mypop = new Population();
//method for finding what the user wants to do	
	public void choice() {
		while(x != false) {
			try(Scanner scan = new Scanner(System.in)) {
			System.out.println("Please enter the number corresponding with your choice. 1 for Calculating the overall population. 2 for finding the Double time of a population. 3 for finding the half-life of a population. 4 for everything: ");
				int ch = scan.nextInt();
				if(ch == 1) {
					mypop.oaPop();
					x = false;
				}
				else if(ch == 2) {
					mypop.dubTime();
					x = false;
				}
				else if(ch == 3) {
					mypop.halfTime();
					x = false;
				}
				else if(ch == 4) {
					mypop.oaPop();
					mypop.dubTime();
					mypop.halfTime();
					x =false;
				}
				else {
					System.out.println("incorrect key has been pressed. ");
					x = false;
				}
			}
		}
	}
}
