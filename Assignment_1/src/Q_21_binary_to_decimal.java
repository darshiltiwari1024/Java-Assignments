public class Q_21_binary_to_decimal {
    int decimal;
    int binary;

    int[] int_to_arr(int n) {
        String temp = Integer.toString(n);
        int[] int_arr = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            int_arr[i] = Character.getNumericValue(temp.charAt(i));

        }
        return int_arr;
    }
    int binary_to_decimal(int n){

        int[] binary_array = int_to_arr(n);
        int dec = 0;
        for(int i = 0 ; i<binary_array.length; i++){
            dec += binary_array[binary_array.length - i -1]*(int) Math.pow(2,i);

        }return dec;
    }
    int decimal_to_binary(int n){
        int binary = 0;
        int i = 0;
        while(n != 0){
            int digit = n%2;
            n = n/2;
            binary = binary + digit*(int)Math.pow(10,i);
            i++;

        }return binary;
    }



    public static void main(String args[]) {
        Q_21_binary_to_decimal obj = new Q_21_binary_to_decimal();
        int[] result = obj.int_to_arr(122);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        //Enter numbers here for conversion
        System.out.println(obj.binary_to_decimal(1111011));
        System.out.println(obj.decimal_to_binary(15));
    }
}