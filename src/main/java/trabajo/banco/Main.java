package trabajo.banco;

public class Main {

    public static void main(String[] args) {

        RepoCliente repo = new RepoCliente();

        // Crear clientes (turno menor = mayor prioridad)
        repo.agregarCliente(new Cliente("123","Laura", 3));
        repo.agregarCliente(new Cliente("456","Carlos", 1));
        repo.agregarCliente(new Cliente("789","Ana", 2));

        System.out.println("Clientes en fila: " + repo.clientesFila());

        // Ver siguiente cliente sin atender
        System.out.println("Siguiente cliente: " + repo.siguienteCliente());

        System.out.println("\n--- Atendiendo clientes ---");

        try {
            while (!repo.filaVacia()) {
                Cliente atendido = repo.atenderCliente();
                System.out.println("Atendido: " + atendido);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fila vacía: " + repo.filaVacia());
    }
}
