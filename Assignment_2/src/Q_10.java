
class Vehicle{
    protected int regnNumber = 1111;
    protected int speed = 20;
    protected String color = "Blue";
    protected String ownerName = "Ramesh";

    Vehicle(int regnNumber, int speed, String color, String ownerName ){
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    void showData(){
        System.out.println("This is a vehicle class ");
        System.out.println("Registration No : "+ regnNumber);
        System.out.println("Speed : "+ speed);
        System.out.println("Color : "+ color);
        System.out.println("Owner Name : "+ ownerName);
    }
}

class Bus extends Vehicle{
    int routeNumber = 2;

    Bus(int routeNumber,int regnNumber, int speed, String color, String ownerName){
        super(regnNumber,speed,color,ownerName);
        this.routeNumber = routeNumber;

    }

    @Override
    void showData() {
        super.showData();
        //System.out.println("This is a Bus class");
        System.out.println("Route Number : " + routeNumber);
    }
}
class Car extends Vehicle{
    String manufacturerName = "Tata";

    Car(String manufacturerName,int regnNumber, int speed, String color, String ownerName){

        super(regnNumber,speed,color,ownerName);
        this.manufacturerName = manufacturerName;

    }

    @Override
    void showData() {
        super.showData();
        //System.out.println("This is a Car class");
        System.out.println("Manufacture Name : " + manufacturerName);
    }
}
public class Q_10 {
    public static void main(String[] args) {
        Bus bus = new Bus(2,12345,45,"Blue","Lakshya Travels");
        bus.showData();
        Car car = new Car("Tata",67672,80,"White","Ramesh");
        car.showData();
    }

}
