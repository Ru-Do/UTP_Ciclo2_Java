import java.util.Scanner;

public class entradas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Nombre:");
    String nom = sc.nextLine();
    sc.close();

    System.out.println("Hola " + nom);
  }
}
