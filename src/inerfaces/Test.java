package inerfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Person person = new Person();
        person.showname();
        animal.showname();
        person.showAge();
        animal.showAge();
        person.showHeight();
        animal.showHeight();
    }
}
