package String_Programs_Using_Methods;

public class HashCodeMethod {

        public static void main(String[] args) {

            String s22="java";
            String s33 = new String("java");

            boolean t=s22==s33;

            System.out.println(t);


            System.out.println(s22.hashCode());
            System.out.println(s33.hashCode());

           System.out.println(s33.equals(s22));

            StringBuilder sb1= new StringBuilder("Java");
            StringBuilder sb2 = new StringBuilder("Java");

              boolean t1= sb1== sb2;
              boolean t2= sb2.equals(sb1);
              System.out.println(t1);
              System.out.println(t2);
        }
    }


