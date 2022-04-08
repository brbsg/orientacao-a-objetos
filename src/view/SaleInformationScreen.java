package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.*;

public class SaleInformationScreen implements ActionListener {
    private JFrame window;
    
    private JLabel labelSaleName = new JLabel("Nome da Venda: ");
    private JTextField valueSaleName;
    private JLabel labelProduct = new JLabel("Produto: ");
    private JTextField valorProduct;
    private JLabel labelIdClient = new JLabel("Cliente: ");
    private JTextField valorIdClient;
    private JLabel labelEmployeeId = new JLabel("Funcionario: ");
    private JTextField valueEmployeeId;
    private JLabel labelIdSale = new JLabel("Id Venda: ");
    private JTextField valueIdSale;
    private JLabel labelFinalValue = new JLabel("Valor Venda: ");
    private JTextField valorFinalValue;
    
    private JButton botaoExcluir = new JButton("Excluir");
    private JButton botaoSalvar = new JButton("Salvar");
    private String[] novoDado = new String[9];
    private JComboBox<String> clientes = new JComboBox<String>();
    private JComboBox<String> funcionarios = new JComboBox<String>();

    private JComboBox<String> products = new JComboBox<String>();
    private static DataController dados;
    private int posicao;
    private int opcao;
    private String s;
    private String[] nomeClientes = new String[50];
    private String[] nomeFuncionario = new String[50];

    private String[] nomeLente = new String[50];

