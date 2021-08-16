public class CirculoAbs extends FiguraAbs {
  private int radio;
  public static final float PI = 3.1414f;

  public CirculoAbs(int numlados, int radio) {
    super(numlados);
    this.radio = radio;
  }

  @Override
  public float area(){
    return (PI*this.radio*this.radio);
  }
}
