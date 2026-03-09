// code for groups


import java.util.Scanner;

private static void initializeGroups() {

	    groups = new Group[3];

	    groups[0] = new Group(
	        "Recycling Club",
	        "Every Saturday at 9 AM",
	        "recycleclub@gmail.com"
	    );

	    groups[1] = new Group(
	        "Recycling Awareness Group",
	        "Meetings online at 11 AM every Sunday",
	        "recyclingAwarenessOfficial@gmail.com"
	    );

	    groups[2] = new Group(
	        "Sustainability Volunteers",
	        "Every Wednesday at 6 PM",
	        "sustainabilityVolunteers@outlook.com"
	    );
	}

private static void joinGroup() {
		System.out.println("\nAvailable Groups\n" + divider);
		
		// Loops through groups and displays group info
		
		for(int i = 0; i < groups.length; i++) {
			System.out.println(i+1 + ". " + groups[i].getName());
			System.out.println("Meetings: " + groups[i].getMeetings());
			System.out.println("Contact Info: " + groups[i].getContact() + "\n");
		}
		
		System.out.print("Would you like to join a group? (yes/no): ");
		
		// Exits method if user types anything but yes
		String answer = scanner.nextLine().toLowerCase();
		if (!answer.equals("yes")) return;
		
		System.out.print("Enter the group number to join: ");
        int userInput = scanner.nextInt()-1;
        scanner.nextLine();
        
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

