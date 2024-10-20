package elysium;

public abstract class Person {

    String name;  // Name of the person
    int age;      // Age of the person

    // Constructor to initialize the person's name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method that each subclass must implement to introduce themselves
    public abstract void introduce();
}
