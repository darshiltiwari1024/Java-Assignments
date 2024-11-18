public class Q_1_Celsius_to_fahrenheit {
    //float temp_C;
    //float temp_F;

    float C_to_F(float temp_C){
        float temp_F = (9f/5f * temp_C) + 32;
        return temp_F;
    }
    float F_to_C(float temp_F){
        float temp_C = 5f/9f * (temp_F - 32);
        return temp_C;
    }

    public static void main(String args[]){
        Q_1_Celsius_to_fahrenheit temp_covt = new Q_1_Celsius_to_fahrenheit();
        System.out.println(temp_covt.C_to_F(0));
        System.out.println(temp_covt.F_to_C(0));
    }
}
