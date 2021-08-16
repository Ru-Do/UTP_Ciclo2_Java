public class Gato implements Felino, Mascota{
  
  @Override
  public void cazar(){
    System.out.println("Cazando");
  }

  @Override
  public void jugar(){
    System.out.println("Jugando");
  }
}
