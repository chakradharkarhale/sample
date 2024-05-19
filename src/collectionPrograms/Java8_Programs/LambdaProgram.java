package collectionPrograms.Java8_Programs;

interface  interf{
    public void show();
}
public class LambdaProgram {
    public static void main(String[] args) {

        interf i = () -> System.out.println("hello by lambda expression");
        i.show();
    }



}
