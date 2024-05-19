package collectionPrograms.Java8_Programs.StreamMethodProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private int age;

   private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

 class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("raj", 26, 20000),
                new Person("jay", 25, 30000),
                new Person("suraj", 22, 40000)
        );

        // Using map to get the names of each person
        List<String> names = people.stream().map(s->s.getName()).collect(Collectors.toList());
        // Printing the names of the people
        System.out.println("Names: " + names);



        // get name and age of people
        Map<String , Integer> names1 = people.stream().collect(Collectors.toMap(n->n.getName(),a->a.getAge()));
        System.out.println(names1);





    }
}
