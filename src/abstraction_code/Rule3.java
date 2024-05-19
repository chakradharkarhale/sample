package abstraction_code;

// 3) We can not create an object of abstract class.
abstract class Rule3 {
    abstract void movie();

}

class School{
    void display2(){
        System.out.println("rule3");
    }
}

abstract class Animal{

    //Rule3 obj = new Rule3();

    School obj1 = new School();


}