import java.util.Scanner;
public class Q_12_application_processing {
    int maths;
    int physics;
    int chemistry;
    int total;

    Q_12_application_processing(int maths,int physics,int chemistry){
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
        this.total = maths + physics + chemistry;
    }
    boolean process(){
        if(maths >= 60 && physics >= 50 && chemistry >= 40 && total >= 200){
            return true;
        }else if( (maths + physics) >= 150){
            return true;
        }else{
            return false;
        }
    }
}
 class exect{
    public static void main(String args[]){
        int inPhysics;
        int inChemistry;
        int inMaths;


        Scanner Userinp = new Scanner(System.in);
        System.out.println("Enter Physics Marks");
        inPhysics = Userinp.nextInt();
        System.out.println("Enter Chemistry Marks");
        inChemistry = Userinp.nextInt();
        System.out.println("Enter Mathematics marks");
        inMaths = Userinp.nextInt();



        Q_12_application_processing obj = new Q_12_application_processing(inMaths,inPhysics,inChemistry);

        if (obj.process()){
            System.out.println("Congratulations, you are selected ");
        }else{
            System.out.println("Sorry, you are not selected");
        }





    }
}
