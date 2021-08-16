public class PrecioTotal {
  // Atributos
  private double tProductosAlimentarios;
  private double tBebidas;
  private double tRefrigerados;
  private ProductosAlimentarios listaProductosAlimentarios[];

  // Contructores
  public PrecioTotal(){
    this.tBebidas = 0.0;
    this.tProductosAlimentarios = 0.0;
    this.tRefrigerados = 0.0;
    }
  public PrecioTotal(ProductosAlimentarios listaProductosAlimentarios[]){
    this.tBebidas = 0.0;
    this.tProductosAlimentarios = 0.0;
    this.tRefrigerados = 0.0;
    this.listaProductosAlimentarios = listaProductosAlimentarios;
    }
  // Metodo mostrar Total
  public void mostrarTotal(){
    for (ProductosAlimentarios alimento : listaProductosAlimentarios){
      if (alimento instanceof ProductosAlimentarios){
        tProductosAlimentarios += alimento.calcularPrecio();
      }
      if (alimento instanceof Bebidas){
        tBebidas += alimento.calcularPrecio();
      }
      if (alimento instanceof Refrigerados){
        tRefrigerados += alimento.calcularPrecio();
      }
    }
  // Codigo calculo de total
  System.out.println("El precio total de los Productos Alimentarios es de " 
  + tProductosAlimentarios);
  System.out.println("La suma del precio de las Bebidas es de " + tBebidas);
  System.out.println("La suma del precio de los Refrigerados es de " +
  tRefrigerados);
  }
}

