public class Q_7_grade {
    static String grade ;
    static int percentage = 70;

    public static void main(String args []) {
        if (percentage >= 90) {
            grade = "A";

        } else if (percentage >= 80) {
            grade = "B";

        } else if (percentage >= 70) {
            grade = "C";

        } else if (percentage >= 60) {
            grade = "D";

        } else if (percentage >= 50) {
            grade = "E";

        } else if (percentage >= 0) {
            grade = "F";
        } else {
            System.out.println("Invalid Percentage ");
        }
        System.out.println("The grade for percentage " + percentage + " is : " + grade);
    }

    }

