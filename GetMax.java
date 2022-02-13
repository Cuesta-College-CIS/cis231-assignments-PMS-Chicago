import java.util.Random;

public class GetMax {
   public static void main(String[] args) {
       Random rand = new Random();   
       int rand1 = rand.nextInt(101);  //random number between 0 and 100.
       int rand2 = rand.nextInt(101); 
       int rand3 = rand.nextInt(101);
       int maxRand;

       if ((rand1 > rand2) && (rand1 > rand3)) {
           maxRand = rand1;
       } 
       else if ((rand2 > rand1) && (rand2 > rand3)) {
        maxRand = rand2;
       }
       else if ((rand3 > rand1) && (rand3 > rand2)) {
        maxRand = rand3;
       }
       else maxRand = -1;  

       System.out.println("Random numbers are: " + rand1 + ", " + rand2 + ", and " + rand3 + ".");

       if (maxRand != -1) {
           System.out.println("The maximum number is: " + maxRand);
       } else System.out.println ("Two of the numbers are the same.");





   }
   
}  

