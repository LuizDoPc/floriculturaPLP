package main;

import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
/**
 * Classe que representa a interface gráfica da aplicação
 */


public class TelaInicial implements ActionListener{
    private JFrame janela;
    private JButton cadastrarCliente;
    private JButton mostrarClientes;
    private JButton cadastrarFuncionario;
    private JButton mostrarFuncionarios;
    private JButton cadastrarFLor;
    private JButton mostrarFlores;
    private JButton cadastrarFornecedor;
    private JButton mostrarFornecedores;
    private JButton cadastrarVenda;
    private JButton mostrarVendas;


    public TelaInicial(){
        janela = new JFrame("Tela Inicial");
        cadastrarCliente = new JButton("Cadastrar Cliente");
        cadastrarCliente.addActionListener(this);
        mostrarClientes = new JButton("Mostrar Clientes");
        mostrarClientes.addActionListener(this);
        cadastrarFuncionario = new JButton("Cadastrar Funcionário");
        cadastrarFuncionario.addActionListener(this);
        mostrarFuncionarios = new JButton("Mostrar Funcionários");
        mostrarFuncionarios.addActionListener(this);
        cadastrarFLor = new JButton("Cadastrar Flor");
        cadastrarFLor.addActionListener(this);
        mostrarFlores = new JButton("Mostrar Flores");
        mostrarFlores.addActionListener(this);
        cadastrarFornecedor = new JButton("Cadastrar Fornecedor");
        cadastrarFornecedor.addActionListener(this);
        mostrarFornecedores = new JButton("Mostrar Fornecedores");
        mostrarFornecedores.addActionListener(this);
        cadastrarVenda = new JButton("Cadastrar Venda");
        cadastrarVenda.addActionListener(this);
        mostrarVendas = new JButton("Mostrar Vendas");
        mostrarVendas.addActionListener(this);
        montarJanela();
    }
    

    public void montarJanela(){
        janela.setSize(400, 600);
        janela.setLayout(new GridLayout(5,2));
        janela.add(cadastrarCliente);
        janela.add(mostrarClientes);
        janela.add(cadastrarFuncionario);
        janela.add(mostrarFuncionarios);
        janela.add(cadastrarFLor);
        janela.add(mostrarFlores);
        janela.add(cadastrarFornecedor);
        janela.add(mostrarFornecedores);
        janela.add(cadastrarVenda);
        janela.add(mostrarVendas);
    }
    

    public void exibir() {
        janela.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == cadastrarCliente){
            String nome = JOptionPane.showInputDialog("Nome do cliente");
            String cpf = JOptionPane.showInputDialog("CPF do cliente");
            String contato = JOptionPane.showInputDialog("Contato do cliente");

            Cliente c = new Cliente(nome, cpf, contato);
            Controle.cadastrarCliente(c);
           
        }else if(e.getSource() == cadastrarFuncionario){
            String nome = JOptionPane.showInputDialog("Nome do funcionário");
            String cpf = JOptionPane.showInputDialog("CPF do funcionário");
            String contato = JOptionPane.showInputDialog("Contato do funcionário");
            String cargo = JOptionPane.showInputDialog("Cargo do funcionário");
            String email = JOptionPane.showInputDialog("Email do funcionário");
            String senha = JOptionPane.showInputDialog("Senha do funcionário");

            Funcionario f = new Funcionario(nome, cpf, contato, cargo, email, senha);
            Controle.cadastrarFuncionario(f);
           
        }else if(e.getSource() == cadastrarFLor){
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da flor"));
            String nome = JOptionPane.showInputDialog("Nome da flor");
            int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade em estoque"));
            String cor = JOptionPane.showInputDialog("Cor da flor");
            float valor = Float.parseFloat(JOptionPane.showInputDialog("Preço da flor"));

            Flor f = new Flor(codigo, nome, qtd, cor, valor);
            Controle.cadastrarFlor(f);

        }else if(e.getSource() == cadastrarFornecedor){
            String cnpj = JOptionPane.showInputDialog("CNPJ do fornecedor");
            String nome = JOptionPane.showInputDialog("Nome do fornecedor");

            Fornecedor f = new Fornecedor(cnpj, nome);
            Controle.cadastrarFornecedor(f);

        }else if(e.getSource() == mostrarClientes){
            JOptionPane.showMessageDialog(janela, Controle.exibirClientes());
        }else if(e.getSource() == mostrarFuncionarios){
            JOptionPane.showMessageDialog(janela, Controle.exibirFuncionarios());
        }else if(e.getSource() == mostrarFlores){
            JOptionPane.showMessageDialog(janela, Controle.exibirFlores());
        }else if(e.getSource() == mostrarFornecedores){
            JOptionPane.showMessageDialog(janela, Controle.exibirFornecedores());
        }
    }
}
