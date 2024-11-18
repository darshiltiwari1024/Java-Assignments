class Sum{
    static int getSum(int a , int b){
        return a+b;
    }
}

public class Q_16 {
    public static void main(String[] args) {
        // We can call a static method or variable without making an instance of the class
        System.out.println(Sum.getSum(2,3));
    }

}
