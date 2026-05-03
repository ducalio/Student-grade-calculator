import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Student name
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        // Marks input
        System.out.print("Enter marks for Subject 1: ");
        double sub1 = input.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double sub2 = input.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double sub3 = input.nextDouble();

        // Calculate average
        double average = (sub1 + sub2 + sub3) / 3;

        // Determine grade
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Output results
        System.out.println("\n--- Result ---");
        System.out.println("Name: " + name);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        input.close();
    }
}