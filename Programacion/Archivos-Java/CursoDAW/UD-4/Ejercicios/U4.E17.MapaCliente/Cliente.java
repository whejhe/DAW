package es.tuespiral.u4.e17.mapacliente;

public class Cliente {
    private long idCliente;
    private String nombre, apellidos;

    public Cliente(long idCliente, String nombre, String apellidos) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + (int) (this.idCliente ^ (this.idCliente >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.idCliente != other.idCliente) {
            return false;
        }
        return true;
    }
    
    
}
