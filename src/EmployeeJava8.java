import collectionPrograms.EmployeeCollection;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeJava8 {

    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;
    public EmployeeJava8(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getDepartment()
    {
        return department;
    }

    public int getYearOfJoining()
    {
        return yearOfJoining;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }
}


class TestEmployee123 {
    public static void main(String[] args) {
        ArrayList<EmployeeCollection> emplist = new ArrayList<EmployeeCollection>();

        emplist.add(new EmployeeCollection(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        emplist.add(new EmployeeCollection(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        emplist.add(new EmployeeCollection(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        emplist.add(new EmployeeCollection(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        emplist.add(new EmployeeCollection(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        emplist.add(new EmployeeCollection(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        emplist.add(new EmployeeCollection(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        emplist.add(new EmployeeCollection(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        emplist.add(new EmployeeCollection(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        emplist.add(new EmployeeCollection(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        emplist.add(new EmployeeCollection(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        emplist.add(new EmployeeCollection(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        emplist.add(new EmployeeCollection(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        emplist.add(new EmployeeCollection(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        emplist.add(new EmployeeCollection(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        emplist.add(new EmployeeCollection(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));

        emplist.add(new EmployeeCollection(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        //1)**********how many male and female employee in org*************

//        Map<String, Long> map = emplist.stream().collect(Collectors.groupingBy(e-> e.getGender(),Collectors.counting()));
//        System.out.println(map);


        //2)*************Print the name of all departments in the organization?*********

 //       emplist.stream().map(d->d.getDepartment()).distinct().forEach(System.out::println);


       //3) **************What is the average age of male and female employees?***********************


//      Map<String, Double> map=  emplist.stream().collect(Collectors.groupingBy(e->e.getGender(),Collectors.averagingInt(a->a.getAge())));
//
//        System.out.println(map);



        // **************Get the details of highest paid employee in the organization?*********************


       //**************** Get the names of all employees who have joined after 2015? ***************

        emplist.stream().filter(e->e.getYearOfJoining() > 2015).map(emp->emp.getName()).forEach(System.out::println);

    }
}

