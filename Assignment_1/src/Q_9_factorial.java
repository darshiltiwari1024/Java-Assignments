public class Q_9_factorial {
    int num = 12;

    int fact(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fact(num - 1);
    }
public static void main(String args[]){
        Q_9_factorial check = new Q_9_factorial();
        System.out.println("Factorial : "+check.fact(check.num));
}

}
