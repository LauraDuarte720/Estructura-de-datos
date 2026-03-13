package generics.camion;

public class Paquete implements Comparable<Paquete>{

    private String contenido;
    private double peso;

    public Paquete(String contenido, double peso) {
        this.contenido = contenido;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }


    @Override
    public String toString() {
        return "Paquete{" +
                "contenido='" + contenido + '\'' +
                '}';
    }

    @Override
    public int compareTo(Paquete otro) {
        return Double.compare(this.peso, otro.getPeso());
    }
}
