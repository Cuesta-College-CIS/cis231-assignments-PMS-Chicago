public abstract class Person {
    //member variables
    //constructor, and Member methods if needed
    //Abstract method PrintPerson();
    
    String name;
    String DOB;   

    Person (String moniker, String bday){
       name = moniker;
       DOB = bday;
    }
   
//should be implemented in the derived class
//print the brief information
//There is no strict requirement for this method

    void printPerson(){
        System.out.println("STUDENT: " +name);
        System.out.println("     " + "Birthdate: " + DOB);

    }
}
