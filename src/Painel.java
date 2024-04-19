import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Painel extends JFrame {
    JTextField text1;
    JTextField text2;
    private String[] AlunosSexoMasculino;

    public Painel(){

        //janela
        setTitle("Painel Inicio");
        setVisible(true);// renderiza a janela
        setSize(375, 300);// Ajusta o tamanho da janela
        setBackground(new Color(01,01,01));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// comando para fechar o programa
        setResizable(false);// Bloqueia o ajuste da janela
        setLocationRelativeTo(null);// Ajusta a janela para o centro da tela
        setLayout(null);

        //Botao enviar
        JButton jButton = new JButton("enviar");
        jButton.setBounds(210,150,100,30);
        add(jButton);

        //Texto
        JLabel jLabel1 = new JLabel("Nome");
        jLabel1.setBounds(100,20,50,40);
        add(jLabel1);

        JLabel jLabel2 = new JLabel("Sobre Nome");
        jLabel2.setBounds(100,50,70,40);
        add(jLabel2);

        //Caixa de texto
        text1 = new JTextField("");
        text1.setBounds(200,30,130,20);
        add(text1);

        text2 = new JTextField("");
        text2.setBounds(200,60,130,20);
        add(text2);

        //Chama o evento do botão
        jButton.addActionListener(this::enviar);
    }

    private void enviar(ActionEvent actionEvent) {


    }

}
