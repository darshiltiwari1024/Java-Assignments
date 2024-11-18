public class Q_32_parametarized_constructor {

    int x ;
    int y ;
    Q_32_parametarized_constructor(int a , int b){
        this.x = a ;
        this.y = b;
        System.out.println("Parametarized object created !");
    }

    public static void main(String[] args) {
        Q_32_parametarized_constructor obj = new Q_32_parametarized_constructor(3,2);
        System.out.println(obj.x + obj.y);
    }
}
