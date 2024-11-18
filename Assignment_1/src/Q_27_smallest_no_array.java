public class Q_27_smallest_no_array {
    int smallest(int[] arr){
        int small = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<small){
                small = arr[i];
            }

        }return small;
    }

    public static void main(String[] args) {
        Q_27_smallest_no_array obj = new Q_27_smallest_no_array();
        int[] arr = {3847,-67,-242,1,2,4,5,6,7};
        System.out.println(obj.smallest(arr));
    }
}
