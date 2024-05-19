package collectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparable implements Comparable<EmployeeComparable>
{
    private String FirstName;
    private String LastName;
   private int id;
   private double salary;

    public EmployeeComparable(String firstName, String lastName, int id, double salary) {
        FirstName = firstName;
        LastName = lastName;
        this.id = id;
        this.salary = salary;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double isSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeComparable{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(EmployeeComparable o) {
        return this.FirstName.compareTo(o.FirstName);

    }
}

class TestEmployee{

    public static void main(String[] args) {
        List<EmployeeComparable> list = new ArrayList<>();

        list.add(new EmployeeComparable("chakradhar","karhale",1001,97000));
        list.add(new EmployeeComparable("shahaji","jadhav",1098,90000));
        list.add(new EmployeeComparable("shyam","panchal",934,100000));
        list.add(new EmployeeComparable("abhijeet","bhosale",8838,12000));

        Collections.sort(list);

        for(EmployeeComparable o:list){
            System.out.println("after soring"+o);
        }
    }

}
