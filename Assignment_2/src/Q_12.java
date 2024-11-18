
class Distance{
    int dis_miles = 1111;

    Distance(int dis_miles){
        this.dis_miles = dis_miles;

    }

    void travelTime(){
        System.out.println("Travel Time in hours :  " + dis_miles/60);
    }
}

class DistanceMKS extends Distance{

    int dis_km;


    DistanceMKS(int dis_km){
        super(dis_km*5/8);
        this.dis_km = dis_km;

    }

    @Override
    void travelTime() {
        System.out.println("Travel time in hours : " + dis_km/100f);

    }
}

public class Q_12 {
    public static void main(String[] args) {
        DistanceMKS mks = new DistanceMKS(240);
        mks.travelTime();
    }

}
