public class Q_18 {
    int n;

    int count_digit(int n){
        int t = 0;
        while(n>0){
            n = n/10;
            t++;
        }return t;
    }
    public static void main(String args[]){
        Q_18 obj = new Q_18();
        System.out.println(obj.count_digit(2));
    }
}
