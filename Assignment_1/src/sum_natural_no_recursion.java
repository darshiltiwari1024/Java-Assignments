public class sum_natural_no_recursion {


    int Sum(int n){
        if(n== 0){
            return 0;
        }else{
            return n + Sum(n-1);
        }
    }
    public static void main(String args[]){
        sum_natural_no_recursion obj = new sum_natural_no_recursion();
        System.out.println(obj.Sum(100));
    }
}
