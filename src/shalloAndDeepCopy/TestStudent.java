package shalloAndDeepCopy;

public class TestStudent{
    public static void main(String[] args) throws CloneNotSupportedException{
        Student obj = new Student();
        obj.RollNo=1;

       Address address = new Address();
       address.AddressId=9;
       obj.address=address;

        Student obj2= (Student) obj.clone();
        obj2.RollNo=5; // obj and obj2 chya value same yetat bcoz obj2 ha obj cha reference copy krat ahe.
        obj2.address.AddressId=39;

        System.out.println(obj.RollNo);
        System.out.println(obj2.RollNo);

        System.out.println("--------------------------------------------");


        System.out.println(obj.address.AddressId);
        System.out.println(obj2.address.AddressId);
    }
}
