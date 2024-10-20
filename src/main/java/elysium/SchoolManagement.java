package elysium;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kehi frack herve wilfried
 */
public class SchoolManagement {

    /**
     *
     * Function to display a menu and get the user's choice
     *
     * @return user choice
     */
    public static int getMenuChoice() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for user input
        System.out.println("\nChoose an option:");
        System.out.println("1. Add a Student");
        System.out.println("2. Add a Teacher");
        System.out.println("3. Display all People");
        System.out.println("4. Exit");
        return scanner.nextInt();  // Return the user's menu choice
    }

    /**
     *
     * Function to add a new Student
     *
     * @param people an ArrayList of Person
     */
    public static void addStudent(ArrayList<Person> people) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();  // Read student's name
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();  // Read student's age
        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();  // Read student's ID
        Student student = new Student(name, age, studentId);  // Create a new Student object
        people.add(student);  // Add the student to the list of people
        System.out.println("Student added successfully!");  // Confirm addition
    }

    /**
     *
     * Function to add a new Teacher
     *
     * @param people an ArrayList of Person
     */
    public static void addTeacher(ArrayList<Person> people) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter teacher name: ");
        String name = scanner.nextLine();  // Read teacher's name
        System.out.print("Enter teacher age: ");
        int age = scanner.nextInt();  // Read teacher's age
        scanner.nextLine();  // Consume the leftover newline character
        System.out.print("Enter teacher's subject: ");
        String subject = scanner.nextLine();  // Read teacher's subject
        Teacher teacher = new Teacher(name, age, subject);  // Create a new Teacher object
        people.add(teacher);  // Add the teacher to the list of people
        System.out.println("Teacher added successfully!");  // Confirm addition
    }

    /**
     *
     * Main function to run the program
     */
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();  // ArrayList to store Person objects (students and teachers)
        OUTER:
        while (true) {
            int choice = getMenuChoice();
            // Handle the user's choice using conditionals
            switch (choice) {
                case 1 ->
                    addStudent(people);  // Call the addStudent function to add a student
                case 2 ->
                    addTeacher(people);  // Call the addTeacher function to add a teacher
                case 3 -> {

                    // Display all people (students and teachers)
                    if (people.isEmpty()) {
                        System.out.println("No people added yet.");  // If the list is empty, display a message
                    } else {
                        for (Person person : people) {
                            person.introduce();  // Call the introduce method of each person
                        }
                    }
                }
                case 4 -> {
                    // Exit the loop and end the program
                    System.out.println("Exiting...");
                    break OUTER; // Break out of the loop to end the program
                }
                default -> // Handle invalid menu choices
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
