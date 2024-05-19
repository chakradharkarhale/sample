package anonymousClass;

class Test{
    public  void show(){
        System.out.println("show method");
    }
}

class TestAnonymous extends Test{
    @Override
    public void show() {
        System.out.println("Override show method");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        TestAnonymous obj = new TestAnonymous();
        obj.show();
    }
}



