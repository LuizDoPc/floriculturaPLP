package main;


import java.util.ArrayList;

public class Compra {
    private float valor;
    private Cliente cliente;
    private static ArrayList<Flor> flores;

    public Compra(float valor, Cliente cliente) {
        this.valor = valor;
        this.cliente = cliente;
    }

    public String exibirDados(){
        String dados = "Cliente: " + this.cliente.getNome() + "\nTotal: " + this.valor + "\n";
        int cont = 1;
        for(Flor flor : flores){
            dados += "Flor " + cont + ": " + flor.getNome() + "\n";
            cont ++;
        }
        return dados;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static ArrayList<Flor> getFlores() {
        return flores;
    }

    public static void setFlores(ArrayList<Flor> flores) {
        Compra.flores = flores;
    }
}
