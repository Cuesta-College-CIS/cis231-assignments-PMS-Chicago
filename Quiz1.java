import java.util.Arrays;
import java.util.Scanner;

public class quiz1 {
	public static void main(String[] args) {
		final int CNT = 5;
		int minval, minidx, tmp;

		Scanner scnr = new Scanner(System.in);
		int N = scnr.nextInt();
		int[] numbers = new int[N];
		for (int i = 0; i < N; i++)
			numbers[i] = scnr.nextInt();
        
        
        

		
        //progressively find the smallest of the numbers and swap it to positions 0 - 4
        for (int j = 0; j < CNT; j++){
            minval = numbers[j];
            minidx = j;

            for (int i = j; i < N; i++){
                if (numbers[i] < minval) {
                    minval = numbers[i];
                    minidx = i;
                    }
            }
            tmp = numbers[j];
            numbers[j] = minval;
            numbers[minidx] = tmp;

            for (int i = 0; i < N; i++)
                System.out.print(numbers[i] + " ");
                System.out.println();
        }
		scnr.close();
	}

}