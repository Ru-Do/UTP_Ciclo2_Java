import java.util.Scanner;

public class condicionales {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Color de su tarjeta");
    String color = sc.nextLine();
    sc.close();
    /* con if
    if (color.equals("rojo")||color.equals("Rojo")) {
      System.out.println("Paso denegado");
    } else if (color.equals("amarillo")){
      System.out.println("Paso parcial");
    } else if (color.equals("verde")){
      System.out.println("Paso permitido");
    } else {
      System.out.println("color fuera de rango");
    }
    */

    // con switch case 
    switch(color){
      case "rojo":
      System.out.println("Denegado");
      break;
      case "amarillo":
      System.out.println("Parcial");
      break;
      case "verde":
      System.out.println("Permitido");
      break;
      default:
      System.out.println("error");
      break;
    }
  }
}
