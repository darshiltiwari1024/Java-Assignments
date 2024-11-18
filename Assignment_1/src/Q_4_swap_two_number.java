public class Q_4_swap_two_number {
    int num1 = 3;
    int num2 = 4;
    int[] arr = new int[2];

    {
        arr[0] = num1;
        arr[1] = num2;
    }
    void swap(int[] arr){

        int temp;
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;





    }
    public static void main(String args[]){
        Q_4_swap_two_number converter = new Q_4_swap_two_number();
        System.out.println("Original numbers : "+ converter.arr[0]+", "+ converter.arr[1] );
        converter.swap(converter.arr);

        System.out.println("New numbers  : " + converter.arr[0] +" , " + converter.arr[1]);
        //System.out.println("New numbers : "+ converter.swap(arr[0],arr[1])[0]+ converter.swap(arr[0],arr[1])[1]);
    }
}
