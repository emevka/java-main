package en.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {

    hello("Earth");
    hello("Me");


    Square s = new Square(5);
    System.out.println("Powierzchnia kwadratu o boku "+ s.l + " to " + s.squareArea());

    Rectangle f = new Rectangle(5,7);
    System.out.println("Powierzchnia prostokata o bokach "+ f.a + " i " + f.b + " to " + f.squareArea());

    Point p = new Point(5,4,6,7);
    System.out.println("Odleglosc to " + p.distance());



  }

  public static void hello(String boom) {
    System.out.println("hi"+boom);
  }

}


