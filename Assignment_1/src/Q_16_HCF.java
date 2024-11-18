public class Q_16_HCF {
    int[] factors1 = new int[50];
    int a = 0;
    int[] factors2 = new int[50];
    int b = 0;
    int[] common_factors = new int[50];
    int c = 0;

    int find_HCF(int n, int m){
        for(int i = 1; i <= n ; i++){
            if(n%i == 0){
                factors1[a] = i;
                a++;
            }
        }for(int j =1 ; j<=m ; j++){
            if(m%j == 0){
                factors2[b] = j;
                b++;
            }
        }for(int i = 0 ; i < 10 ; i ++){
            for(int j = 0 ; j < 10 ; j++){

                if (factors1[i] == factors2[j] && factors1[i] != 0){
                        common_factors[c] = factors1[i];
                        c++;
                }
            }
        }
        int HCF = 1;
        for(int i=0; i <10 ; i++){
            if(common_factors[i]> HCF ){
                HCF = common_factors[i];
            }
        }return HCF;
    }
    public static void main(String args[]){
        Q_16_HCF obj = new Q_16_HCF();
        System.out.println(obj.find_HCF(12,36));
    }

}
