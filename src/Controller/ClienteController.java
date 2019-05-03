package Controller;

import Model.Cliente;

public class ClienteController  {
    public static Cliente cadastrar(String nome,String cpf,String contato){
        return new Cliente(nome,cpf,contato);
    }

}
