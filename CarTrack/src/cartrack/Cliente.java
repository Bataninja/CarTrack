package cartrack;
import java.util.ArrayList;

/**
 *  Clase para el objeto cliente
 */
public class Cliente {
    
    // Atributos base
    private int idCliente;
    private int cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    //Guarda las placas de los carros de los que este cliente es dueño
    private ArrayList<String> listaCarros;
    //Constructor
    public Cliente(int idCliente, int cedula, String nombre, String direccion, String telefono, String correo, ArrayList listaCarros) {
        this.idCliente = idCliente;
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.listaCarros = listaCarros;
    }

    public ArrayList<String> getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(ArrayList<String> listaCarros) {
        this.listaCarros = listaCarros;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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
