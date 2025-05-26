package cartrack;

/**
    *  Clase para el objeto Seguro con métodos básicos
    * 
    *  idPLaca = "" es para no asignar el idplaca al crearse el objeto, 
    *  al añadirse a la lista de seguros del carro 
    *  se actualiza automaticamente en la clase.
*/

public class Seguro {
    private final int idSeguro;
    private String placa;
    private String tipoSeguro;
    private String fechaInicio;
    private String fechaVencimiento;

    public Seguro(int idSeguro, String tipoSeguro, String fechaInicio, String fechaVencimiento) {
        this.idSeguro = idSeguro;
        this.tipoSeguro = tipoSeguro;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.placa = "";
    }

    public int getIdSeguro() {
        return idSeguro;
    }

    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public String getFechaInicio() {
        return fechaInicio;
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
    
    
}
