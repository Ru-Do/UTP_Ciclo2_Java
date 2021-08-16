public class ProductosAlimentarios {
  
  // Valores fijos
  private static final double PRECIO_BASE = 80.0;
  private static final Integer PESO_BASE = 5;
  private static final char TIPO_ALIMENTO = 'N';

  private double precioBase;
  private Integer peso;
  private char tipoAlimento;

  //Constructor de la clase vacio
  public ProductosAlimentarios(){
    this.precioBase = PRECIO_BASE;
    this.peso = PESO_BASE;
    this.tipoAlimento = TIPO_ALIMENTO;
  }

  //Constructor de la clase con parametros precio y peso definidos
  public ProductosAlimentarios(double precioBase, Integer peso){
    this.precioBase = precioBase;
    this.peso = peso;
    this.tipoAlimento = TIPO_ALIMENTO;
  }

  //Constructor con todos los parametros definidos
  public ProductosAlimentarios(double precioBase, Integer peso, char tipoAlimento){
    this.precioBase = precioBase;
    this.peso = peso;
    // se utiliza el metodo para validar imediatamente el tipo de alimento
    comprobarTipoAlimento(tipoAlimento);
  }

  // Metodos de la clase 
  public void comprobarTipoAlimento(char tipoAlimento){
    this.tipoAlimento = (tipoAlimento == 'C') ? tipoAlimento : TIPO_ALIMENTO;
  }

  // Metodo calcular precio de la clase 
  public double calcularPrecio(){
    double precioFinal = 0.0;
    Integer vTipoAlimento = 0;
    Integer vPeso = 0;

    //definiendo el valor de cada uno
    vTipoAlimento = (tipoAlimento == 'N') ? 40 : 20;
    vPeso = ((peso >= 0 && peso <= 9) ? 6 : (peso > 9 && peso <= 16) ? 8 : 
    (peso > 16) ? 20 : 0);
    precioFinal = precioBase + vTipoAlimento + vPeso;

    return precioFinal;
  }
}
