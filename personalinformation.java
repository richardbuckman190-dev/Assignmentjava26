public class personalinformation{          

      public static void main(String[] args){

    // String: used for text. Full name has letters + space, so string is the only fit
       String fullname = "Kofitse Rita Fafali";

    // int: used for whole numbers. Age can't be 20.5, so int is perfcet       
       int age = 20;

    // char: used for a single character. 'M' for Male, 'F' for Female
       char gender = 'F';

    // double: used for decimal numbers.Height naads decimal for accuracy like 5.9ft
       double height = 5.6;

   // float: used for decimals, uses les memory than double. must add 'f' at the end
     float weight = 59.4f;

   // boolean: used for true/false values only. student status is either true or false
      boolean isStudent = true;

   // long: used for very large whole numbers. phone numbers exceed int's max value
      long phoneNumber = 597148981L; // the 'L' tells java this is long

   // String: Grade/Level can be "100L", "Senior", etc. letters + numbers = String
      String gradeLeveL = "200L";

   // String: another example. Email has letters, numbers, symbols = String
      String email = "kofitseritafafali@gmail.com";

   // Display all information neatly
      System.out.println("==  PERSONAL INFORMATION ==");
      System.out.println("Full Name:" + fullname);
      System.out.println("Age: " + age + "years old"); 
      System.out.println("Gender: " + gender);
      System.out.println("Height: " + height + "ft");
      System.out.println("Weight: " + weight + "kg");
      System.out.println("Student Status: " + isStudent);
      System.out.println("Phone Number: " + phoneNumber);
      System.out.println("Grade/LeveL: " + gradeLeveL);
      System.out.println("Email: " + email);
      System.out.println("==============================");

         }

   

  } 