public class operadores {
  public static void main(String[] args) {
    //operadores
    // aritmeticos +, -, /, *
    int n1=9;
    int n2=10;
    float res;
    res=(float)n1/(float)n2;
    n1++;
    System.out.println(n1);
    System.out.println(res);
    
    // operadores relacionales  < > <= >= == !=
    boolean res2;
    res2 = n1 > n2;
    System.out.println(res2);

    // operadores logicos and: && or:|| not: !

    //operador ternario IFTTT
    // expresion1 ? expresion2: expresion3
    String mensaje = n1 == n2 ? "son iguales" : "no son iguales";
    System.out.println(mensaje); 
  }
}
