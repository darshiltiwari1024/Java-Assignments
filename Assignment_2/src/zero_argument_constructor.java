public class zero_argument_constructor {
    int student_no = 80;
    String course = "B.E.";
    String branch = "IT";

    zero_argument_constructor(){
        System.out.println("Class initialized");
    }
}class tested{
    public static void main(String args []){
        zero_argument_constructor tester = new zero_argument_constructor();
        System.out.println(tester.course + " , " + tester.student_no+" , " +tester.branch);
    }
}
