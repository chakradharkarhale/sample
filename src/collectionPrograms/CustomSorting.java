package collectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomSorting implements Comparable<CustomSorting>{
    String firstName;
    String lastName;
    double salary;
    int age;

    public CustomSorting(String firstName, String lastName, double salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CustomSorting{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(CustomSorting o) {
        return this.getLastName().compareTo(o.getLastName());
    }


}

class TestList{
    public static void main(String[] args) {
        List<CustomSorting> list = new ArrayList<>();
        CustomSorting obj1 = new CustomSorting("Vinayak", "Sawant", 1000000, 24);
        CustomSorting obj2 = new CustomSorting("Baswaraj", "Chavale", 120000, 25);
        CustomSorting obj3 = new CustomSorting("Pradeep", "Mahadik", 105000, 25);
        CustomSorting obj4 = new CustomSorting("Anant", "Dahiwade", 1100000, 24);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);

        Collections.sort(list);
        for (CustomSorting cs : list){
            System.out.println(cs);
        }

    }
}
























