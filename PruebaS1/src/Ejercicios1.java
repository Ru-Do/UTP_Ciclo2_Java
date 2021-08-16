import java.util.Scanner;

public class Ejercicios1 {
  public static void main(String[] args) {
    //Ejercicio para contar cifras de un numero entero
    Scanner sc = new Scanner(System.in);
    //System.out.println();
    System.out.println("Ingrese un numero entero");
    int num = sc.nextInt();
    int cifras = ncifras(num);
    System.out.println("el numero ingresado tiene " + cifras + " Cifras");

    //ejercicio para determinar si es par o impar
    System.out.println("Ingrese un numero entero");
    int n1 = sc.nextInt();
    sc.close();
    String mensaje1 = n1%2 == 0 ? n1 + " es par" : n1 + " no es par";
    System.out.println(mensaje1);

  }

  public static int ncifras(int numero){
    int cifra=0;
    do{
      numero = numero/10;
      cifra++;
      //System.out.println(num);
    }while(numero!=0);
    return cifra;
  }
}
