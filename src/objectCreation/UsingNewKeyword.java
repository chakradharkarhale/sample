package objectCreation;

public class UsingNewKeyword {
    int number;
    public UsingNewKeyword(int number) {
        this.number = number;
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating a new instance of MyClass using the new keyword
        UsingNewKeyword obj = new UsingNewKeyword(10);
        System.out.println("Number: " + obj.number); // Output: Number: 10
    }
}
