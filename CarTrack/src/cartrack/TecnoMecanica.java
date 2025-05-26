package cartrack;

/**
    *  Clase para el objeto TecnoMecanica con métodos básicos
    * 
    *  idPLaca = "" es para no asignar el idplaca al crearse el objeto, 
    *  al añadirse a la lista de tecnomecanicas del carro 
    *  se actualiza automaticamente en la clase.
*/

public class TecnoMecanica {
    private final int idTecno;
    private String placa;
    private String tipoSeguro;
    private String fechaInicio;
    private String fechaVencimiento;

    public TecnoMecanica(int idTecno, String tipoSeguro, String fechaInicio, String fechaVencimiento) {
        this.idTecno = idTecno;
        this.tipoSeguro = tipoSeguro;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.placa = "";
    }

    public int getIdTecno() {
        return idTecno;
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
