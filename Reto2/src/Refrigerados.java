public class Refrigerados extends ProductosAlimentarios {
  private static final Integer TEMPERATURA = 10;
  private  Integer temperatura;

  //constructores

  public Refrigerados(){
    super();
    this.temperatura=TEMPERATURA;
  }

  // contructor precio y peso
  public Refrigerados(double precioBase, Integer peso){
    super(precioBase,peso);
    this.temperatura=TEMPERATURA;
  }

  // contructor todos parametros
  public Refrigerados(double precioBase, Integer peso, Integer temperatura){
    super(precioBase,peso);
    this.temperatura=temperatura;
  }

  //Metodo calcular precio

  public double calcularPrecio(){
    double precioFinal = 0.0;
    Integer vtemperatura = 0;

    vtemperatura = ((temperatura >= 5 && temperatura < 10) ? 20 : 
    (temperatura >= 10 && temperatura <= 15) ? 18 : 5);
    precioFinal=super.calcularPrecio() + vtemperatura;

    return precioFinal;

  }
}
