package elysium;

// Class Teacher that extends Person
class Teacher extends Person {

    String subject;  // Subject that the teacher specializes in

    // Constructor to initialize the teacher's name, age, and subject
    public Teacher(String name, int age, String subject) {
        super(name, age);  // Call the constructor of the superclass Person
        this.subject = subject;  // Initialize the subject taught by the teacher
    }

    // Implementation of the abstract introduce method
    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + name + ". I'm " + age + " years old, and I teach " + subject + ".");
    }
}