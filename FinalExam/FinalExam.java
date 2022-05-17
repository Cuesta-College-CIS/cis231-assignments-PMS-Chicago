import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class FinalExam {
	
    public static int[] constructArray() { 
	//construct an arrays with random values between 0 and 99 and return the array
    Scanner scnr = new Scanner(System.in);
    Integer n1 = 2;
    while ((n1 % 2) == 0 || (n1 <= 3)){
        System.out.println("Enter an odd number greater than 3.");
        n1 = scnr.nextInt();
    }
    
    scnr.close();
    
    int [] constructedArray = new int[n1];
    Random rand = new Random();
    for (int i = 0; i < n1; ++i) {
        constructedArray[i] = rand.nextInt(100);
        }
    return constructedArray;
    }

    
    public static void printArray(int[] arrayForPrint){
        //print all elements of each array
        System.out.println("Array Values:");
        for (int val : arrayForPrint)
        System.out.print(val + " ");
        System.out.println();
    }

    public static int findMedian(int[] arrayToExamine){
    //makes clone, sorts it, and determines median by finding middle element position
        int[] copyArr = arrayToExamine.clone();
        Arrays.sort(copyArr);
        return copyArr[copyArr.length / 2];
    }

    public static int findMaxSub(int[] arrSub){
    //iterates through array and calculates subseqeunce value for each combo    
        int maxLoc = 0;  //holds starting position number of greatest three number subsequence
        int currMax = 0; //holds the value of the best number so far
        
        for (int i = 0; i < (arrSub.length - 2); ++i){
            int calc = arrSub[i] + arrSub[i+1] + arrSub[i+2];
            if (calc > currMax) {
                maxLoc = i;
                currMax = calc;
            }      
        }

        return maxLoc;
    } 
    
    public static void giveAnswers(int[] arrayToExamine, int medianAmt, int startLoc) {
        printArray(arrayToExamine); 
        
        System.out.println("The median element is: " + medianAmt);
        System.out.print("The max three number sequence is: ");
        for (int i = 0; i < 3; ++i){
            System.out.print( arrayToExamine[startLoc + i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int [] array1 = constructArray();   //create the array and fill it with random numbers
        
        int max = findMaxSub(array1);       //identify the starting position of the max three number sequence
        
        int med = findMedian(array1);       //identify the median element of the array

        giveAnswers(array1, med, max);      //print out results for the user
        
    }


}
