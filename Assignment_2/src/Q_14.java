

import java.util.Scanner;

class Employee{

    Employee(int emp_id,String emp_name, int basic_salary){
        this.emp_id= emp_id;
        this.emp_name = emp_name;
        this.basic_salary = basic_salary;
    }
    int emp_id;
    String emp_name;
    int basic_salary;
    float gst = 0.18f; // assuming 18 percent gst on salary

    void getGrossSalary(){
        System.out.println("Gross Salary is : " + (basic_salary + basic_salary*gst));

    }
}

public class Q_14 {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Employee ID : ");
        int id = inp.nextInt();
        inp.nextLine(); //To consume the input buffer
        System.out.println("Enter Employee Name : ");
        String name = inp.nextLine();
        System.out.println("Enter Employee Salary : ");
        int salary = inp.nextInt();


        Employee emp = new Employee(id, name, salary);
        emp.getGrossSalary();

    }
}
