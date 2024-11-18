public class Q_11_reverse_num {
    int num = 12345678;   //Enter a number to be reversed
    int length = 8;  //Enter the length of the number

    int reverse(int num){
        int reversed = 0;
        int[] arr = new int[length];
        for(int i = 0; i< length ; i++){
            int digit = num%10;
            num = num/10;
            arr[length-i-1] = digit;
        }for(int i = 0 ; i < length ; i ++){

            reversed += arr[i]*Math.pow(10,i);
        }return reversed;
    }public static void main(String args []){
        Q_11_reverse_num convt = new Q_11_reverse_num();
        System.out.println("Reverse is : "+ convt.reverse(convt.num));
    }

}
