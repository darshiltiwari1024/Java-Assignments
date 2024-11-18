import java.util.Scanner;
public class Q_8_given_number {
    int num_given = 24;

    boolean check_divisibility(int num_given,int user_num){
        if (num_given % user_num == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args []){
        Scanner userInp = new Scanner(System.in);
        System.out.println("Enter a number  : ");
        int inp = userInp.nextInt();
        Q_8_given_number check = new Q_8_given_number();
        if (check.check_divisibility(check.num_given,inp)){
            System.out.println("It's divisible");
        }else{
            System.out.println("it's not divisible");
        }
    }

}
