//Author: Rehan Shafiq
package TollBooth;
import java.util.*;
public class TollBooth{

	//DATA MEMBERS OF CLASS
	private  int noPaycars;
	private  double total_ammount;
	private double total_dollars = 0;
	Scanner input = new Scanner(System.in);
	
	//DEFAULT CONSTRUCTOR TO INITALIZE THE VALUES
	TollBooth(){
		noPaycars = 0;
		total_ammount = 0;
	}

	
	//METHOD TO ASK ACTION FROM YOUR OF HIS CHOICE
	public int ask_action() {
		System.out.print("1.Check Details\n2.Start\n3.Exit\nChose Option: ");
		int action = input.nextInt();
		return action;
	}

	//METHOD TO ADD AMMOUNT TO TOTAL AMMOUNT IN CENTS
	public void payingCar(){
		total_ammount += 50;

	}
	
	//METHOD TO CALCULATE NUMBER OF NON PAYING CARS
	public void noPaycar(){
		noPaycars++;

	}
	
	//METHOD TO DISPLAY THE DETAILS IN TABLE FORM
	
	public void display() {
        // Table header
        System.out.println("+----------------------------+");
        System.out.println("|      Record of Toll Booth  |");
        System.out.println("+----------------------------+");

        // Table rows
        System.out.printf("| %-18s %7.3f$|%n", "Total Amount:", calculate_dollars());
        System.out.printf("| %-18s %5d   |%n", "NON-Payed cars:", noPaycars);

        // Table footer
        System.out.println("+----------------------------+");
    	}	

	//METHOD TO CONVERT CENTS TO DOLLARS
	public double calculate_dollars(){
			return total_dollars = total_ammount/100;
	}
	
	//METHOD TO EXIT FROM THE SOFTWARE
	public void exit(){
		System.out.print("Do you want to exit?(y/n): ");
		char exit = input.next().charAt(0);
		if(exit == 'y'){
			System.exit(0);
		}
	}
}

