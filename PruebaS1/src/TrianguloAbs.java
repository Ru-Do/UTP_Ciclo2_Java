public class TrianguloAbs extends FiguraAbs{
  private int base;
  private int altura;
  
  //Constructor
  public TrianguloAbs(int numlados, int base, int altura) {
    super(numlados);
    this.base = base;
    this.altura = altura;
  }
  @Override
  public float area(){
    return (this.base*this.altura)/2;
  }
}
