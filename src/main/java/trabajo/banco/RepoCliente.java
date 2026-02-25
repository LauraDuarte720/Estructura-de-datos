package trabajo.banco;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RepoCliente {
    PriorityQueue<Cliente> colaClientes;

    public RepoCliente(){
        this.colaClientes = new PriorityQueue<>(Comparator.comparingInt(Cliente::getTurno));
    }

    public void agregarCliente(Cliente cliente){
        colaClientes.add(cliente);
    }

    public Cliente atenderCliente() throws Exception{
        if(colaClientes.isEmpty()){
            throw new RuntimeException("La cola esta vacia");
        }
        return colaClientes.poll();
    }

    public Cliente siguienteCliente(){
        return colaClientes.peek();
    }

    public int clientesFila(){
        return colaClientes.size();
    }

    public boolean filaVacia(){
        return colaClientes.isEmpty();
    }
}
