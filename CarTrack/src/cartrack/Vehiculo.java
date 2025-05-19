package cartrack;

/**
 *  Clase para el objeto vehiculo con métodos básicos
 */
public class Vehiculo {

    // Atributos base
    private String placa;
    private int idDueño;
    private String modelo;
    private String color;
    private String tipoVehiculo;
    private String estado;
    private String marca;
    
    public Vehiculo(String placa, int idDueño, String modelo, String color, String tipoVehiculo, String estado, String marca) {
        this.placa = placa;
        this.idDueño = idDueño;
        this.modelo = modelo;
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
        this.estado = estado;
        this.marca = marca;
    }
    
    public Vehiculo(String placa, int idDueño) {
        this.placa = placa;
        this.idDueño = 0;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getIdDueño() {
        return idDueño;
    }

    public void setIdDueño(int idDueño) {
        this.idDueño = idDueño;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
