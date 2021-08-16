//Reto 1 Java
public class Inversiones {
  private int vTiempo;
  private double vMonto;
  private double vInteres;

  //Contructor
  public Inversiones() {
    this.vTiempo = 0;
    this.vMonto = 0.0;
    this.vInteres = 0.0;
  }

  public double generarInteresSimple(){
    //System.out.println("IS = " +this.vMonto* this.vInteres * this.vTiempo);
    return (this.vMonto * this.vInteres * this.vTiempo);
  }
  
  public double generarInteresCompuesto(){
    //System.out.println("IC = " +this.vMonto* (Math.pow((1 +this.vInteres),
    //(this.vTiempo))-1));
    return this.vMonto* (Math.pow((1 +this.vInteres),(this.vTiempo))-1);
  }

  public String validarInversion (int vTiempo, double vMonto, double vInteres ){
    
    //double respuesta;
    this.vTiempo=vTiempo;
    this.vInteres=vInteres;
    this.vMonto=vMonto;
    //System.out.println(this.vInteres);

    /* Cálculo de la diferencia entre tipos de tasas */
    if ((generarInteresCompuesto( ) - generarInteresSimple( ))>0){
      return "La diferencia en el total de intereses generados para el proyecto,"
      +" si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo"
      +" a una tasa de interés Simple, asciende a la cifra de: $" 
      + (generarInteresCompuesto( ) - generarInteresSimple( ))+".";
    }else {
    return "Faltan datos para calcular la diferencia en el total de intereses"
    +" generados para el proyecto.";
    }
  }

  public static void main(String[] args) {
    Inversiones inversion = new Inversiones();
    System.out.println("Hola");
    
    System.out.println(inversion.validarInversion(12, 2000000, 0.05));
  }
}

