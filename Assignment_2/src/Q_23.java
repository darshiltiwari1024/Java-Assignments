
class TooHot extends Exception{
    public String toString(){
        return "TooHot";
    }
}
class TooCold extends Exception {
    public String toString() {
        return "TooCold";
    }
}
public class Q_23 {
    public static void main(String args[]) {
        int temp = 40;
        if (temp > 35) {
            try {
                throw new TooHot();
            } catch (TooHot e) {
                System.out.println("Exception found!");
                System.out.println(e);
            }
        } else if (temp < 5) {
            try {
                throw new TooCold();
            } catch (TooCold e) {
                System.out.println("Exception found!");
                System.out.println(e);
            }
        } else {
            System.out.println("Normal");
            double f = ((9.0 / 5)*temp) + 32;
            System.out.println("Temperature in fahrenheit : " + f);
        }
    }
}