public class Q_20_prime {
    int n;



    boolean isPrime(int n){
        boolean prime = true;

        for(int i = 2; i < n ; i++ ){
            if(n%i == 0){
                prime = false;
                break;

            }else{
                prime = true;

            }
        }
        return prime;
    }
    public static void main(String args[]){
        Q_20_prime obj = new Q_20_prime();
        System.out.println(obj.isPrime(1596));
    }
}