    public void inserirEditar(int op, DataController d, SaleScreen t, int pos) {

        opcao = op;
        posicao = pos;
        dados = d;
        nomeClientes = new ClientController(dados).getClientName();
        nomeFuncionario = new EmployeeController(dados).getNomeProf();

        nomeLente = new PurseController(dados).getName();

        if (op == 1)
            s = "Cadastro de Venda";
        if (op == 2)
            s = "Detalhe de Venda";

        window = new JFrame(s);

        // Preenche dados com dados da venda clicada
        if (op == 2) {
            valueSaleName = new JTextField(dados.getSales()[pos].getName(), 200);
            valueIdSale = new JTextField(String.valueOf(dados.getSales()[pos].getIdSale()), 200);
            valorIdClient = new JTextField(dados.getSales()[pos].getClientName(), 200);
            valueEmployeeId = new JTextField(dados.getSales()[pos].getEmployeeName(), 200);
            valorProduct = new JTextField(dados.getSales()[pos].getProductName(), 200);
            valorFinalValue = new JTextField(String.valueOf(dados.getSales()[pos].getValue()), 200);

        } else { // Nao preenche com dados
            valueSaleName = new JTextField(200);
            valueIdSale = new JTextField(200);
            valorIdClient = new JTextField(200);
            valueEmployeeId = new JTextField(200);
            valorProduct = new JTextField(200);
            valorFinalValue = new JTextField(200);
            
            clientes = new JComboBox<String>(nomeClientes);
            funcionarios = new JComboBox<String>(nomeFuncionario);
            products = new JComboBox<String>(nomeLente);

            
            this.window.add(clientes);
            this.window.add(funcionarios);
            this.window.add(products);


            botaoSalvar.setBounds(245, 230, 115, 30);
        }

        labelIdSale.setBounds(30, 50, 150, 25);
        labelIdSale.setForeground(Color.WHITE);
        valueIdSale.setBounds(180, 50, 180, 25);

        labelEmployeeId.setBounds(30, 110, 150, 25);
        labelEmployeeId.setForeground(Color.WHITE);
        valueEmployeeId.setBounds(180, 110, 180, 25);
        labelIdClient.setBounds(30, 140, 180, 25);
        valorIdClient.setBounds(180, 140, 180, 25);
        labelIdClient.setForeground(Color.WHITE);
        labelProduct.setBounds(30, 170, 150, 25);
        labelProduct.setForeground(Color.WHITE);
        valorProduct.setBounds(180, 170, 180, 25);
        labelSaleName.setBounds(30, 20, 150, 25);
        labelSaleName.setForeground(Color.WHITE);
        valueSaleName.setBounds(180, 20, 180, 25);
        labelFinalValue.setBounds(30, 200, 150, 25);
        labelFinalValue.setForeground(Color.WHITE);
        valorFinalValue.setBounds(180, 200, 180, 25);


        valorIdClient.setEditable(false);
        valueEmployeeId.setEditable(false);
        valorProduct.setEditable(false);

        clientes.setBounds(180, 140, 180, 25);
        products.setBounds(180, 170, 180, 25);
        funcionarios.setBounds(180, 110, 180, 25);


        // Coloca botoes de excluir e salvar
        if (op == 2) {
            botaoSalvar.setBounds(120, 250, 115, 30);
            botaoExcluir.setBounds(245, 250, 115, 30);
            this.window.add(botaoExcluir);
        }

        this.window.add(labelIdSale);
        this.window.add(valueIdSale);

        this.window.add(labelProduct);
        this.window.add(valorProduct);
        this.window.add(botaoSalvar);
        this.window.add(labelEmployeeId);
        this.window.add(valueEmployeeId);
        this.window.add(labelIdClient);
        this.window.add(valorIdClient);
        this.window.add(labelSaleName);
        this.window.add(valueSaleName);
        this.window.add(labelFinalValue);
        this.window.add(valorFinalValue);

        this.window.setLayout(null);
        window.getContentPane().setBackground(Color.DARK_GRAY);

        this.window.setSize(500, 400);
        this.window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setResizable(false);

        botaoSalvar.addActionListener(this);
        botaoExcluir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == botaoSalvar) {
            try {
                boolean res;
                if (opcao == 1) {
                    
                	novoDado[0] = Integer.toString(dados.getAmountOfPurses());
                    novoDado[1] = valueIdSale.getText();
                    novoDado[3] = (String) funcionarios.getSelectedItem();
                    novoDado[4] = valueSaleName.getText();
                    novoDado[5] = (String) products.getSelectedItem();
                    novoDado[6] = valorFinalValue.getText();
                } else {
                	novoDado[0] = Integer.toString(posicao);
                    novoDado[1] = valueIdSale.getText();
                    novoDado[3] = valueEmployeeId.getText();
                    novoDado[4] = valueSaleName.getText();
                    novoDado[5] = valorProduct.getText();
                    novoDado[6] = valorFinalValue.getText();
                }

                if (opcao == 1) {
                    novoDado[2] = (String) clientes.getSelectedItem();
                    res = dados.insertSale(novoDado);
                } else {
                    novoDado[2] = valorIdClient.getText();
                    res = dados.insertSale(novoDado);
                }
                if (res) {
                    mensagemSucessoCadastro();
                } else
                    mensagemErroCadastro();

            } catch (NullPointerException exc1) {
                mensagemErroCadastro();
            } catch (NumberFormatException exc2) {
                mensagemErroCadastro();
            }
        }

        if (src == botaoExcluir) {
            boolean res;

            // exclui Venda

            res = dados.removerVenda(posicao);

            if (res) {

                mensagemSucessoExclusao();

            } else
                mensagemErroExclusaoArmacao();

        }

    }

    public void mensagemSucessoExclusao() {

        JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null,
                JOptionPane.INFORMATION_MESSAGE);
        window.dispose();
    }

    public void mensagemSucessoCadastro() {
        JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
                JOptionPane.INFORMATION_MESSAGE);
        window.dispose();
    }

    public void mensagemErroCadastro() {
        JOptionPane.showMessageDialog(null,
                "ERRO AO SALVAR OS DADOS!\n " + "Pode ter ocorrido o seguinte:  \n"
                        + "1. Nem todos os campos foram preenchidos \n"
                        + "2. identificacoes e/ou valor nao contem apenas numeros",
                null, JOptionPane.ERROR_MESSAGE);
    }

    public void mensagemErroExclusaoArmacao() {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n "
                + "Verifique se a venda esta cadastrada\n" + " e tente novamente.", null, JOptionPane.ERROR_MESSAGE);
    }

}