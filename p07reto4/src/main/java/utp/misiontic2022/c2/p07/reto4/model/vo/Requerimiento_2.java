package utp.misiontic2022.c2.p07.reto4.model.vo;

public class Requerimiento_2 {
  // Operaciones de la clase requerimiento 2 -- su código
  private String fecha;
  private String ciudad;
  private String constructora;
  private String nombreapellido;
  private Integer codigotipo;
  private Integer estratotipo;

  // Constructores
  public Requerimiento_2(){

  }

  public Requerimiento_2(String fecha, String ciudad, String constructora, 
  String nombreapellido, Integer codigotipo, Integer estratotipo){
    this.fecha = fecha;
    this.ciudad = ciudad;
    this.constructora = constructora;
    this.nombreapellido = nombreapellido;
    this.codigotipo = codigotipo;
    this.estratotipo = estratotipo;
  }

  // Getters and Setters 
  public String getFecha() {
    return fecha;
  }
  public void setFecha(String fecha) {
    this.fecha = fecha;
  }
  public String getCiudad() {
    return ciudad;
  }
  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }
  public String getConstructora() {
    return constructora;
  }
  public void setConstructora(String constructora) {
    this.constructora = constructora;
  }
  public String getNombreapellido() {
    return nombreapellido;
  }
  public void setNombreapellido(String nombreapellido) {
    this.nombreapellido = nombreapellido;
  }
  public Integer getCodigotipo() {
    return codigotipo;
  }
  public void setCodigotipo(Integer codigotipo) {
    this.codigotipo = codigotipo;
  }
  public Integer getEstratotipo() {
    return estratotipo;
  }
  public void setEstratotipo(Integer estratotipo) {
    this.estratotipo = estratotipo;
  }

  

}
