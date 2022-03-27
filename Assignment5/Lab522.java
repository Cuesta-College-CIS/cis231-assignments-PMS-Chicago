import java.util.Scanner;

public class Lab522 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int N1 = scnr.nextInt();
		int[] num1 = new int[N1];
		for (int i = 0; i < N1; i++)
			num1[i] = scnr.nextInt();

		int N2 = scnr.nextInt();
		int[] num2 = new int[N2];
		for (int i = 0; i < N2; i++)
			num2[i] = scnr.nextInt();

		// find iterations needed to get to end of shortest array
		int shortOne;
		if (N1 >= N2) {
			shortOne = (N2 * 2);
		} else
			shortOne = (N1 * 2);

		int rem; // variable for modulo
		int[] result = new int[N1 + N2]; // shuffled array

		for (int i = 0; i < shortOne; ++i) {
			rem = i % 2;
			if ((rem == 0) && (i < shortOne)) {
				result[i] = num1[i / 2];
			} else if ((rem != 0) && (i < shortOne)) {
				result[i] = num2[i / 2];
			}
		}

		if (shortOne == (N1 * 2))
			for (int i = 0; i < N2 - N1; ++i)
				result[i] = num2[i - N1];
		else
			for (int i = 0; i < N1 - N2; ++i)
				result[i] = num1[i - N2];

		// for (int i = 0; i < result.length; ++i) {
		// rem = i % 2;

		// if ((rem == 0) && (i < shortOne)) {
		// result[i] = num1[i / 2];
		// } else if ((rem != 0) && (i < shortOne)) {
		// result[i] = num2[i / 2];
		// } else if (shortOne == (N1 * 2)) {
		// result[i] = num2[i - N1];
		// } else
		// result[i] = num1[i - N2];

		// }

		for (int v : result)
			System.out.print(v + " ");
		System.out.println();
		scnr.close();
	}

}