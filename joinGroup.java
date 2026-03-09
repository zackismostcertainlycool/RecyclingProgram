// code for groups


import java.util.Scanner;

public static void initializeGroups() {

	    String[] groups = new String[3];

	    groups[0] = new String(
	        "Recycling Club \n Every Saturday at 9 AM \n recycleclub@gmail.com",
	    );

	    groups[1] = new String(
	        "Recycling Awareness Group \n Meetings online at 11 AM every Sunday \n recyclingAwarenessOfficial@gmail.com"
	    );

	    groups[2] = new String(
	        "Sustainability Volunteers \n Every Wednesday at 6 PM \n sustainabilityVolunteers@outlook.com"
	    );
	}

public static void joinGroup() {
		System.out.println("\nAvailable Groups\n" + Main.divider);
		
		// Loops through groups and displays group info
		
		for(int i = 0; i < groups[i].length; i++) {
			System.out.println(i+1 + ". " + groups[i].getName());
			System.out.println("Meetings: " + groups[i].getMeetings());
			System.out.println("Contact Info: " + groups[i].getContact() + "\n");
		}
		
		System.out.print("Would you like to join a group? (yes/no): ");
		
		// Exits method if user types anything but yes
		String answer = Main.scanner.nextLine().toLowerCase();
		if (!answer.equals("yes")) return;
		
		System.out.print("Enter the group number to join: ");
        int userInput = Main.scanner.nextInt()-1;
        Main.scanner.nextLine();
        
        // Exits method if user types invalid group number
        if(userInput < 0 || userInput >= groups.length) {
        	System.out.println("Invalid group number");
        	return;
        }
        
        // Exits method if user already joined the chosen group
        for(int i = 0; i < totalJoinedGroups; i++) {
        	if(joinedGroups[i] == groups[userInput]) {
        		System.out.println("You have already joined this group");
        		return;
        	}
        }
        
        // Joins group
        System.out.println("You joined the " + groups[userInput].getName());
        joinedGroups[totalJoinedGroups] = groups[userInput];
        totalJoinedGroups++;
        
		
	}
	
	// Displays groups and handles joining groups

