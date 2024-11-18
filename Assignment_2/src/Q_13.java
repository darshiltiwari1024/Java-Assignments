class Animals{


    void Eat(){
        System.out.println("Eating");
    }
    void Sleep(){
        System.out.println("Sleeping");
    }

}
class Dog extends Animals{
    void Bark(){
        System.out.println("Barking");
    }
}
class Puppy extends Dog{
    void Play(){
        System.out.println("Playing");
    }
}
public class Q_13 {
    public static void main(String[] args) {
        Puppy pup = new Puppy();
        pup.Play();
        pup.Bark();
        pup.Eat();
        pup.Sleep();
    }
}
