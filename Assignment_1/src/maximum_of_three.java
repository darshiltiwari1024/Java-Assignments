public class maximum_of_three {
    int num1 = -484;
    int num2 = -3384;
    int num3 = -498;

    int max_of_three(int num1,int num2,int num3){
        int max;
        if(num1>=num2){
            max = num1;
            if(max<=num3){
                max = num3;
            }
            }

        else{
            max = num2;
            if(max<=num3){
                max = num3;
            }
        }return max;
    }
    public static void main(String args[]) {
        maximum_of_three check = new maximum_of_three();
        System.out.println(check.max_of_three(check.num1,check.num2,check.num3));
    }
}
