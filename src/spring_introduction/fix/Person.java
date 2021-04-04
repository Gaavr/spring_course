package fix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Pet pet;
    private String surname;
    private int age;

//    public Person() {
//        System.out.println("fix.Person bean is created");
//    }

    @Autowired
    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class fix.Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class fix.Person: Set age");
        this.age = age;
    }

    //pet -> setPet
    @Autowired 
    public void setPet(Pet pet) {
        System.out.println("Class fix.Person: set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely fix.Pet!");
        pet.say();
    }
}
