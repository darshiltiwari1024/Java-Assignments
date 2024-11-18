public class Q_15_multiplication_table {
    void table(int n){
        for(int i = 0; i <=10  ; i++){
            System.out.println(n*i);
        }
    }
    public static void main(String args[]){
        Q_15_multiplication_table obj = new Q_15_multiplication_table();
        obj.table(15);
    }

}
