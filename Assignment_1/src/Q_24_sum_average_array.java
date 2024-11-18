public class Q_24_sum_average_array {

    int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

        }return sum;
    }

    float average(int[] arr){
        return sum(arr)/ (float)arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        Q_24_sum_average_array obj = new Q_24_sum_average_array();
        System.out.println("The sum of the array is : "+obj.sum(arr));
        System.out.println("The average  of the array is : "+obj.average(arr));

    }
}
