package methodOveriding;
//9) A subclass in a different package can only override the non-final methods declared public or protected.

/*Create 2 package and 2 classes(create separate java files and both should be public classes)
-> parent class write 4 methods with 4 access modifiers
-> now try to override all these methods in child class*/

public class RuleNoNineOverride1 {

        void display(){
            System.out.print("this is parent class method");
        }
        public void display1(){
            System.out.print("this is parent class method");
        }
        private void display12(){
            System.out.print("this is parent class method");
        }
        protected void display123(){
            System.out.print("this is parent class method");
        }
    }


