package javaAssignment;

import java.util.ArrayList;

public class Employee{
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;
    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
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
class TestEmployee1 {
    public static void main(String[] args) {
        ArrayList<Employee> emplist = new ArrayList<Employee>();

        emplist.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        emplist.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        emplist.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        emplist.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        emplist.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        emplist.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        emplist.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        emplist.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        emplist.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        emplist.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        emplist.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        emplist.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        emplist.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        emplist.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        emplist.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        emplist.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        emplist.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        //**************How many male and female employee are there in organization  ********************
//        int maleCount =0;
//        int femaleCount=0;
//
//        for(Employee emp : emplist){
//            if (emp.getGender()=="Male"){
//                maleCount++;
//            } else if (emp.getGender()=="Female") {
//                femaleCount++;
//            }
//        }
//        System.out.println("count of male employee: "+maleCount);
//        System.out.println("count of female employee: "+femaleCount);
//
//
//    //***************Print the name of all departments in organization****************************

//        for(Employee emp : emplist){
//            System.out.println(emp.getDepartment());
//        }
//
        //*************what is average age of male and female employee********************************

        int sum1=0;
        int sum2=0;
        int maleCount =0;
        int femaleCount=0;
        for(Employee emp :emplist){
            if (emp.getGender()=="Male"){
                sum1=sum1+emp.getAge();
                maleCount++;
            } else if (emp.getGender()=="Female") {
                sum2=sum2+emp.getAge();
                femaleCount++;
            }


        }
        double averagem = sum1/maleCount;
        double averagef = sum2/femaleCount;
        System.out.println("male average: "+averagem +" female average: "+averagef);




        //*****************get the name of employee who has joined after 2015********************
//        for (Employee emp: emplist){
//
//            if(emp.yearOfJoining > 2015){
//                System.out.println(emp.getName() + " "+ emp.yearOfJoining);
//
//            }
//        }


    }

}



