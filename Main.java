// Base class
class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name; // this keyword
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass (Single Inheritance)
class Student extends Person {
    protected int grade;

    public Student(String name, int age, int grade) {
        super(name, age); // calls parent constructor
        this.grade = grade;
    }

    // Method overriding
    public void displayInfo() {
        super.displayInfo(); // call parent method
        System.out.println("Grade: " + grade);
    }
}

// Multilevel Inheritance
class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String name, int age, int grade, String topic) {
        super(name, age, grade);
        this.researchTopic = topic;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Topic: " + researchTopic);
    }
}

// Hierarchical Inheritance
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}

// Final class (cannot be inherited)
final class School {
    public void showMessage() {
        System.out.println("Welcome to the School System");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Student s = new Student("Caleb", 17, 12);
        GraduateStudent g = new GraduateStudent("John", 24, 16, "Cybersecurity");
        Teacher t = new Teacher("Mr. Smith", 40, "Math");

        System.out.println("--- Student ---");
        s.displayInfo();

        System.out.println("\n--- Graduate Student ---");
        g.displayInfo();

        System.out.println("\n--- Teacher ---");
        t.displayInfo();

        School school = new School();
        school.showMessage();
    }
}