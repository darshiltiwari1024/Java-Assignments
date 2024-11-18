public class parametarized_constructor {
    int students;
    String course;
    String branch;

    parametarized_constructor(int students, String course,String branch){
        this.students = students;
        this.course = course;
        this.branch = branch;
    }
} class test{
    public static void main(String args[]){
        parametarized_constructor it = new parametarized_constructor(80,"BE","IT Engineering");
        parametarized_constructor cs = new parametarized_constructor(76,"BE","CS Engineering");
        parametarized_constructor civil = new parametarized_constructor(55,"BE", "Civil Engineering");

        System.out.println("Course : " + it.course + ", Branch : "+ it.branch+ ", Number of Students : "+ it.students);
        System.out.println("Course : " + cs.course + ", Branch : "+ cs.branch+ ", Number of Students : "+ cs.students);
        System.out.println("Course : " + civil.course + ", Branch : "+ civil.branch+ ", Number of Students : "+ civil.students);
    }
}
