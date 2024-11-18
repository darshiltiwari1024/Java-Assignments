import java.util.Scanner;

class Commission{

    float sales;


    Commission(float sale){
        this.sales = sale;
        System.out.println("Object of class Commission created");
    }

    float commission(){
        //Assuming 10 percent commission
        float com = 0.1f;
        return com*sales;
    }
}

public class Q_33_Demo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your sales : ");
        float sale = inp.nextFloat();

        if(sale >=0 ){
            Commission obj = new Commission(sale);
            System.out.println("The total commission on your sales is : " + obj.commission());
        }else{
            System.out.println("Invalid Input");
        }

    }

}
