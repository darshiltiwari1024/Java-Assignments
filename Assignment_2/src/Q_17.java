public class Q_17 {
    int n;

    int consecutiveSum(int n){
        int sum = 0;
        while(n > 9){
            int last_two_digit = n%100;

            n = n/10;
            sum = sum + last_two_digit;
        }
    return sum;
}

    public static void main(String[] args) {
        Q_17 obj = new Q_17();
        System.out.println("Consecutive sum : " + obj.consecutiveSum(2415));
    }
}
