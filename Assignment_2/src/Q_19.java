

public class Q_19 {
    int div(int a , int b) throws ArithmeticException{
        if(b == 0){

            throw new ArithmeticException();



        }else{
            return a/b;
        }

    }

    public static void main(String args[]){
        Q_19 obj = new Q_19();
        try {
            int result = obj.div(8, 0);
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Exception Detected");
        }
        finally{
            System.out.println("Program Finished ");

        }


    }
}
