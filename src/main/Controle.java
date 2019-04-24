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

    public static String exibirClientes(){
        String dados = "";
        for(Cliente c : clientes){
            dados += c.exibirDados() + "\n";
        }
        return dados;
    }
    public static String exibirFuncionarios(){
        String dados = "";
        for(Funcionario f : funcionarios){
            dados += f.exibirDados() + "\n";
        }
        return dados;
    }
    public static String exibirFornecedores(){
        String dados = "";
        for(Fornecedor f : fornecedores){
            dados += f.exibirDados() + "\n";
        }
        return dados;
    }
    public static String exibirFlores(){
        String dados = "";
        for(Flor f : flores){
            dados += f.exibirDados() + "\n";
        }
        return dados;
    }
    public static void exibirCompras(){
        //TODO
    }
}
