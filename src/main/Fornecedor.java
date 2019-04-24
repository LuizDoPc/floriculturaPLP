package main;

public class Fornecedor {

    private String cnpj;
    private String nome;


    public Fornecedor(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public String exibirDados(){
        String dados = "Nome: " + this.nome + "\n CNPJ: " + this.cnpj + "\n";
        return dados;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
