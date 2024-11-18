public class Q_19_palindrome {
    int count_digit(int n){
        int t = 0;
        while(n>0){
            n = n/10;
            t++;
        }return t;
    }
    int reverse_num(int n){
        int digit;
        int reverse = 0;
        int c = count_digit(n);
        for(int i = 0 ; i < c; i++){
            digit = n%10;
            n = n/10;

            reverse = reverse +digit*(int)(Math.pow(10,c-i-1));


        }return reverse;

    }
    boolean isPalindrome(int n){
        if(reverse_num(n) == n){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Q_19_palindrome obj = new Q_19_palindrome();
        System.out.println(obj.isPalindrome(1234321));

    }
}
