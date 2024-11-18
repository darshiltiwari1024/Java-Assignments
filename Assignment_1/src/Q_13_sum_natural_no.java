public class Q_13_sum_natural_no {

    int sum;
    int n = 1000;
    Q_13_sum_natural_no() {
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
    }
    public static void main(String args[]){
        Q_13_sum_natural_no obj = new Q_13_sum_natural_no();

        System.out.println("Total sum up to " + obj.n + " is : " + obj.sum);
    }
}
