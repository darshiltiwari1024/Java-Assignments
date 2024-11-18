import java.util.Arrays;

public class Q_29_duplicate_ele_array {

    int sum(int[] arr){
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            if(frequency[i]!= 0) {
                sum += arr[i] - 1;
            }

        }return sum;
    }

    int[] duplicate = new int[10];
    int[] frequency = new int[10];
    void duplicate(int[] arr){
        int k = 0;


        for(int i = 0; i < arr.length; i++){
            int counter = 0;
            for(int j = 0 ; j< arr.length; j++) {
                if (arr[j] == arr[i]) {
                    counter += 1;
                }

            }


            boolean alreadyAdded = false;
            for (int d = 0; d < k; d++) {
                if (duplicate[d] == arr[i]) {
                    alreadyAdded = true;
                    break;
                }
            }




            if(!alreadyAdded) {


                frequency[k] = counter;

                duplicate[k] = arr[i];
                k++;
            }

        }
    }

    public static void main(String[] args) {
        Q_29_duplicate_ele_array obj = new Q_29_duplicate_ele_array();
        int[] arr = {1,1,1,3,3,3,6,6,8,9,9,6,6,4,4};
        obj.duplicate(arr);
        int[] duplicate1 = obj.duplicate;
        int[] frequency1 = obj.frequency;

        System.out.println("Total duplicate elements in array : " + obj.sum(frequency1));
        System.out.println("Frequency of duplicate elements : ");
        for(int i= 0 ; i < duplicate1.length ; i++){
            System.out.println("Frequency of " + duplicate1[i] + " is : " + frequency1[i]);

        }
    }
}
