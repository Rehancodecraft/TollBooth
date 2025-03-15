//Author: Rehan Shafiq
package src;
import java.util.*;
public final class TollBooth{

	//DATA MEMBERS OF CLASS
	private static int noPaycars;
	private  static double total_ammount;
	private static double total_dollars = 0;
	
	
	//DEFAULT CONSTRUCTOR TO INITALIZE THE VALUES
	TollBooth(){
		noPaycars = 0;
		total_ammount = 0;
	}

	
	//METHOD TO ASK ACTION FROM YOUR OF HIS CHOICE
	public static int ask_action() {
		Scanner input = new Scanner(System.in);
		System.out.print("1.Check Details\n2.Start\n3.Exit\nChose Option: ");
		int action = input.nextInt();
		return action;
	}

	//METHOD TO ADD AMMOUNT TO TOTAL AMMOUNT IN CENTS
	public static void payingCar(){
		total_ammount += 50;

	}
	
	//METHOD TO CALCULATE NUMBER OF NON PAYING CARS
	public static void noPaycar(){
		noPaycars++;

	}
	
	//METHOD TO DISPLAY THE DETAILS IN TABLE FORM
	
	public static void display() {
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
	public static double calculate_dollars(){
			return total_dollars = total_ammount/100;
	}
	
	//METHOD TO EXIT FROM THE SOFTWARE
	public static void exit(){
		Scanner input = new Scanner(System.in);
		System.out.print("Do you want to exit?(y/n): ");
		char exit = input.next().charAt(0);
		if(exit == 'y'){
			System.exit(0);
		}
	}

	//METHOD TO TAKE ENTRIES
	public static void submit_entry(){
						Scanner input = new Scanner(System.in);
						int count = 0;
						while(true){
						count++;
						System.out.print(count+". Car has payed?(y/n): ");
						char status = input.next().charAt(0);
					

						//IF USER ENTER Y IT WILL ADD 0.50 CENTS IN TOTAL AMMOUNT
						if((status== 'y' || status == 'Y')){
						TollBooth.payingCar();
							}	
					
						//IF USER ENTER N IT WILL NOT ADD THE PAYMENT AND WILL COUNT THE NUMBER OF CARS
						else if((status == 'n' || status == 'N')){
						TollBooth.noPaycar();
							}
						//IF USER ENTER X IT WILL TERMINATER FROM PAYMENT MODE
						else if(status == 'x' || status == 'X'){
						System.out.println("\nExiting.......");

						TollBooth.display();
							break;
							}
						else{
							System.out.println("Enter 'y' for paying cars, 'n' for Non paying cars and 'x' to exit"); 
						}

						}
}
}



