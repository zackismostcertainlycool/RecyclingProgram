import java.util.Scanner;

public class RecyclingLog {

    static String divider = "-------------------";

    public static void createLog() {

        Scanner scanner = Main.scanner;

        System.out.println("\nRecycle Log\n" + divider);

        System.out.print("Enter grams of paper recycled: ");
        double paper = scanner.nextDouble();

        System.out.print("Enter grams of plastic recycled: ");
        double plastic = scanner.nextDouble();

        System.out.print("Enter grams of metal recycled: ");
        double metal = scanner.nextDouble();

        System.out.print("Enter grams of glass recycled: ");
        double glass = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\nYour Recycling Log");
        System.out.println(divider);
        System.out.println("Paper: " + paper + " g");
        System.out.println("Plastic: " + plastic + " g");
        System.out.println("Metal: " + metal + " g");
        System.out.println("Glass: " + glass + " g");
        System.out.println(divider);
    }
}