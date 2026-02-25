package collections.clientes;

public class Cliente implements Comparable<Cliente>{

    private String cedula;
    private String nombre;
    private int edad;

    public Cliente(String cedula, String nombre, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Cliente o) {
        return o.edad - this.edad;
    }
}
