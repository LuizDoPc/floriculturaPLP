package Model;


public class Flor {
    private int codigo;
    private String nome;
    private int qtdEmEstoque;
    private String cor;
    private float valor;

    public Flor(int codigo, String nome, int qtdEmEstoque, String cor, float valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtdEmEstoque = qtdEmEstoque;
        this.cor = cor;
        this.valor = valor;
    }

    public String exibirDados(){
        String dados = "Código: " + this.codigo + "\nNome: " + this.nome + "\n Quantidade disponível: " + this.qtdEmEstoque + "\n Cor: " + this.cor + "\n Preço: " + this.valor + "\n";
        return dados;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdEmEstoque() {
        return qtdEmEstoque;
    }

    public void setQtdEmEstoque(int qtdEmEstoque) {
        this.qtdEmEstoque = qtdEmEstoque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}