import java.util.Scanner;

class NegativeAge extends Exception{
    public String toString(){
        return "Negative Age not Permitted";
    }
}
public class Q_26 {
    public static void main(String args[]) {
        Scanner obej = new Scanner(System.in);

        System.out.println("Enter age : ");
        int age = obej.nextInt();
        obej.nextLine();

        System.out.println("Enter name : ");
        String name = obej.nextLine();


        try {
            if (age < 0) {
                throw new NegativeAge();
            }
            System.out.println("Your name : "+ name);
            System.out.println("Your age : "+ age);
        } catch (NegativeAge e) {
            System.out.println(e);
        }
    }
}
