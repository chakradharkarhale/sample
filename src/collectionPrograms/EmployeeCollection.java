package collectionPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeCollection {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;
    public EmployeeCollection(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
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

class EmployeeSalary implements Comparator<EmployeeCollection>{

    @Override
    public int compare(EmployeeCollection o1, EmployeeCollection o2) {
        return (int) (o1.getSalary()- o2.getSalary());
    }
}

class Department implements Comparator<EmployeeCollection>{

    @Override
    public int compare(EmployeeCollection o1, EmployeeCollection o2) {
        return o1.getDepartment().compareTo(o2.getDepartment());
    }
}

class AgeEmployee implements Comparator<EmployeeCollection> {

    @Override
    public int compare(EmployeeCollection o1, EmployeeCollection o2) {
        return o1.getAge()- o2.getAge();
    }
}
class year implements Comparator<EmployeeCollection> {

    @Override
    public int compare(EmployeeCollection o1, EmployeeCollection o2) {
        return o1.getYearOfJoining()- o2.getYearOfJoining();
    }
}

class TestEmployee12 {
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





// ******************Print the count of employees in each department

//        Collections.sort(emplist, new Department());
//       Map<String, Integer> map = new HashMap<>();
//       for (EmployeeCollection emp : emplist) {
//           String dept = emp.getDepartment();
//           map.put(dept, map.getOrDefault(dept, 0) +1);
//        }
//for (Map.Entry<String, Integer> entry : map.entrySet()) {
//           System.out.println("Department: " + entry.getKey() + ", Employee count: " + entry.getValue());
//       }

        // ************** get the details of youngest male employee in the product development department***************

        //    Collections.sort(emplist, new AgeEmployee());

//        for(EmployeeCollection emp : emplist){
//            if((emp.getGender()=="Male") && (emp.getDepartment()=="Product Development"))
//            {
//                //Collections.sort(emplist, new AgeEmployee());
//                System.out.println(emp);
//            }
//            }
//         // *********** Q.Who has the most working experience in the organization?*********

//        Collections.sort(emplist, new year());
////        for(EmployeeCollection emp : emplist) {
////            System.out.println(emp);
////        }
//        System.out.println(emplist.getFirst());



//   //**********Query 3.10 : How many male and female employees are there in the sales and marketing team?********
//        int Femalecount = 0;
//        int malecount = 0;
//        for (EmployeeCollection emp : emplist)
//        {
//            if ((emp.getGender() == "Female") && (emp.getDepartment() == "Sales And Marketing")) {
//                Femalecount++;
//            } else if ((emp.getGender() == "Male") && (emp.getDepartment() == "Sales And Marketing")) {
//                malecount++;
//            }
//        }
//        System.out.println(Femalecount+" female count ");
//        System.out.println(malecount+" male count ");


       //************** List down the names of all employees in each department?*****************

       //*********** What is the average salary and total salary of the whole organization?**************
//        double sum=0;
//        int count=0;
//        for(EmployeeCollection emp :emplist)
//        {
//            count++;
//            sum=sum+emp.getSalary();
//        }
//        double averag = sum/count;
//        System.out.println(" average salary " +averag+" total salary "+sum);


////***********Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.**************
//        for(EmployeeCollection emp :emplist)
//        {
//            //Employees younger than or equal to 25 years :
//            if(emp.getAge()<=25)
//            {
//                System.out.println("Employees younger than or equal to 25 years :"+emp.getName() +" "+emp.getAge());
//
//            }
//            else {
//                //Employees older than 25 years :
//                System.out.println("Employees older than 25 years :"+emp.getName()+" "+emp.getAge());
//            }
//        }
//
////************** : Who is the oldest employee in the organization? What is his age and which department he belongs to?*******************
//        Collections.sort(emplist, new AgeEmployee());
//
//        for(EmployeeCollection emp : emplist)
//        {
//            System.out.println(emp.getAge());
//        }
//
//        System.out.println(emplist.getLast());
//

        Optional<EmployeeCollection> sanviPandey = emplist.stream()
                .filter(employee -> employee.getName().equals("Sanvi Pandey"))
                .findFirst();
        if (sanviPandey.isPresent()) {
            EmployeeCollection sanvi = sanviPandey.get();
            System.out.println("Sanvi Pandey found! ID: " + sanvi.getId());
        } else {
            System.out.println("Sanvi Pandey not found in the list.");


        }


    }
}

