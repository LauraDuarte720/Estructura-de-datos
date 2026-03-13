package preparcial.sistemaTareas;

import java.util.Date;

public class Tarea implements Comparable<Tarea>{

    private String descripcion;
    private int prioridad;
    private Date fechaVencimiento;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "{" +
                "descripcion='" + descripcion + '\'' +
                ", prioridad=" + prioridad +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }

    @Override
    public int compareTo(Tarea o) {
        return fechaVencimiento.compareTo(o.getFechaVencimiento());
    }


}
