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
    private String fName; // "a Student has a first name"
    private String lName;
    private int gradYear;
    private String email;
 //   private boolean sports;
 //   private double gpa;

    // 2. CONSTRUCTORS (manuals for setting up an object)

    // DEFAULT constructor (user did not provide date)
    //Job: initialize isntance variables to default variables
    public Student() {
        fName = "First";
        fName = "Last";
        gradYear = 2037;
        email = fName + "." + lName + gradYear + "@gbwl.org";
    }

    // Constructor with PARAMETERS (user provided key data)
    // Job: initialize instance variables to PROVIDED values
    public Student(String initFName, String initLName, int initGradYear) {
        fName = initFName;
        lName = initLName;
        gradyear = initGradYear;
        email = fName + "." + lName + gradYear + "@gbwl.org";
    }

    // 3. METHODS (behaviors associated with the object type)







}