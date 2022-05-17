import java.util.ArrayList;

public class Question3 {
    
    
    public static ArrayList<Student> fillupStudent(){
        
        //I had trouble with the file input -- went instead with hardcoding the data into the Student and Course objects
        
        //Create the ArrayList of Student objects
        ArrayList<Student> slist = new ArrayList<Student>();

        //Create the ArrayLists of Course objects
        ArrayList<Course> johnCourses = new ArrayList<Course>();
        ArrayList<Course> kurtCourses = new ArrayList<Course>();
        ArrayList<Course> kimCourses = new ArrayList<Course>();
        
        //Create the individual Course objects

        Course johnCourse1 = new Course("CIS01", "C++", 90);
        Course johnCourse2 = new Course("CIS02", "Python", 80); 
        Course johnCourse3 = new Course("CIS231","Java", 90); 

        Course kurtCourse1 = new Course("CIS01", "C++", 100);
        Course kurtCourse2 = new Course("CIS02", "Python", 100); 
        Course kurtCourse3 = new Course("CIS232","Java2", 90); 
        Course kurtCourse4 = new Course("CNT02", "Cisco", 80);

        Course kimCourse1 = new Course("CIS01", "C++", 100); 
        Course kimCourse2 = new Course("CIS232","Java2", 80); 

        //Add the courses to the ArrayList<Course>

        johnCourses.add(johnCourse1);
        johnCourses.add(johnCourse2);
        johnCourses.add(johnCourse3);

        kurtCourses.add(kurtCourse1);
        kurtCourses.add(kurtCourse2);
        kurtCourses.add(kurtCourse3);
        kurtCourses.add(kurtCourse4);

        kimCourses.add(kimCourse1);
        kimCourses.add(kimCourse2);

        //Make the Student objects

        Student john = new Student(1001, "John", 9, "03/01/2002", johnCourses);
        slist.add(john);

        Student kurt = new Student(1002, "Kurt", 12, "05/01/2002", kurtCourses);
        slist.add(kurt);

        Student kim = new Student(1003, "Kim", 6, "01/01/1990", kimCourses);
        slist.add(kim);


        return slist;
   }


    public static void printStudent(ArrayList<Student> slist) {
        for (int i = 0; i < slist.size(); ++i) {
            System.out.println(slist.get(i).toString());
            for (int j = 0; j < slist.get(i).clist.size(); ++j){
            System.out.println(slist.get(i).clist.get(j).toString());
            }
            System.out.println();
           
        }
    }

    public static void main(String[] args) {
    ArrayList<Student> slist;
    slist = fillupStudent();
    printStudent(slist);
    //more code to test the methods in each class object


    }

}

