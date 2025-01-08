/**
 * StudentDocs.java
 * @author Zoie Vitale
 * @since 6Jan2025
 * @versin 1.0 
 * This class defines a Student object, and includes formal documentation comments
 */

public class StudentDocs {

    private String firstName; 
    private String lastName;
    private int gradYear;
    private String email;

    /**
     * Constructor that sets default values for each of the instance variables defined above
     */
    public StudentDocs() {
        firstName = "First";
        lastName = "Last";
        gradYear = 2037;
        email = firstName + "." + lastName + gradYear + "@gbwl.org";
    }

    /**
    * Constructor that assigns provided values to the object's instance variables, and creates an email address based on those values
    * @param initFirstName a String representing the Student's first name
    * @param initLastName a String representing the Student's last name
    * @param initGradYear an int representign the Student's graduation year
    */

    public StudentDocs(String initFirstName, String initLastName, int initGradYear) {
        firstName = initFirstName;
        lastName = initLastName;
        gradYear = initGradYear;
        email = firstName + "." + lastName + gradYear + "@gbwl.org";
    }


/**
 * @return String representing the object instance and variables
 */
    public String toString() {
        return ("Student[" + firstName + "," + gradYear + "," + email + "]");
    }

/**
 * @return getFirstName Students first name as a String
 */
    public String getFirstName() {
        return firstName;
    }

/**
* @return getLastName Student's last name as a String
*/
    public String getLastName() {
        return lastName;
    }
    /**
     * @return getGrad Year Student's graduation year as an int
     */
    public int getGradYear() {
        return gradYear;
    }
/**
 * @return getEmail Student's emal address as a String
 */
    public String getEmail() {
        return email;
    }

/**
 * @param newFirstName - a String to change Student's first name to
 */
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }
/**
 * @param newLastName - a String to change Student's last name to
 */
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }
/**
 * @param newGradYear - a String to change a Student's grad year to
 */
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }
/**
 * @param newEmail -  a String to change Student's email address to
 */
    public void setEmail(String newEmail) {
        email = newEmail;
    }


   
/**
 * Prints out a complaint message
 */
   public void complain() {
    System.out.println("I have too much work");

 }
/**
 * Loops from numAssignments, decreasing until there are 0 assignments left and prints a message indicating the Student is doen with their homework. 
 * @param numAssignments - an int representing the amount of homework assignments to be compelted by the Student
 */
 public void doHomework(int numAssignments) {
    for (int i = numAssignments; i > 0; i-- ) {
       System.out.println("Working working working...");
    }
    System.out.println("Done with homework!");



    // Testing the Student class documentation
    // HOVER over the words to view the docs we wrote!
    StudentDocs test = new StudentDocs("Roaree", "Lion", 2025);
    test.getEmail();
    test.setGradYear(2026);
    test.doHomework(10);

    // Demonstrate use of STATIC methods (one copy for a class)
    // Static methods are called on the CLASS name, NOT an object instance
    Student.printObjectCount();
    
    Student middleSchooler = new Student();
    Student.printObjectCount(); 
}

}