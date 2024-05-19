package constructor;

//What is Constructor?
//Constructor is a special type of method which is used to initialize an object of a class.


public class FirstConstructorProgram {

    //Constructor does no return type
    //class name and Constructor name must be same.
    //we don't need to call constructors, they will get called as soon as we create an object of a class.
    public FirstConstructorProgram(){
        System.out.println("This is constructor in java");
    }

    public void test(){  //method
        System.out.println("this is method in java");
    }

    //method must have return type
    //it is not mandatory to create methods with the same name of class

    //why we need methods?  -> typically for writing logic or code
    public int FirstConstructorProgram(){  // method
        System.out.println("This is method in java");
        return 1;
    }

    public static void main(String[] args) {
        // Reference type           =   Object type
        //Up casting and down casting

        FirstConstructorProgram obj = new FirstConstructorProgram();
        //we don't need to call constructor they will get called as soon as we create an object of a class
        // obj.test();
    }
}
