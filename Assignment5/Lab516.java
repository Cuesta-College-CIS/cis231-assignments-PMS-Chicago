import java.util.Scanner;

public class Lab516 {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int totalNum = scnr.nextInt(); // import integer
		float[] numberList = new float[totalNum]; // use integer to define size of array

		int i; // counter

		float maxNum = 0;

		// import numbers
		// for (i = 0; i < totalNum; ++i) {
		// numberList[i] = scnr.nextFloat();
		// }

		// maxNum = numberList[0];

		// find maxNum
		// for (i = 0; i < totalNum; ++i) {
		// if (numberList[i] > maxNum) {
		// maxNum = numberList[i];
		// }
		// }

		// Combine two loops
		for (i = 0; i < totalNum; ++i) {
			numberList[i] = scnr.nextFloat();
			// Add one condition for the first iteration
			if ((i == 0) || (numberList[i] > maxNum)) {
				maxNum = numberList[i];
			}
		}

		// normalize
		for (i = 0; i < totalNum; ++i) {
			System.out.printf("%.2f", (numberList[i] / maxNum));
			System.out.print(" ");
		}

		System.out.println();

	}
}
