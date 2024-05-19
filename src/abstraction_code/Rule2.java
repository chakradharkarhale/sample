package abstraction_code;

//2) If we define any abstract method in a class, then that class must be abstract class.
abstract class Rule2 {

    abstract  void show();

}

class Test extends Rule2{

    @Override
    void show() {
        System.out.println("providing implementation");
    }
}
