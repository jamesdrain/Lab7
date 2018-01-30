import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentInformationHub {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		
		// Multiple arrays

		String[] studentName = { "James Drain", "Maurice Tedder", "Antonella Solomon",
										"Jordan Zwart", "Cody Grant" };
		String[] studentTown = { "Las Vegas", "Chicago", "New York", "Los Angeles", "St. Louis" };
		String[] studentFood = { "bacon and eggs.", "roast duck.", "spaghetti and meatballs.",
										"philly cheese-steak.", "the sushi." };
		String cont = "yes";

		System.out.println("Welcome to our Java Class");
		
		while (cont.equalsIgnoreCase("yes")) {
			
			// Student selection
			
			int userSelection = 0;
			System.out.println("Which student would you like to know about? " 
										+ "\n(enter a number 1-5) ");
			if (!scnr.hasNextInt()) {
				System.out.println("Really?");
				break;
			} else {
				
			userSelection = scnr.nextInt();
			if (userSelection < 1 || userSelection > 5) {
				System.out.println("Not a valid student number... ");
				continue;
			} else {
				
				// Print results from multiple arrays 
				
				System.out.println("Student " + userSelection + " is " 
										+ studentName[userSelection - 1]);
				System.out.println("What would you like to know? " + "\n(enter 'hometown' or 'food') ");
				String detailSelection = scnr.next();
				if (detailSelection.equalsIgnoreCase("hometown")) {
					System.out.println(studentName[userSelection - 1] + " is from " 
										+ studentTown[userSelection - 1]);
				} else if (detailSelection.equalsIgnoreCase("food")) {
					System.out.println(
							studentName[userSelection - 1] + " likes to eat " 
										+ studentFood[userSelection - 1]);
				} else {
					System.out.println("Please enter \"hometown\" or \"food\". Try again -");

				}
			    }
                }

			System.out.println("Want to continue? yes/no ");
			cont = scnr.next();

		}

		System.out.println("Ok, bye. ");
		scnr.close();

	}
}
