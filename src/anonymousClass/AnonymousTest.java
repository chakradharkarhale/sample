package anonymousClass;
class Test1{
    public void display(){
        System.out.println("display method of class Test1");
    }
}

 public class AnonymousTest{
    public static void main(String[] args) {
        Test1 obj = new Test1()
        {
            @Override
            public void display() {
                System.out.println("override display method");
            }
        };
        obj.display();

    }
}