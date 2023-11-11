import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploInterfaceGrafica {
    public static void main(String[] args) {
        // Criar uma janela
        JFrame janela = new JFrame("Exemplo de Interface Gráfica");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300, 200);

        // Criar um rótulo
        JLabel rotulo = new JLabel("Bem-vindo à minha interface gráfica!");
        janela.add(rotulo);

        JTextField campoTexto = new JTextField(20); // 20 é o tamanho do campo
        janela.add(campoTexto);

        JButton botao = new JButton("Clique em mim");
        janela.add(botao);

        // Adicionar um ouvinte de ação ao botão
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoTexto.getText();
                String nome1 = campoTexto.getText();
                rotulo.setText("Olá, " + nome + "!");
            }
        });

        // Configurar o layout da janela
        janela.setLayout(new java.awt.FlowLayout());

        // Tornar a janela visível
        janela.setVisible(true);
    }
}


