import java.util.Arrays;
import java.util.Scanner;

public class quiz2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int L = 3; // will NOT use L. Just for the extendability.
		final int M = 3;
		final int N = 2;
		int[][] matrix1 = { { 2, 5, 10 },
				{ 3, 6, 9 },
				{ 1, 2, 3 } };
		int[][] matrix2 = { { 10, 20 },
				{ 30, 40 },
				{ 50, 60 } };
		int rowidx = scnr.nextInt();

        int sum = 0;
        

		
        for (int j = 0; j < N; ++j){    //matrix 2 columns
            for (int i = 0; i < M; ++i){  //multiply by appropriate location in matrix 1
                sum = sum + (matrix1[rowidx][i] * matrix2[i][j]);
            }
            System.out.print(sum + " ");
            sum = 0; 
        }
        System.out.println();

	}

}