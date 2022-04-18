import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class quizTwoTwo {
	public static int[] constructArray(Scanner scnr) { 
	//construct two integer arrays with random values between 0 and 99 and return the array
    int [] constructedArray = new int[100];
    Random rand = new Random();
    for (int i = 0; i < 100; ++i) {
        constructedArray[i] = rand.nextInt(100);
        }
    return constructedArray;
    }


    public static void printArray(int[] arrayForPrint){
        //print all elements of each array
        for (int val : arrayForPrint)
        System.out.print(val + " ");
        System.out.println();
    }
    
    public static int findMoreEvens(int[] n1, int[] n2){
    //determine which array has more even numbers and return the array number
        int evensOne = 0;
        int evensTwo = 0;

        for (int i = 0; i < n2.length; ++i) {
            if (n1[i] % 2 == 0) {
                ++evensOne;
            }
            if (n2[i] % 2 == 0) {
                ++evensTwo;
            }

        }
        if (evensOne > evensTwo) {
            return 1;} else return 2;
    }

    
    public static int findGreatest(int[] n1, int[] n2){
    //determine which array has the greatest value. Return the array number.
    //swap the greatest value to the last element in the array    
        int maxOne = n1[0];
        int maxTwo = n2[0];
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < 100; ++i){
            if (n1[i] > n1[n1.length-1]){
                temp1 = n1[n1.length-1];
                n1[n1.length-1] = n1[i];
                n1[i] = temp1;
            }
            if (n2[i] > n2[n2.length-1]){
                temp2 = n2[n2.length-1];
                n2[n2.length-1] = n2[i];
                n2[i] = temp1;
            }
        }

        if (n1[n1.length-1] > n2[n2.length-1]){
            return 1;
        } else return 2;
    } 

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int [] array1, array2;
        
        array1 = constructArray(scnr);
        array2 = constructArray(scnr);
        
        printArray(array1);
        printArray(array2);
        
        int result = findMoreEvens(array1, array2);
        System.out.println("Array " + result + " has more even numbers.");
        
        
        int result2 = findGreatest(array1, array2);
        if (result2 == 1)
            System.out.println("The array " + result2 + " has the greatest value: " + array1[array1.length - 1]);
            else System.out.println("The array " + result2 + " has the greatest value: " + array2[array2.length - 1]);
        
         
        scnr.close();
    }


}