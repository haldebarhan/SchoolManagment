package elysium;

// Class Student that extends Person
class Student extends Person {

    int studentId;  // Unique student ID

    // Constructor to initialize the student's name, age, and student ID
    public Student(String name, int age, int studentId) {
        super(name, age);  // Call the constructor of the superclass Person
        this.studentId = studentId;  // Initialize the student's unique ID
    }

    // Implementation of the abstract introduce method
    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + name + ". I'm " + age + " years old, and my student ID is " + studentId + ".");
    }
}