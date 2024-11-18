import java.util.Arrays;

public class Q_22_median {
    //Set of elements to be entered for finding median
    int[] set = {1,2,3,4,5,6,10,11,13,15,19,20};

    float median(int[] num){
        Arrays.sort(num);
        float med;

        //Odd numbers of elements in set
        if(num.length%2 != 0){
             med = num[((num.length+1)/2) -1];


        }//Even number of elements in set
        else{
            med = ((float) num[(num.length)/2-1] + (float) num[num.length/2])/2;
        }
        return med;
    }
    public static void main(String args[]){
        Q_22_median obj = new Q_22_median();
        System.out.println(obj.median(obj.set));
    }
}
