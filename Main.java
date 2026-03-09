
import java.util.Scanner;


public class Main {
    public static String divider = "-------------------";
	public static String largeDivider = "==================================================";
	static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main initializeGroups = new Main();

        int userInput = 0;

        // prints program name
        String programName = "Recycling Tracker Program"; 
		System.out.println(largeDivider + "\n"+ programName +"\n" + largeDivider);
        
    while(userInput != 5) {
        mainMenu();
			
			// Gets user input
			
		System.out.print("Enter your choice: ");
		userInput = scanner.nextInt();
		scanner.nextLine();
			
		// Different functionalities depending on user input
			
		switch(userInput) {
			//case 0:
				// add a feature
			//	break;
				
			case 1:
				// add a feature
			break;

			case 2:
				// add a feature
			break;
				
			case 3:
				Main RecyclingCalculator = new Main();
    		break;
				
			case 4:
				Main joinGroup = new Main();
			break;
					
			case 5:
				// Main loop ends
			break;
					
			default:
				System.out.println("Invalid option");
			break;
				
			
		    }
		
		
        }

    }
    private static void mainMenu() {
		System.out.println("\nMain Menu\n" + divider);
		
		// Currently hardcoded, there is probably a better solution
		System.out.println("""
				1. View information on recycling programs
				2. Create/Edit Recycle Log
				3. Recycling Calculator
				4. Join a Local Group
				5. Exit
				""" + divider);
	}

}