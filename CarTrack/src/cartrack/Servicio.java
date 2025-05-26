package cartrack;

public class Servicio {
    
    /**
    *  Clase para el objeto servicio con métodos básicos
    * 
    *  placa = "" es para no asignar la placa al crearse el objeto, 
    *  al añadirse a la lista de servicios del vehiculo 
    *  se actualiza automaticamente en la clase Servicio.
    * 
    *  Se debe indicar el ID del trabajador para validacion futura
    */

    private final int idServicio;
    private final int idTrabajador;
    private String placa;
    private String fechaInicio;
    private String fechaVencimiento;
    private String descripcion;
    private TipoServicio tipoServicio;
    private double valor;

    public Servicio(int idServicio, int idTrabajador, String fechaInicio, String fechaVencimiento, String descripcion, TipoServicio tipoServicio, double valor) {
        this.idServicio = idServicio;
        this.idTrabajador = idTrabajador;
        this.placa = "";
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.descripcion = descripcion;
        this.tipoServicio = tipoServicio;
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    
    
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
