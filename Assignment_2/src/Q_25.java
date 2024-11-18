import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "MyException";
    }
}
public class Q_25 {
    public static void main(String args[]){
        String givenpass = "abcd";
        String username;
        String password;

        Scanner obej = new Scanner(System.in);
        System.out.println("Enter username");
        username = obej.nextLine();
        System.out.println("Enter password");
        password = obej.nextLine();
try {
    if (username.length() < 6) {
        throw new MyException();
    }
    if (!password.equals(givenpass)) {
        throw new MyException();

    }
    System.out.println("Welcome");
}
catch(MyException e){
                System.out.println("Exception Found!");
                System.out.println(e);
            }
        }


    }

