package objectCreation;


class UsingCloneMethod implements Cloneable {
    int number;

    public UsingCloneMethod(int number) {
        this.number = number;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

 class ExampleClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Creating a new instance of MyClass using clone() method
        UsingCloneMethod obj1 = new UsingCloneMethod(30);
        UsingCloneMethod obj2 = (UsingCloneMethod) obj1.clone();
        System.out.println("Number: " + obj2.number); // Output: Number: 30
    }
}

