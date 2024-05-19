package collectionPrograms.Java8_Programs;
////without using lambda
//public interface Addition {
//    public void add(int a, int b);
//}
//
//class Add implements Addition{
//
//    @Override
//    public void add(int a, int b) {
//        System.out.println(a+b);
//    }
//}
//
//
//class Test1{
//    public static void main(String[] args) {
//        Addition a = new Add();
//        a.add(10,20);
//    }
//}


//using lambda

interface Addition{
    public void show(int a, int b);
}

class TestAdd{
    public static void main(String[] args) {
        Addition add =(a,b) -> System.out.println(a+b);
        add.show(10,20);
    }
}