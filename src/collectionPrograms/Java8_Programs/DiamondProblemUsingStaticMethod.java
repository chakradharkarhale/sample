package collectionPrograms.Java8_Programs;



interface InterfaceA {
    static void sayHello() {
        System.out.println("Hello from InterfaceA");
    }
}

interface InterfaceB {
    static void sayHello() {
        System.out.println("Hello from InterfaceB");
    }
}
public class DiamondProblemUsingStaticMethod implements InterfaceA, InterfaceB {
    // No need to provide implementation for sayHello()
    // as it's resolved by static methods
    public static void main(String[] args) {
        InterfaceA.sayHello(); // Output: Hello from InterfaceA
    }
}
