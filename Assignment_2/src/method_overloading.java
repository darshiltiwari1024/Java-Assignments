public class method_overloading {
    int add(int num1, int num2) {
        return num1 + num2;

    }

    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;

    }
}
    class exe{
        public static void main(String args[]){
            method_overloading conv = new method_overloading();
            System.out.println("Sum of two numbers : "+ conv.add(2,3));
            System.out.println("Sum of three numbers : "+ conv.add(2,3,5));
        }
    }

