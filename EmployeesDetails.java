import java.util.ArrayList;
import java.util.List;

public class EmployeesDetails {
    public static void main(String[] args) {
        List<Employees> list=new ArrayList<>();
        Employees emp1=new Employees(101,"Aryan gupta",65000.54);
        Employees emp2=new Employees(102,"Aditya srivastav",35000.68);
        Employees emp3=new Employees(103,"Priyesh singh",45000.82);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        for(Employees e: list){
           e.displayDetails();
            System.out.println("================================================");
            System.out.println();
        }

    }
}
class Employees{
    private int id;
    private String name;
    private double salary;

    public Employees(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public void displayDetails(){
        System.out.println("Employee id : "+id);
        System.out.println("Employee name : "+name);
        System.out.println("Employee Salary : "+salary);
    }
}
