// code for Recycling Map
import java.util.Scanner;

public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Recycling Map\n" + Main.divider);
    
    char locationCheck = 'y';
    System.out.println("Do you live near Everett, WA, and want to view nearby recycling centers? (y/n): ");
    locationCheck = scnr.nextLine().charAt(0);

    if(locationCheck == 'y') {
        System.out.println("Here are some nearby recycling centers:\n" + Main.divider); // these locations are real
        System.out.println("1. Snohomish County Public Works - 3000 Rockefeller Ave, Everett, WA 98201");
        System.out.println("2. Reclamation Inc - 2730 Harrison Ave, Everett, WA 98201");
        System.out.println("3. S & S Recycling LLC - 4019 Smith Ave Suite A, Everett, WA 98201");
        System.out.println("Returning to main menu");
    } else {
        System.out.println("If you do not live near Everett but still want to see nearby recycling centers, you can use a program like Google Maps to help find one. \nReturning to main menu...");
    }


}
