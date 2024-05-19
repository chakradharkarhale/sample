package encapsulation_Program;

public class Test {

    //variable
    //local vs instance variable
    private int atmPin = 1234;


    private int age;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAtmPin() {
        return atmPin;
    }

    public void setAtmPin(int atmPin) {
        this.atmPin = atmPin;
    }
    //security
    // public String name = "Java";

    //


}

class TestEncapsulation {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.setAtmPin(4567);
        System.out.println(obj.getAtmPin());   //
        //System.out.println(obj.atmPin);     //





      /*  TestEncapsulation obj = new TestEncapsulation();
        obj.setAtmPin(5678);
        int tempAtmPin = obj.getAtmPin();
        System.out.println(tempAtmPin);
      */
        //System.out.println(obj.name);
    }
}
