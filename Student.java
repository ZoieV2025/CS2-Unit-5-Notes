/*
Class names like Student are always capitalized 
Example CLASS that defines an OBJECT
Object-Oriented Classes are like BlUEPRINTS
(in another java class, you create instances form this blueprint)
*/

public class Student {
    // 1. INSTANCE VARIABLES (attributes/data/fields)
    // think of whnat this object "needs to know"
    // must be PRIVATE ("encapsulation")
    private String firstName; // "a Student has a first name"
    private String lastName;
    private int gradYear;
    private String email;
    // STATIC variables for data that should ony have ONE COPY for an entire CLASS
    private static int currentYear = 2025;
    private static String schoolName = "BWL";
    private static int studentCount = 0; // COUNTER!!!
    // static does NOT mean unchanging/constant here: 
    // instead, the keyword FINAL would be used
 //   private boolean sports;
 //   private double gpa;
 

    // 2. CONSTRUCTORS (manuals for setting up an object)

    // DEFAULT constructor (user did not provide date)
    //:no-argument" constructor
    //Job: initialize isntance variables to default variables
    public Student() {
        this.firstName = "First";
        this.lastName = "Last";
        this.gradYear = 2037;
        this.email = firstName + "." + lastName + gradYear + "@gbwl.org";

        // increment the student object counter static variable
        // do not use this.studentCount because it is data belonging to the CLASS, not an object instance
        studentCount++;
    }

    // Constructor with PARAMETERS (user provided key data)
    // Job: initialize instance variables to PROVIDED values
    // ORDER FO PARAMETERS IS IMPORTANT!!! (the data types)
    // "initFirstName", etc. are like PLACEHOLDERS for real values

    public Student(String firstName, String lastName, int gradYear) {
        // THIS keyword indicates CURRENT CALLING OBJECT
        this.firstName = FirstName;
        this.lastName = LastName;
        this.gradYear = GradYear;
        this.email = firstName + "." + lastName + gradYear + "@gbwl.org";
        studentCount++;
    }

    // 3. METHODS (behaviors associated with the object type)

    // toString method provides a "String Representation"
    // of an object instance with all its data!
    public String toString() {
        return ("Student[" + firstName + "," + gradYear + "," + email + "]");
    }

    // ACCESSOR METHODS ("Getters") return copies of the private data
    // write one for each of your instance variables!
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getGradYear() {
        return gradYear;
    }
    public String getEmail() {
        return email;
    }

    // MUTATOR METHODS ("Setters") accept a new value
    // and change the instance variable to it
    // Setters are VOID, meaning NO RETURN (output)
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }

   // OTHER METHODS (behaviors/actions associated with the object)
   
   // Example: VOID method, no parameters
   public void complain() {
    // Metjod BODY is the step(s) for this process
    System.out.println("I have too much work");

 }

 // Example: VOID method, needs parameter
 public void doHomework(int numAssignments) {
    // Print a message for each assignment completed
    for (int i = numAssignments; i > 0; i-- ) {
       System.out.println("Working working working...");
    }
    System.out.println("Done with homework!");
 }

// Example: interact with a static variable
public static void printObjectCount(){
    System.out.println(studentCount);
}  

 }





