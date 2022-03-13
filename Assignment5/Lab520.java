import java.util.Scanner;

public class Lab520 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int idx, length, target, flag;
		int[] numbers = { 45, 20, 30, 35, 10 };

		flag = 0;
		target = scnr.nextInt();
		length = numbers.length;
		for (idx = 0; idx < length; idx++) {
			if (target == numbers[idx]) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			for (int i = idx; i < length - 1; i++) {
				numbers[i] = numbers[i + 1];
			}
			length -= 1;
		}
		for (int i = 0; i < length; i++)
			System.out.print(numbers[i] + " ");
		System.out.println();

		scnr.close();
	}

}