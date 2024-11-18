public class Q_14_multiples_of_10 {
    int n;

    void multiples_10(int n1, int n2){
        for(int i = n1 ; i <= n2 ; i++){
            if(i%10 == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        Q_14_multiples_of_10 obj = new Q_14_multiples_of_10();
        obj.multiples_10(11,29);
    }
}
