package abstraction_code;

// 1) It is not mandatory to have abstract method in abstract class.
abstract class Rule1 {

    abstract void show();

    void display(){
        System.out.println("non abstract method");
    }

}
