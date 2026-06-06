public class personalinformation {

    public static void main(String[] args) {

        // String is used for text such as a person's name
        String fullName = "Richard Buckman";

        // int is used for whole numbers such as age
        int age = 23;

        // char is used for a single character representing gender
        char gender = 'M';

        // double is used for decimal values such as height
        double height = 1.75;

        // double is used for decimal values such as weight
        double weight = 70.5;

        // boolean is used for true/false values
        boolean isStudent = true;

        // long is used for large numbers such as phone numbers
        long phoneNumber = 233501234567L;

        // String is used for text representing level or grade
        String level = "Level 200";

        // String is used for text information such as nationality
        String nationality = "Ghanaian";

        // Display all information
        System.out.println("===== PERSONAL INFORMATION =====");
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height + " meters");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Student Status: " + isStudent);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Level: " + level);
        System.out.println("Nationality: " + nationality);
    }
}