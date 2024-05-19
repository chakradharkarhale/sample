package copyConstructor;
// Step 1: Create a class Number.
public class Number
{
    // Step 2: Declare instance variables a and b with data type int.
    int a = 10;
    int b = 20;

    // Step 3: Declare a default constructor.
    public Number()
    {

    }
    // Step 8: Declare a copy constructor.
    public Number(Number n)
    {
        a = n.a;
        b = n.b;
    }
    public static void main(String[] args)
    {
        // Step 4: Create an object of the class Number and print the value by calling variable a and b using reference variable.
        // We cannot directly call non-static member in the static region.
        Number n = new Number();

        System.out.println("Value of a: " +n.a);
        System.out.println("Value of b: " +n.b);

        // Step 5: Now we are updating values of a and b in the existing object i.e existing memory location.
        n.a = 50;
        n.b = 40;
        System.out.println("Updating values of a and b in the existing object");
        System.out.println("Value of a: " +n.a); // 30
        System.out.println("Value of b: " +n.b); // 40

        // Step 6: But when we create a new object, we will not get updated values of a and b in the new object.
        // Take a look.
        Number n2 = new Number();
        System.out.println("Not getting updated values of a and b in the new object");
        System.out.println("Value of a: " +n2.a); // 10 // Getting initial data.
        System.out.println("Value of b: " +n2.b); // 20 // Getting initial data.

        // Step 7: To get the updated values of a and b, create another new object and pass the reference variable n of an existing object.
        Number n3 = new Number(n); // It will call a copy constructor defined in the class.
        System.out.println("Getting updated values of a and b in the new object");
        System.out.println("Value of a: " +n3.a); // 50. Now we are getting updated values of a and b.
        System.out.println("Value of b: " +n3.b); // 40
    }
}