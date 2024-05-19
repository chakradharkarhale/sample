package objectCreation;


class UsingInstanceMethod {

    public String name;

    // Default or no-arg constructor
    UsingInstanceMethod() {
        name = "Ayush";
    }

    public static void main(String[] args) {
        try {
            // Load the required class
            Class c = Class.forName("ObjectCreate");

            // Create an instance of the class loaded using newInstance() method
            UsingInstanceMethod s = (UsingInstanceMethod) c.newInstance();
            System.out.println(s.name);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

