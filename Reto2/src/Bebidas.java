public class Bebidas extends ProductosAlimentarios {
  private static final char LUGAR_ORIGEN = 'N';
  private char lugarOrigen;
  
  //contructor vacio
  public Bebidas(){
    super();
    this.lugarOrigen=LUGAR_ORIGEN;
  }

  // contructor con precio base y peso
  public Bebidas(double precioBase, Integer peso){
    super(precioBase, peso);
    this.lugarOrigen=LUGAR_ORIGEN;
  }

  // contructor todos los parametros
  public Bebidas(double precioBase, Integer peso, char lugarOrigen){
    super(precioBase, peso);
    comprobarLugarOrigen(lugarOrigen);
  }

  //Metodo para saber origen
  public void comprobarLugarOrigen(char lugarOrigen){
    this.lugarOrigen = (lugarOrigen == 'I') ? lugarOrigen : LUGAR_ORIGEN;
  }

  //Metodo precio final
  public double calcularPrecio(){
    double precioFinal = 0.0;
    Integer vLugarOrigen = 0;

    vLugarOrigen = (lugarOrigen == 'I') ? 15 : 5;
    precioFinal = super.calcularPrecio() + vLugarOrigen;

    return precioFinal;
  }
}