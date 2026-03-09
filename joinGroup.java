// code for groups


public static void main(String[] args) {

	    Group[] groups = new Group[3];

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

public static void joinGroup() {
	    int totalJoinedGroups = 0;
		System.out.println("\nAvailable Groups\n" + Main.divider);
		
		// Loops through groups and displays group info
		
		System.out.println("Group Number | Group Name | Meeting Time | Contact Info");
		System.out.println(groups[0]);
		System.out.println(groups[1]);
		System.out.println(groups[2]);
		
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

