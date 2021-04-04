package fix;

public class Dog implements Pet {
//    private String name;

    public Dog() {
        System.out.println("fix.Dog bean is created");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public void init() {
        System.out.println("Class fix.Dog: init method");
    }

    public void destroy() {
        System.out.println("Class fix.Dog: destroy method");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
