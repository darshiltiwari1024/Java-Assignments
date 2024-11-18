import java.util.Scanner;

class NoMatchFoundException extends Exception{
    public String toString(){
        return "NoMatchFoundException";
    }
}
public class Q_21 {
    String[] country = {"India", "USA", "China"};
    String[] capital = {"Delhi","Washington DC", "Beijing"};

  public static void main(String args[]){
      Q_21 obej = new Q_21();
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter the country");
      String inp = obj.nextLine();
      boolean found = false;
      for(int i = 0 ; i < 3 ; i++) {
          if(inp.equals(obej.country[i])){
              System.out.println("Capital is : " + obej.capital[i]);
              found = true;
              break;
          }


      } if(!found){
          try {
              throw new NoMatchFoundException();
          }
          catch(NoMatchFoundException e){
              System.out.println("Exception found !");
              System.out.println(e);
          }

      }

  }
}

