import java.util.ArrayList;

public class Student{
    Integer sid;
    String sname;
    ArrayList<Course> clist;

    Student(Integer id, String name, ArrayList<Course> c) {
        sid = id;
        sname = name;
        clist = c;
    }

    public String toString() {
        //basic string for use in print functions in Quiz4()
        
        String stuStr = ("Student: " + sid + "  " + sname);
        return stuStr;
    }

    public Integer getTotalCredits() {
        //simple for loop to add credits up
        Integer totCred = 0;
       
        for (int j = 0; j < clist.size(); ++j){
            totCred += clist.get(j).credit;
            }
        return totCred;
    }
}