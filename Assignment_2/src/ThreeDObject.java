import java.util.Scanner;
public class ThreeDObject {

    float wholeSurfaceArea(){
        return 0f;

    }
    float Volume(){
        return 0f;
    }
}class Box extends ThreeDObject{
    //parameter of box
    float l;
    float w;
    float h;
    Box(float l , float w, float h){
        this.l = l;
        this.w = w;
        this.h = h;

    }
    float wholeSurfaceArea() {
        float area = 2*(l*h + h*w + w*l);
        return area;
    }
    float Volume(){
        return l*h*w;
    }
    }

class Cylinder extends ThreeDObject{
    //parameter of cylinder
    float r;
    float h;
    final float PI = 3.1416f;
    Cylinder(float r , float h){
        this.r = r;
        this.h = h;
    }
    float wholeSurfaceArea() {
        float area = 2*PI*r*(r + h);
        return area;

    }
    float Volume(){
        return PI*r*r*h;
    }
    }

class Cube extends ThreeDObject{
    //parameter of cube
    float a;
    Cube(float a){
        this.a = a;
    }

    float wholeSurfaceArea(){
        return 6*a*a;

    }
    float Volume(){
        return a*a*a;
    }
}
class Cone extends ThreeDObject{
    //parameter of cone
    float r;
    float l;
    float h;
    final float PI = 3.1416f;

    Cone(float r, float l, float h){
        this.r = r;
        this.l = l;
        this.h = h;
    }
    float wholeSurfaceArea(){

        return PI*r*(r+l);


    }
    float Volume(){
        return (1f/3f)*h*PI*r*r;
    }
}
class Main_test{
    public static void main(String args[]){

        System.out.println("What do you want to calculate : Enter a number : \n1) Box \n2)Cylinder\n3Cube \n4)Cone");
        Scanner inp = new Scanner(System.in);
        int input = inp.nextInt();

        if (input == 1){
            System.out.println("Give dimensions : length,width, height \n");
            float length = inp.nextFloat();
            float width = inp.nextFloat();
            float height = inp.nextFloat();

            Box box = new Box(length,width,height);
            System.out.println("Surface area of box : "+ box.wholeSurfaceArea());
            System.out.println("Volume of box : "+ box.Volume());

        }else if (input ==2){
            System.out.println("Give dimensions : radius, height \n");
            float radius = inp.nextFloat();

            float height = inp.nextFloat();

            Cylinder cylinder = new Cylinder(radius,height);
            System.out.println("Surface area of cylinder : "+ cylinder.wholeSurfaceArea());
            System.out.println("Volume of cylinder : "+ cylinder.Volume());


        }else if (input == 3){
            System.out.println("Give dimensions : length \n");
            float length = inp.nextFloat();



            Cube cube = new Cube(length);
            System.out.println("Surface area of cube : "+ cube.wholeSurfaceArea());
            System.out.println("Volume of cube : "+ cube.Volume());


        }else if(input == 4){
            System.out.println("Give dimensions : radius,slanted length, height \n");
            float radius = inp.nextFloat();
            float slength = inp.nextFloat();

            float height = inp.nextFloat();

            Cone cone = new Cone(radius,slength,height);
            System.out.println("Surface area of cone : "+ cone.wholeSurfaceArea());
            System.out.println("Volume of cone : "+ cone.Volume());


        }else{
            System.out.println("Invalid Input");
        }



    }
}
