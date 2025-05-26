package cartrack;
import java.util.ArrayList;

/**
 *  Clase para el objeto vehiculo con métodos básicos
 * 
 *  idDueño = 0 es para no asignar dueño al crearse el objeto, 
 *  al añadirse a la lista de vehiculos del cliente dueño
 *  se actualiza automaticamente en la clase Cliente.
 */


public class Vehiculo {

    private final String placa;
    private int idDueño;
    private String modelo;
    private String color;
    private String tipoVehiculo;
    private String estado;
    private String marca;
    private ArrayList<Servicio> listaServicios;
    
    public Vehiculo(String placa, String modelo, String color, String tipoVehiculo, String estado, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
        this.estado = estado;
        this.marca = marca;
        this.idDueño = 0;
        this.listaServicios = new ArrayList<>();
    }

    public ArrayList<Servicio> getListaServicios() {
        return listaServicios;
    }
    
    public void añadirServicio(Servicio nuevo) {
        listaServicios.add(nuevo);
        nuevo.setPlaca(placa);
    }
    
    public void añadirServicio(ArrayList<Servicio> listaServicios) {
        for(Servicio servicio : listaServicios){
            añadirServicio(servicio);
        }
    }
    
    public boolean eliminarServicio(int idServicio) {
        for(Servicio servicio : listaServicios){
            if (servicio.getIdServicio() == idServicio){
                listaServicios.remove(servicio);
                return true;
            }       
        }
        return false;
    }

    public void setListaServicios(ArrayList<Servicio> listaServicios) {
        this.listaServicios = listaServicios;
    }

    
    public String getPlaca() {
        return placa;
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
