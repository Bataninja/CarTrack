package cartrack;

/**
 *  Clase para el objeto Trabajador con métodos básicos
 */
public class Trabajador {
    private final int idTrabajador;
    private final String cedula;
    private String cargo;
    private String correo;
    private String telefono;
    private String fechaIngreso;
    private String estado;

    public Trabajador(int idTrabajador, String cedula, String cargo, String correo, String telefono, String fechaIngreso, String estado) {
        this.idTrabajador = idTrabajador;
        this.cedula = cedula;
        this.cargo = cargo;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
        this.estado = estado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
