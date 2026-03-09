import java.util.Scanner;

public class RecyclingCalculator {
		public static String divider = "-------------------";

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

			System.out.println("Recycling Calculator\n" + divider);
	        System.out.print("How many grams of paper recycled per day? ");
	        double paper = scanner.nextdouble();
	        paper = paper / 1000; // Convert g to kg
	        
	        System.out.print("How many grams of plastic recycled per day? ");
	        double plastics = scanner.nextdouble();
	        plastics = plastics / 1000; // Convert g to kg
	        
	        System.out.print("How many grams of metal recycled per day? ");
	        double metal = scanner.nextdouble();
	        metal = metal / 1000; // Convert g to kg
	        
	        System.out.print("How many grams of glass recycled per day? ");
	        double glass = scanner.nextdouble();
	        glass = glass / 1000; // Convert g to kg

	        double carbonSaved = paper * 0.46 + plastics * 1.7 + metal * 4 + glass * 0.3;

	        System.out.println(divider + "\nEstimated CO2 saved per day: " + carbonSaved + " kg." + divider + " \nReturning to main menu.");

	    }
	}