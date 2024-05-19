package constructor;

public class Constructor_Types {

    public Constructor_Types(){
        System.out.println("This is default constructor");
    }

    public Constructor_Types(String name, int age){
        System.out.println("This is parameterized constructor "+name + " and age is "+age);
    }


    public static void main(String[] args) {
        Constructor_Types obj = new Constructor_Types(); //will call default constructor

        Constructor_Types objjj = new Constructor_Types("Java", 100); //will call parameterized constructor


    }
}

