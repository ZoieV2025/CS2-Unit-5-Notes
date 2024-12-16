public class Main {

   // This is the "TESTER CLASS" with main method
   public static void main(String []args) {
      System.out.println("Constructing Student objects...");

      // Call DEFAULT CONSTRUCTOR
      // "Student senior" is the type declaration
      // "= new Student()" is callign the constructor
      Student kinder = new Student();

      // Call CONSTRUCTOR with PARAMETERS (String, String, int)
      Student junior = new Student("Paige", "Nunex", 2026);
      // Does argument order matter??? YES!!!
      // Student senior = new Student(2025, "Zoie", "Vitale");

      // Look at our constructed Student objects
      System.out.println(kinder); // will print the LOCATION of the object
      // ... unless our class has a toString method defined!

      // Construct two more Student objects and print them out
      Student happy = new Student("Jolie", "Vitale", 2026);
      System.out.println(happy);
      
      Student sad = new Student();
      System.out.println(sad);

      // Test ACCESSOR/GETTER methods
      // methods that RETURN output need to be handled
      // 1. either by storing the output in a variable 
      String juniorEmail = junior.getEmail();
      System.out.println(juniorEmail);
      // 2. or by using the method call directly
      System.out.println(kinder.getEmail());
      
      // Test MUTATOR/SETTER methods
      // void methods (no ouput)
      // but they need an argument (input)
      kinder.setFirstName("James");
      kinder.setLastName("Walet");
      System.out.println(kinder);
      kinder.setEmail("James.Walter2037@gbwl.org");
      System.out.println(kinder);
      // note that didn't need to setGradYear because the DEFAULT CONSTRUCTOR gave an appropriate 
      // value fo rthis already (we chose 2037 as teh dafault)
      
   }
}
