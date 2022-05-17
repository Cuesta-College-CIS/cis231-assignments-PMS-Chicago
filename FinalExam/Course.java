public class Course implements CourseActivity{
   String cid;
   String coursename;
   Integer score;
   String grade;

//Class properties
// Member methods
// Implement the inherited methods from the interface

   @Override 
   public void decideGrade(){
     if (score >= 90) {grade = "A";} 
        else if (score >= 80) {grade = "B";}
        else if (score >= 70) {grade = "C";}
        else if (score >= 60) {grade = "D";}
        else if (score < 60) {grade = "F";}
   };
    //Based on the scores, determine letter grade
    //No strict rule to implement

   
   @Override
   public void printCourseInfo(){
       System.out.println("     " + cid + " " + coursename);
       
   };
       // Print the brief Course information
       //Any code segment is fine to print information

   Course (String id, String crsName, Integer totScore){
       cid = id;
       coursename = crsName;
       score = totScore;
       decideGrade(); 
   }

   public String toString(){
      printCourseInfo();
      String courseInfo = ("          Grade earned: " + grade);
      return courseInfo;
   }
}
