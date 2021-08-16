public class Arrays {
  public static void main(String[] args) {
    // arreglos, coleccion de variables del mismo tipo
    
    // declaracion de un array
    String nombres[];
    int[] numeros;

    //creacion
    nombres = new String[3];
    numeros = new int[5];

    //crear e inicializar el array
    int numPares[] = {2,4,6,8,10};
    nombres[0] = "Maria";
    nombres[1] = "Juan";
    nombres[2] = "Pedro";

    int impar = 1;
    for (int i = 0; i<=4; i++){
      numeros[i] = impar;
      impar+=2;
      System.out.println(numeros[i]);
      System.out.println(numPares[i]);
    }
    for (String i: nombres){
      System.out.println(i);
    }
    System.out.println();

    //arrays bidimensionales 
    String matriz1[][] = new String[3][3];
    String[][] matriz2 = new String[3][3];

    //arrays Irregulares
    int matriz3[][]= new int[3][];
    matriz3[0] = new int[5];
    matriz3[1] = new int[3];
    matriz3[2] = new int[2];
  }
}