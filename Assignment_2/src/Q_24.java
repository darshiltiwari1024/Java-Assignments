import java.util.Scanner;

class TooOlder extends Exception{
    public String toString(){
        return "TooOlder";
    }
}
class TooYounger extends Exception {
    public String toString() {
        return "TooYounger";
    }
}
public class Q_24 {
    public static void main(String args[]) {
        String name;
        int age ;

        Scanner obej = new Scanner(System.in);
        System.out.println("Enter candidate name : ");
        name = obej.nextLine();
        System.out.println("Enter candidate age : ");
        age = obej.nextInt();


        if (age > 45) {
            try {
                throw new TooOlder();
            } catch (TooOlder e) {
                System.out.println("Exception found!");
                System.out.println(e);
            }
        } else if (age < 20) {
            try {
                throw new TooYounger();
            } catch (TooYounger e) {
                System.out.println("Exception found!");
                System.out.println(e);
            }
        } else {
            System.out.println("Eligible");
            System.out.println("Name of the candidate : " + name);       }
    }
}
