public class Q_23_patterns_b {
    public static void main(String args[]){
        for(int i = 0 ; i < 7 ; i++){
            for(int j = 0 ; j<7 ; j++){
                if(i == 0 && j == 3){
                    System.out.print("1");
                } else if (i==0 && j ==6) {
                    System.out.print(' ');
                    System.out.print('\n');
                } else{
                    System.out.print(" ");
                }


                if(i==1 && j ==2){

                    System.out.print("2");
                }else if(i == 1 && j ==3){
                    System.out.print("1");
                }else if(i == 1 && j ==4){
                    System.out.print("2");
                }else{
                    System.out.print(" ");
                }

            }
        }
    }
}
