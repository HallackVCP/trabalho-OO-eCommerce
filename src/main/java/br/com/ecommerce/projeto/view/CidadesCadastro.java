package br.com.ecommerce.projeto.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CidadesCadastro extends JFrame {
    private JTextField tfCidade;
    private JTextField tfEstado;
    private JButton btnCadastrar;
    private JButton btnLimpar;
    private JLabel stsMessage;
    private JPanel mainPanel;

    public CidadesCadastro(){
        setContentPane(mainPanel);
        setTitle("Cadastro de Cidades");
        setSize(450,300);
        setVisible(true);
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cidade = tfCidade.getText();
                String estado = tfEstado.getText();
                stsMessage.setText("Cidade " + cidade + " foi cadastrada!");
            }
        });
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfCidade.setText("");
                tfEstado.setText("");
                stsMessage.setText("");
            }
        });
    }



    public static void main(String[] args) {
        CidadesCadastro myFrame = new CidadesCadastro();
    }
}
