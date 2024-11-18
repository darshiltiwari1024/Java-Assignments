
interface A{
    int sum();
    int difference();
}
interface B{
    int product();
    int division();
}
interface C{
    int modulo();
    int power();
}
interface D extends A,B,C{
    void displayNum();
}
class Number{
    int a,b;
    Number(int a ,int b){
        this.a = a;
        this.b = b;
    }
}
class Calculator extends Number implements A,B,C,D{

    public void useA(A obj){
        System.out.println("Sum : "+ obj.sum());
        System.out.println("Difference : "+ obj.difference());
    }

    public void useB(B obj){
        System.out.println("Product : "+ obj.product());
        System.out.println("Division : "+ obj.division());
    }

    public void useC(C obj){
        System.out.println("Modulo : "+ obj.modulo());
        System.out.println("Power : "+ obj.power());
    }

    public void useD(D obj){
        System.out.println("Display Numbers : ") ;
        obj.displayNum();

    }

    Calculator(int a , int b ){
        super(a,b);
    }

    public int sum(){
        return a+b;
    }
    public int difference(){
        return a-b;
    }


    public int product(){
        return a*b;
    }
    public int division() {
        return a/b;
    }



    public int modulo(){
        return a%b;
    }
    public int power(){
        return (int)Math.pow(a,b);
    }
    public void displayNum(){
        System.out.println("First Number : "  + a);
        System.out.println("Second Number : "  + b);
    }

}

public class Q_18 {
    public static void main(String[] args) {
        Calculator calc = new Calculator(5,10);

        calc.useA(calc);
        calc.useB(calc);
        calc.useC(calc);
        calc.useD(calc);

        /*
        System.out.println("Sum : "+calc.sum());
        System.out.println("Difference : "+calc.difference());
        System.out.println("Product : "+calc.product());
        System.out.println("Division : "+calc.division());
        System.out.println("Modulo : "+calc.modulo());
        System.out.println("Power : "+calc.power());
        System.out.println("Display Number : ");
    calc.displayNum();
        System.out.println("Operation Finished");
    */}
}
