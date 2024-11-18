class Num{
    int Num = 1111;

    Num(int Num){
        this.Num = Num;

    }

    void showNum(){
        System.out.println("Num : " + Num);
           }
}

class HexNum extends Num{


    HexNum(int Num){
        super(Num);

    }

    @Override
    void showNum() {
        System.out.println("Hexadecimal value : " + Integer.toHexString(Num));
        System.out.println("Octal value : " + Integer.toOctalString(Num));
    }
}

public class Q_11 {
    public static void main(String[] args) {
        HexNum obj = new HexNum(485995);
        obj.showNum();
    }
}
