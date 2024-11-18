public class Q_6_leap_year {
    int year = 2016;

    boolean leap_year(int year){


        boolean b;
        if (year % 2 == 0) {
            b = true;
        } else {
            b = false;
        }
        return b;
    }

    public static void main(String args[]) {
        Q_6_leap_year check = new Q_6_leap_year();
        if(check.leap_year(check.year)){
            System.out.println("It's a leap year");
        }else{
            System.out.println("It's not a leap year");
        }

    }
}