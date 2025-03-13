//Author: Rehan Shafiq
package TollBooth;
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		

		//CREATING OBJECT OF CLASS TOLLBOOTH
		TollBooth tollbooth1 = new TollBooth();

		//CALLING THE FUNCTION ASK_ACTION AND ASSIGING ITS VALUE TO VARIABLE
		System.out.println("\n-----WELCOME TO TOLL BOOTH COMSATS SAHIWAL-----\n");
		int action = tollbooth1.ask_action();
		

		//CONDITION IF ACTION IS EQUAL TO 3 IT WILL TERMINATE
		while (action != 3){

				//IF THE ACTION IS EQUAL TO 1 IT WILL DISPLAY THE DETAILS
				if(action == 1){ 
					tollbooth1.display();
					tollbooth1.exit();
					action = tollbooth1.ask_action();
				}

				//IF THE ACTION IS EQUAL TO 2 IT WILL START TAKING PAYMENT
				else if(action == 2){
					int count = 0;
					while(true){
						count++;
					System.out.print(count+". Car has payed?(y/n): ");
					char status = input.next().charAt(0);
					

					//IF USER ENTER Y IT WILL ADD 0.50 CENTS IN TOTAL AMMOUNT
					if((status== 'y' || status == 'Y')){
					tollbooth1.payingCar();
						}	
					
					//IF USER ENTER N IT WILL NOT ADD THE PAYMENT AND WILL COUNT THE NUMBER OF CARS
					else if((status == 'n' || status == 'N')){
					tollbooth1.noPaycar();
						}

					//IF USER ENTER X IT WILL TERMINATER FROM PAYMENT MODE
					else if(status == 'x' || status == 'X'){
						System.out.println("\nExiting.......");

						tollbooth1.display();
						break;
						}

					//IF USER ENTER ANY OTHER CHARACTER RATHER THAN 'Y', 'N' OR 'X'
					else{
						System.out.println("Enter 'y' for paying cars, 'n' for Non paying cars and 'x' to exit");
					}

					}

					//IT AGAIN ASK FOR ACTION AFTER EXITING THE PAYMENT MODE
					action = tollbooth1.ask_action();
			}
		}
	}
}



