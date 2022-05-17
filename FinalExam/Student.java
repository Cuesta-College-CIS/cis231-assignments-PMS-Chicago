import java.util.ArrayList;
public class Student extends Person {
  //member variables
  //Constructor and member methods if needed
  //Implement the inherited abstract method for printing info
  Integer sid;
  Integer credits;
  ArrayList<Course> clist;

  Student(Integer id, String stuname, Integer cred, String birthday, ArrayList<Course> courses){
    super(stuname, birthday);
    sid = id;
    credits = cred;
    clist = courses;
  }

  public String toString() {
      //basic string for use in print functions
      printPerson();
      String stuStr = ("     " + "System ID: " + sid + "  (" + credits + " credits earned)");
      return stuStr;
  }
}

