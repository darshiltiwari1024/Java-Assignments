class Company {
    int no_of_employee;
    int average_salary;
    String company_name;

    Company(int no_of_employee, int average_salary,String company_name){
        this.no_of_employee= no_of_employee;
        this.average_salary= average_salary;
        this.company_name = company_name;
    }
}
class Department extends Company {
    String department_name;
    int budget;
    int employee_in_department;

    Department(int no_of_employee, int average_salary,String company_name, String department_name,int budget, int employee_in_department){
        super(no_of_employee,  average_salary, company_name);
        this.department_name = department_name;
        this.budget = budget;
        this.employee_in_department = employee_in_department;

    }
}

public class inheritance {
    public static void main(String args[]){
        Department department_ai = new Department(4500,45000,"Nvidia","Generative AI",1000000,59);
        System.out.println(department_ai.employee_in_department);
        System.out.println(department_ai.no_of_employee);
        System.out.println(department_ai.average_salary);
        System.out.println(department_ai.company_name);
        System.out.println(department_ai.department_name);
        System.out.println(department_ai.budget);

    }

}
