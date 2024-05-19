package collectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparator implements Comparable<EmployeeComparator>
{
    private String FirstName;
    private String LastName;
    private int id;
    private double salary;

    public EmployeeComparator(String firstName, String lastName, int id, double salary) {
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
    public int compareTo(EmployeeComparator o) {
        return this.FirstName.compareTo(o.FirstName);


    }
}

class FirstNameComparator implements Comparator<EmployeeComparator>{

    @Override
    public int compare(EmployeeComparator o1, EmployeeComparator o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}

class LastNameComparator implements Comparator<EmployeeComparator>{

    @Override
    public int compare(EmployeeComparator o1, EmployeeComparator o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}

class IdComparator implements Comparator<EmployeeComparator>{

    @Override
    public int compare(EmployeeComparator o1, EmployeeComparator o2) {
        return o1.getId()-o2.getId();
    }
}



class  ComparatorExample{

    public static void main(String[] args) {
        List<EmployeeComparator> list = new ArrayList<>();

        list.add(new EmployeeComparator("chakradhar","karhale",1001,97000));
        list.add(new EmployeeComparator("shahaji","jadhav",1098,90000));
        list.add(new EmployeeComparator("shyam","panchal",934,100000));
        list.add(new EmployeeComparator("abhijeet","bhosale",8838,12000));

        //Collections.sort(list);
        System.out.println("after soring by FirstName");

        FirstNameComparator firstNameComparator = new FirstNameComparator();
        Collections.sort(list, firstNameComparator);

        for(EmployeeComparator o:list){
            System.out.println(o);
        }


        System.out.println("after soring by LastName");


        LastNameComparator lastNameComparator = new LastNameComparator();
        Collections.sort(list,lastNameComparator);

        for(EmployeeComparator o :list){
            System.out.println(o);
        }
    }

}
