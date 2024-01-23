/**
 * A simple model of a person
 * @author CSC 142 - Keiffer
 *
 */
public class Person {
    //A person is defined by their name and age
    //any instance field MUST be declared
    //access modifier(public or private) + type(e.g. int) +
    //name(lower camel case) + ;
    //the variables are called instance fields
    private String name;
    private int age;

    /**
     * Creates a persson object given the name and age of the person
     *
     * @param n  the name of the person
     * @param a  the age of the person
     */
    public Person(String n, int a) {
        name = n;
        age = a;
    }

    /**
     * Prints thee name & age of the person
     */
    public void speak() {
        System.out.printf("My name is %S. I am %d years old.\n", name, age);
    }

}
