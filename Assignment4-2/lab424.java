import java.util.Scanner;

public class lab424 {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		int userInput = scnr.nextInt();
		int sum = 0;
		int cnt = 0; // counter

		/* Type your code here. */
		while ((sum + userInput) <= 100) {

			// if ((cnt == 0) && (userInput > 100)) {
			// sum = 0;
			// cnt = 0;
			// break;
			// }
			++cnt;
			sum += userInput;
			userInput = scnr.nextInt();
		}

		// Use the below line to print the result. sum = the summation, cnt = the number
		// of inputs used in sum
		System.out.printf("%d\t%d\n", sum, cnt);
		scnr.close();
	}
}
