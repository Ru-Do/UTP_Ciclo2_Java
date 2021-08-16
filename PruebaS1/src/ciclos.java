public class ciclos {
  public static void main(String[] args) {
    //ciclo for
    //for(inicio; condicion; iteracion){}
    for(int i = 10; i <=100; i+=2){
      System.out.println(i);
    }
    for(int j = 100; j >=0; j--){
      System.out.println(j);
    }

    // ciclo While
    // while(condicion){}
    int cont=0;
    while (cont <= 20){
      System.out.println(cont);
      cont++;
    }
    //do while
    //do{} while(condicion)
    cont=30;
    System.out.println();
    do{
      System.out.println(cont);
      cont++;
    }while (cont<=20);

  }
}
