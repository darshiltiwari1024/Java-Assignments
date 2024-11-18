import java.util.Scanner;

public class Q_20 {
    public static void main(String args[]){



        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the length of the generated array : ");
        int inp = obj.nextInt();
        try{
            int[] arr = new int[inp];

            System.out.println("Array generated");
        }
        catch(ArithmeticException e){
            System.out.println("Exception found!");
            System.out.println(e);

        }
        catch (NegativeArraySizeException e){
            System.out.println("Exception found!");
            System.out.println(e);
        }
    }
}
