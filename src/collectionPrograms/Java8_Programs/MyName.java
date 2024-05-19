package collectionPrograms.Java8_Programs;
/*
public interface MyName {
    public void sayMyName();
}

 class LambdaExpressionExample {
     public static void main(String[] args) {

         MyName name = new MyName() {
             @Override
             public void sayMyName() {
                 System.out.println("chakradhar");
             }
         };
         name.sayMyName();

     }
 }
*/
 // by using lambda

public interface MyName {
    public void sayMyName();
}

class LambdaExpression1{
    public static void main(String[] args) {

        MyName name = () -> System.out.println("chakradhar karhale");
        name.sayMyName();
    }
}

