//import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    //System.out.println("Hello, World!");
    //var sc = new Scanner(System.in);
    System.out.println("Hello World");
    //var nombre = sc.nextLine();
    //System.out.println("Hola " + nombre + "!");
    TrianguloAbs triangulo1 = new TrianguloAbs(3, 4, 5);
    CirculoAbs circulo1 = new CirculoAbs(0, 5);
    System.out.println(triangulo1.area());
    System.out.println(circulo1.area());
  }
}
