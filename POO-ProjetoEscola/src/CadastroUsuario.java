import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroUsuario {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Usuário");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300, 1200);
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(14, 12));
        JLabel nameLabel = new JLabel("Estudante:");
        JTextField nameField = new JTextField(11);
        JLabel ageLabel = new JLabel("Idade:");
        JTextField ageField = new JTextField(11);
        JLabel schoolLabel = new JLabel("Escola:");
        JTextField schoolField = new JTextField(11);
        JLabel profLabel = new JLabel("Professor:");
        JTextField profField = new JTextField(11);

        JButton submitButton = new JButton("Cadastrar");
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(schoolLabel);
        panel.add(schoolField);
        panel.add(profLabel);
        panel.add(profField);
        panel.add(new JLabel("Confirmar")); // Espaço em branco
        panel.add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Escola = schoolField.getText();
                String Aluno = nameField.getText();
                String idade = ageField.getText();
                int idade1 = Integer.parseInt(idade);
                String Professor = profField.getText();
                Endereco endereco1 = new Endereco("Euripedez Garcez,3349","Curitiba","PR");
                Endereco endereco2 = new Endereco("Machado de Assis,1144","Curitiba","PR");
                Endereco endd = new Endereco("Jorge Silva,2233","Riode Janeiro","RJ");
                Escola esc1 = new EscolaPrimaria("COLEGIO BONS ESTUDOS",2300,endereco1);
                Escola esc2 = new EscolaSecundária("AMOR DE MAE",4300,endereco1);
                Escola esc3 = new Faculdade("UFPR",10000,endd);
                Escola esc4 = new Faculdade("UP", 5500, endereco2);
                Escola esc = Main2.getEscola(Aluno,idade1);
                Escola esc11 = Main2.getEscola(Aluno,idade1);
                JOptionPane.showConfirmDialog(null,"Confirma respostas");
                JOptionPane.showMessageDialog(null,"CADASTRO FEITO DE ESCOLAS: \nEscola Primária:"+"\n  Nome:"+esc1.nome+" \nCapacidade:"+esc1.capacidade+"\nEscola Secundária:"+
                        "\nNome:"+esc2.nome+" \nCapacidade:"+esc2.capacidade+"\nFaculdade:"+
                "\nNome:"+esc3.nome+" \nCapacidade:"+esc3.capacidade+"\nFaculdade:"+
                        "\nNome:"+esc4.nome+" \nCapacidade:"+esc4.capacidade);
                JOptionPane.showMessageDialog(null, "Usuário Cadastrado:\nEscola do Estudante: " + Escola + "\nAluno: " + Aluno + "\nIdade:"+idade+"\nProfessor: " + Professor);
            }
        });

        frame.setVisible(true);
    }
}

