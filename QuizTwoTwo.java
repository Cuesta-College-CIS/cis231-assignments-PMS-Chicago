import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class quizTwoTwo {
	public static int[] constructArray(Scanner scnr) { 
	//construct two integer arrays with random values between 0 and 99 and return the array
    int [] constructedArray;
    Random rand = new Random();
    for (int i = 0; i < 100; ++i) {
        constructedArray[i] = rand.nextInt(100);
    }
    return constructedArray;
    }


    public static void printArray(int[]){
        //print all elements of each array
    }

    public static int findMoreEvens(int[] n1, int[] n2){
    //determine whicha rray has more even numbers and return the array number
    }

    public static int findGreatest(int[] n1, int[] n2){
    //determine which array has the greatest value. Return the array number.
    //swap the greatest value to the last element in the array    
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int [] array1, array2;
        
        array1 = constructArray(scnr);
        array2 = constructArray(scnr);
        
        printArray(array1);
        printArray(array2);

        /*int result = findMoreEvens(array1, array2);
        System.out.println("Array " + result + " has more even numbers.");
        
        int result = findGreatest(array1, array2);
        if (result == 1)
            System.out.println("The array " + result + "has the greatest value " + array1[array1.length - 1]);
            else System.out.println("The array " + result + "has the greatest value" + array2[array2.length - 1])
        scnr.close();
        } */


}