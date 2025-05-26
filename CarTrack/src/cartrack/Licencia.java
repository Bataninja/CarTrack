package cartrack;

/**
    *  Clase para el objeto Licencia con métodos básicos
    * 
    *  idCliente = 0 es para no asignar el id cleinte al crearse el objeto, 
    *  al añadirse a la lista de licencias del cliente 
    *  se actualiza automaticamente en la clase Cliente.
*/

public class Licencia {
    
    private final int idLicencia;
    private int idCliente;
    private String fechaExpedicion;
    private String fechaVencimiento;
    private String ciudad;
    private String categoria;

    public Licencia(int idLicencia, String fechaExpedicion, String fechaVencimiento, String ciudad, String categoria) {
        this.idLicencia = idLicencia;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVencimiento = fechaVencimiento;
        this.ciudad = ciudad;
        this.categoria = categoria;
        this.idCliente = 0;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdLicencia() {
        return idLicencia;
    }

    
    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(String fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    
}
