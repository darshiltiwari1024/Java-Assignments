public class Q_2_Positive_or_negative {
    boolean isPositive(int given) {
        boolean is_positive;
        if (given >= 0) {
            is_positive = true;
        } else {
            is_positive = false;
        }
        return is_positive;

    }public static void main(String args []){
        Q_2_Positive_or_negative check = new Q_2_Positive_or_negative();
        if(check.isPositive(-75)){
            System.out.println("It is a positive number ");
        }else{
            System.out.println("It is a negative number");
        }

    }
}
