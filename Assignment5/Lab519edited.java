import java.util.Scanner;

public class Lab519edited {
	public static void main(String[] args) {
		int length = 5;
		int[] numbers = { 5, 20, 30, 35, 50, 0, 0, 0, 0, 0 };
		int insert_value, idx;
		int j, k; // counters

		Scanner scnr = new Scanner(System.in);
		insert_value = scnr.nextInt();

		// insert number

		// If the number falls
		// for (j = 0; j < (length + 1); ++j) {
		// if (insert_value <= numbers[j]) {
		// // - - - - - - - - - - - - - - - - - - - -
		// // looks like nested for loop.
		// // actually, it is not nested for loop, since there is a "break" statement
		// for (k = length; k > j; --k) {
		// numbers[k] = numbers[k - 1];
		// }
		// numbers[j] = insert_value;
		// length++;
		// break;
		// }
		// }
		for (j = 0; j < (length + 1); ++j) {
			if (insert_value <= numbers[j]) {
				break;
			}
		}
		for (k = length; k > j; --k) {
			numbers[k] = numbers[k - 1];
		}
		numbers[j] = insert_value;
		if (length < numbers.length)
			length += 1;

		// - - - - - - - - - - - - - - - - - - - -
		// no need to think of the case when we insert at the last position.
		// The line 34~37 can be applied to both cases, insertion to middle of array,
		// and to the last position.

		// If the number is larger than everything in the array...
		// if (insert_value > numbers[length - 1]) {
		// numbers[length] = insert_value;
		// length++;
		// }

		// output numbers in new order
		for (int i = 0; i < length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		scnr.close();
	}

}
