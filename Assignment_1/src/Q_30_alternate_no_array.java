public class Q_30_alternate_no_array {
    void alternate(int[] arr){

        for(int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }

        }
    }

    public static void main(String[] args) {
        Q_30_alternate_no_array obj = new Q_30_alternate_no_array();
        int[] arr = {1,2,4,5,6,3,4,5,6,8,43,44,32};
        obj.alternate(arr);
    }
}
