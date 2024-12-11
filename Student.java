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
 //   private boolean sports;
 //   private double gpa;

    // 2. CONSTRUCTORS (manuals for setting up an object)

    // DEFAULT constructor (user did not provide date)
    //:no-argument" constructor
    //Job: initialize isntance variables to default variables
    public Student() {
        firstName = "First";
        lastName = "Last";
        gradYear = 2037;
        email = firstName + "." + lastName + gradYear + "@gbwl.org";
    }

    // Constructor with PARAMETERS (user provided key data)
    // Job: initialize instance variables to PROVIDED values
    // ORDER FO PARAMETERS IS IMPORTANT!!! (the data types)
    // "initFirstName", etc. are like PLACEHOLDERS for real values

    public Student(String initFirstName, String initLastName, int initGradYear) {
        firstName = initFirstName;
        lastName = initLastName;
        gradYear = initGradYear;
        email = firstName + "." + lastName + gradYear + "@gbwl.org";
    }

    // 3. METHODS (behaviors associated with the object type)

    // toString method provides a "String Representation"
    // of an object instance with all its data!
    public String toString() {
        return ("Student[" + firstName + "," + gradYear + "," + email + "]");
    }







}