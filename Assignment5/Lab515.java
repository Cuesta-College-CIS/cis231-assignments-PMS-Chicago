import java.util.Scanner;

public class Lab515 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] userValues = new int[20]; // List of integers from input
		int i; // counter

		// When you check the first element of this array before setting some value,
		// we cannot ensure that userValues[0] has correct value.

		System.out.println(userValues[0]); // It shows some garbage value

		// - - - - - - - - - - - - - - - - - - - - - - -
		// In your below for-loop, you reference uservalue[0] before setting some value
		// intentionally.
		// Thus, this is very risky code and nor guarantable what value it has
		// - - - - - - - - - - - - - - - - - - - - - - -

		// Import the numbers from the user
		for (i = 0; i <= (userValues[0] + 1); ++i) {
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
