public class Q_17_LCM {


        int i =1,j =1;
        int lcm;

        int LCM(int n1 , int n2){
            while(true){
            int n1_multiple = n1*i;
            int n2_multiple = n2*j;

            if(n1_multiple == n2_multiple){
                lcm = n1_multiple;
                break;
            }else if(n1_multiple < n2_multiple){
                i++;
            }else if(n1_multiple> n2_multiple){
                j++;
            }
        }
        return lcm;
    }

    public static void main(String[] args) {
        Q_17_LCM obj = new Q_17_LCM();
        System.out.println("LCM is : " + obj.LCM(3, 5)); // Example LCM(5, 55)
    }
}
