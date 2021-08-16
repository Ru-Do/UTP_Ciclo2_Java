package utp.misiontic2022.c2.p07.reto4.model.vo;

public class Requerimiento_1 {
    // Operaciones de la clase requerimiento 1 -- su código

    //Atributos
    private String fecha;
    private Integer idCompra;
    private String proveedor;
    private String pagado;

    // Constructores
    public Requerimiento_1(){

    }

    public Requerimiento_1(String fecha, Integer idCompra, String proveedor, String pagado){
      this.fecha = fecha;
      this.idCompra = idCompra;
      this.proveedor = proveedor;
      this.pagado = pagado;
    }
    //Getters and setters
    public String getFecha() {
      return fecha;
    }
    public void setFecha(String fecha) {
      this.fecha = fecha;
    }
    public Integer getIdCompra() {
      return idCompra;
    }
    public void setIdCompra(Integer idCompra) {
      this.idCompra = idCompra;
    }
    public String getProveedor() {
      return proveedor;
    }
    public void setProveedor(String proveedor) {
      this.proveedor = proveedor;
    }
    public String getPagado() {
      return pagado;
    }
    public void setPagado(String pagado) {
      this.pagado = pagado;
    }
    
    

}
