package constructor;

//Why we need Constructor?
//to initialize an object of a class and assign default values to properties of a class.

//When we don't write any constructor in class, then compiler will provide you 1 default constructor.


public class ConstructorUsage {

    private String name = "chakradhar";
    private int age = 26;
    private double salary;
    private boolean test;

    public static void main(String[] args) {
        ConstructorUsage usage = new ConstructorUsage();
        System.out.println("name is "+usage.name);   //   Java
        System.out.println("age is "+usage.age);    //   25
        System.out.println("salary is "+usage.salary); // 0.0
        System.out.println("test is "+usage.test);  // false
    }
}
