public class constructor_overloading {
    int no_employees;
    String department;
    String company;

    constructor_overloading() {
        this.no_employees = 25;
        this.department = "Web Dev";
        this.company = "Infosys";
        System.out.println("Initialized with default values");
    }

    constructor_overloading(int no_employees) {
        this.no_employees = no_employees;
        this.department = "Web Dev";
        this.company = "Infosys";
        System.out.println("Initiated with default values for department and company");
    }

    constructor_overloading(int no_employees, String department) {
        this.no_employees = no_employees;
        this.department = department;
        this.company = "Infosys";
        System.out.println("Initiated with default values for company");

    }

    constructor_overloading(int no_employees, String department, String company) {
        this.no_employees = no_employees;
        this.department = department;
        this.company = company;
        System.out.println("Initiated with given values");
    }

} class testing{
    public static void main(String args[]){
    constructor_overloading test1 = new constructor_overloading();
    constructor_overloading test2 = new constructor_overloading(50);
    constructor_overloading test3 = new constructor_overloading(76,"AI");
    constructor_overloading test4 = new constructor_overloading(100,"Generative AI","OpenAI");

    System.out.println("Number of Employees  "+ test1.no_employees + ",  Department : "+ test1.department + ",  Company : " + test1.company);
    System.out.println("Number of Employees  "+ test2.no_employees + ",  Department : "+ test2.department + ",  Company : " + test2.company);
    System.out.println("Number of Employees  "+ test3.no_employees + ",  Department : "+ test3.department + ",  Company : " + test3.company);
    System.out.println("Number of Employees  "+ test4.no_employees + ",  Department : "+ test4.department + ",  Company : " + test4.company);


}}
