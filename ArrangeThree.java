//ArrangeThree
import java.util.Random;

public class ArrangeThree {
   public static void main(String[] args) {
       Random rand = new Random();   
       int rand1 = rand.nextInt(101);  //random number between 0 and 100.
       int rand2 = rand.nextInt(101); 
       int rand3 = rand.nextInt(101);
       int maxRand = 0;
       int midRand = 0;
       int minRand = 0;

       //evaluate rand 1
       if ((rand1 > rand2) && (rand1 > rand3)) {
           maxRand = rand1;
       } 
       else if ((rand1 > rand2) || (rand1 > rand3)) {
        midRand = rand1;
       }
       else minRand = rand1;
       
       //evaluate rand 2
       if ((rand2 > rand1) && (rand2 > rand3)) {
        maxRand = rand2;
       } 
       else if ((rand2 > rand1) || (rand2 > rand3)) {
       midRand = rand2;
       }
       else minRand = rand2;

       //evaluate rand 3
       if ((rand3 > rand1) && (rand3 > rand2)) {
        maxRand = rand3;
       } 
       else if ((rand3 > rand1) || (rand3 > rand2)) {
       midRand = rand3;
       }
       else minRand = rand3;

    

       System.out.println("Random numbers are: " + rand1 + ", " + rand2 + ", and " + rand3 + ".");
       System.out.println("In ascending order: " + minRand + ", " + midRand + ", and " + maxRand + ".");

      
       





   }
   
}  