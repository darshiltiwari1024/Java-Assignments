public class Q_5_miles_to_km {
    float miles = 26;
    float km;

    float miles_to_km(float miles){
        km = miles*1.609f;
        return km;
    }

    public static void main(String args []){
        Q_5_miles_to_km convert = new Q_5_miles_to_km();
        System.out.println(convert.miles_to_km(convert.miles));
    }
}
