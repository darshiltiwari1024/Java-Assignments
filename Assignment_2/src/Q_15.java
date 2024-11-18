public class Q_15 {
    int n;
    Q_15(int n){
        System.out.println("Object Created ");
        this.n = n;
    }
    void getNumber(){
        System.out.println("Here is your number : " + n);
    }

    public static void main(String[] args) {
        Q_15 obj = new Q_15(44);
        obj.getNumber();
    }
}
