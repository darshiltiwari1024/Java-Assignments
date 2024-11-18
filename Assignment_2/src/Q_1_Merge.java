public class Q_1_Merge {


    int[] arr1 = { 1,4,5,8,13,17,22,27};
    int[] arr2 = { 123,334,541,880,1332,1746,2220,2788};

    int[] arr3 = new int[arr1.length + arr2.length];

    void merge() {
        int i = 0;
        int j = 0;
        int k = 0;



        while (i < arr1.length && j < arr2.length) {



                if (arr1[i] <= arr2[j]) {

                    arr3[k] = arr1[i];
                    i++;
                    k++;

                } else if (arr1[i] > arr2[j]) {

                    arr3[k] = arr2[j];
                    k++;
                    j++;
                }

        }
        while(i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j< arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        }



    public static void main(String[] args) {
        Q_1_Merge obj = new Q_1_Merge();
        obj.merge();
        for (int i = 0 ; i< obj.arr3.length ; i ++) {
            System.out.println(obj.arr3[i]);
        }
    }


}
