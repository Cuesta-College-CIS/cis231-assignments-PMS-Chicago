import java.util.ArrayList;
import java.util.Scanner;

public class Quiz4 {
   public static ArrayList<Student> fillupStudent() {
    int stuNum;
    int crsNum;
    Scanner scnr = new Scanner(System.in);

    System.out.println("How many students are you entering?");
    stuNum = scnr.nextInt();

    ArrayList<Student> fillUp = new ArrayList<Student>();

    for(int i = 0; i < stuNum; ++i){
        System.out.println("What is Student " + (i+1) + "'s ID?");
        Integer sidInput = scnr.nextInt();
        System.out.println("What is Student" + (i+1) + "'s name?");
        String snameInput = scnr.next();
        scnr.nextLine();
        System.out.println("How many courses have they taken?");
        crsNum = scnr.nextInt();

        ArrayList<Course> stuCourses = new ArrayList<Course>();
        for(int j = 0; j < crsNum; ++j){
            System.out.println("What is course " + (j+1) + "'s ID?");
            String cidInput = scnr.next();
            scnr.nextLine();
            System.out.println("What is the course's name?");
            String cnameInput = scnr.next();
            scnr.nextLine();
            System.out.println("How many credits is the class?");
            Integer creditInput = scnr.nextInt();
            scnr.nextLine();
            System.out.println("What is the grade they received?");
            String gradeInput = scnr.next();
            Course enteredCourse = new Course(cidInput, cnameInput, creditInput, gradeInput);
            stuCourses.add(enteredCourse);
        }
        Student newbie = new Student(sidInput, snameInput, stuCourses);
        fillUp.add(newbie);
    }

      return fillUp;
   }
   
   // testBench() fills in preset values to speed testing of code in other parts of program
   public static ArrayList<Student> testBench() {
    
    ArrayList<Student> testFill = new ArrayList<Student>();
    ArrayList<Course> testCourses1 = new ArrayList<Course>();
    ArrayList<Course> testCourses2 = new ArrayList<Course>();
    ArrayList<Course> testCourses3 = new ArrayList<Course>();

    Course enteredCourse1 = new Course("Anth 101", "Intro", 3, "A");
    Course enteredCourse2 = new Course("Anth 102", "Bio", 3, "B");
    Course enteredCourse3 = new Course("Anth 103", "Archaeology", 3, "C");
    testCourses1.add(enteredCourse1);
    testCourses2.add(enteredCourse1);
    testCourses3.add(enteredCourse1);
    testCourses2.add(enteredCourse2);
    testCourses3.add(enteredCourse2);
    testCourses3.add(enteredCourse3);

    Student newbie1 = new Student(1234, "Bob", testCourses1);
    testFill.add(newbie1);

    Student newbie2 = new Student(2345, "Phil", testCourses2);
    testFill.add(newbie2);

    Student newbie3 = new Student(3456, "John", testCourses3);
    testFill.add(newbie3);

    return testFill;
   }



   public static void printStudent(ArrayList<Student> slist) {
       //Your code

       for (int i = 0; i < slist.size(); ++i) {
           System.out.println(slist.get(i).toString());
           for (int j = 0; j < slist.get(i).clist.size(); ++j){
           System.out.println(slist.get(i).clist.get(j).toString());
           }
           System.out.println();
           System.out.println("Total credits: " + slist.get(i).getTotalCredits());
           System.out.println();
       }
       
       
      
   }

   public static void printStudent(ArrayList<Student> slist, Integer id){
       //Your code
        System.out.println("The student who has the greatest credits:");
        System.out.println(slist.get(id).toString());
        for (int j = 0; j < slist.get(id).clist.size(); ++j){
        System.out.println(slist.get(id).clist.get(j).toString());
        }
        System.out.println();
        System.out.println("Total credits: " + slist.get(id).getTotalCredits());
        System.out.println();
   }

   public static Integer findStudent(ArrayList<Student> slist) {
       //Find the student with the most credits
       int maxCr = 0;
       int maxId = 0;
       int tot = 0;
       for (int i = 0; i < slist.size(); ++i) {
           tot = slist.get(i).getTotalCredits();
           if ( tot > maxCr) {
               maxId = i;
               maxCr = tot;
            } 
        }
       return maxId;
   }

   public static void main(String[] args) {
       Integer sid;
       ArrayList<Student> slist = new ArrayList<Student>();

       //use testBench() to test output based on three preset student objects
       //slist = testBench();

       //use fillupStudent() for manually entering input
       slist = fillupStudent();  //creates student and course objects
       printStudent(slist);  //prints out list of students
       sid = findStudent(slist);  //finds student with greatest number of credits
       printStudent(slist, sid);  //prints details on student with greatest number of credits
   }






}
