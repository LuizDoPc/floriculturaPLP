package main;

import java.util.ArrayList;


public class Controle {
    private static ArrayList<Cliente> clientes = new ArrayList();
    private static ArrayList<Funcionario> funcionarios = new ArrayList();
    private static ArrayList<Fornecedor> fornecedores = new ArrayList();
    private static ArrayList<Flor> flores = new ArrayList();


    public static void cadastrarCliente(Cliente c){
        clientes.add(c);
     }
    public static void cadastrarFuncionario(Funcionario f){
        funcionarios.add(f);
    }
    public static void cadastrarFornecedor(Fornecedor f){
        fornecedores.add(f);
    }
    public static void cadastrarFlor(Flor f){
        flores.add(f);
    }

    public static void cadastraCompra(Compra c){
        //TODO
    }

    public static void exibirClientes(){
        String dados = "";
        for(Cliente c : clientes){
            dados +=
        }
    }
    public static void exibirFuncionarios(){

    }
    public static void exibirFornecedores(){

    }
    public static void exibirFlores(){

    }
    public static void exibirCompras(){
        //TODO
    }
}
