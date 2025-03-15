//Author: Rehan Shafiq
package src;
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//CALLING THE FUNCTION ASK_ACTION AND ASSIGING ITS VALUE TO VARIABLE
		System.out.println("\n-----WELCOME TO TOLL BOOTH COMSATS SAHIWAL-----\n");
		int action = TollBooth.ask_action();
		

		//CONDITION IF ACTION IS EQUAL TO 3 IT WILL TERMINATE
		while (true){
				//ANTI CONDITION				
					switch(action){
					case 1:

						TollBooth.display();
						TollBooth.exit();
						break;

					case 2:
						TollBooth.submit_entry();
						break;
					case 3:
						System.exit(0);
						break;
					
						

					}
					//IT AGAIN ASK FOR ACTION AFTER EXITING THE PAYMENT MODE
					action = TollBooth.ask_action();
			
		}
	}
}



