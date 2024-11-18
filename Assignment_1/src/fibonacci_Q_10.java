public class fibonacci_Q_10 {

    int n = 46;
    int fibonacci(int n){
        if(n == 0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String args[]){
        fibonacci_Q_10 find_fib = new fibonacci_Q_10();
        System.out.println("The fibonacci of " + find_fib.n + " is : " + find_fib.fibonacci(find_fib.n));
    }
}
