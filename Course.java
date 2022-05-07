public class Course{
    String cid;
    String cname;
    Integer credit;
    String grade;

    Course(String id, String name, Integer c, String g){
        cid = id;
        cname = name;
        credit = c;
        grade = g;
    }

    public String toString() {
        //Your code
        //Override the toString() to print the course object
        String crsStr = ("   Course: " + cid.toString() + "  " + cname.toString() + "  " + credit.toString() + "  " + grade.toString());
        
        return crsStr;
    }
}