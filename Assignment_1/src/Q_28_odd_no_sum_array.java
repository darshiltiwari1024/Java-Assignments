public class Q_28_odd_no_sum_array {
    int sum_odd(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6,7,9};
        Q_28_odd_no_sum_array obj = new Q_28_odd_no_sum_array();
        System.out.println("The sum of the odd numbers in array is : " + obj.sum_odd(arr));
    }
}
