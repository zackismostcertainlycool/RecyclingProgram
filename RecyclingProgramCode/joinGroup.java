public class joinGroup {

    static Group[] groups = new Group[3];
    static Group[] joinedGroups = new Group[3];
    static int totalJoinedGroups = 0;

    public static void setupGroups() {

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

        System.out.println("\nAvailable Groups\n" + Main.divider);

        System.out.println("Group Number | Group Name | Meeting Time | Contact Info");

        for(int i = 0; i < groups.length; i++) {
            System.out.println((i+1) + " | " +
                groups[i].getName() + " | " +
                groups[i].getMeetingTime() + " | " +
                groups[i].getContact());
        }

        System.out.print("Would you like to join a group? (yes/no): ");
        String answer = Main.scanner.nextLine().toLowerCase();

        if (!answer.equals("yes")) return;

        System.out.print("Enter the group number to join: ");
        int userInput = Main.scanner.nextInt() - 1;
        Main.scanner.nextLine();

        if(userInput < 0 || userInput >= groups.length) {
            System.out.println("Invalid group number");
            return;
        }

        for(int i = 0; i < totalJoinedGroups; i++) {
            if(joinedGroups[i] == groups[userInput]) {
                System.out.println("You have already joined this group");
                return;
            }
        }

        System.out.println("You joined the " + groups[userInput].getName());
        joinedGroups[totalJoinedGroups] = groups[userInput];
        totalJoinedGroups++;
    }
}