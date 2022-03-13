import java.util.Scanner;

public class Lab515 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] userValues = new int[20]; // List of integers from input
		int i; // counter

		// - - - - - - - - - - - - - - - - - - - - - - -
		userValues[0] = scnr.nextInt();
		// - - - - - - - - - - - - - - - - - - - - - - -

		// Import the numbers from the user
		for (i = 1; i <= (userValues[0] + 1); ++i) {
			userValues[i] = scnr.nextInt();
			System.out.println(userValues[i]);
		}

		// Print the appropriate numbers
		for (i = 1; i <= userValues[0]; ++i) {
			if (userValues[i] < userValues[(userValues[0] + 1)]) {
				System.out.print(userValues[i] + ",");
			}

		}
		System.out.println();
	}
}
