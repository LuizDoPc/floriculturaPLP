package Model;

public class Cliente extends Pessoa {

    public Cliente(String nome, String cpf, String contato) {
        super(nome, cpf, contato);
    }
    
    @Override
    public String exibirDados(){
        String dados = super.exibirDados();
        return dados;
    }
}
