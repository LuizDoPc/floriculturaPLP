package Model;


public class Funcionario extends Pessoa{

    private String cargo;
    private String email;
    private String senha;

    public Funcionario(String nome, String cpf, String contato, String cargo, String email, String senha) {
        super(nome, cpf, contato);
        this.cargo = cargo;
        this.email = email;
        this.senha = senha;
    }


    @Override
    public String exibirDados(){
        String dados = super.exibirDados();
        dados += "Cargo: " + this.cargo + "\nEmail: "+ this.email+"\n";
        return dados;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
