package cartrack;
import java.util.ArrayList;

/**
 *  Clase para el objeto cliente con métodos básicos
 */
public class Cliente {
    
    private final int idCliente;
    private int cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private ArrayList<Vehiculo> listaVehiculos;
    
    public Cliente(int idCliente, int cedula, String nombre, String direccion, String telefono, String correo, ArrayList listaCarros) {
        this.idCliente = idCliente;
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        listaVehiculos = new ArrayList<>();
    }

    public ArrayList<Vehiculo> getListaCarros() {
        return listaVehiculos;
    }
    
    public void setListaCarros(ArrayList<Vehiculo> listaCarros) {
        this.listaVehiculos = listaCarros;
    }
    
    public void añadirVehiculo(Vehiculo nuevo) {
        listaVehiculos.add(nuevo);
        nuevo.setIdDueño(cedula);
    }
    
    public void añadirVehiculo(ArrayList<Vehiculo> listaVehiculos) {
        for(Vehiculo vehiculo : listaVehiculos){
            añadirVehiculo(vehiculo);
            vehiculo.setIdDueño(cedula);
        }
    }
    
    public boolean eliminarVehiculoCliente(String placa) {
        for(Vehiculo vehiculo : listaVehiculos){
            if (vehiculo.getPlaca().equalsIgnoreCase(nombre)){
                listaVehiculos.remove(vehiculo);
                return true;
            }       
        }
        return false;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}
