import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PersistentUser userFile = new PersistentUser("files.txt");

//        userFile.add("Marina", "lara.marina@pucpr.br", 31);
        userFile.add("Cris", "cris.lara@gmail.com", 51);
        userFile.read();

        String nome1 = null;
        String nomeoficial1 = null;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite a idade");
            int idade = scanner.nextInt();
            System.out.println("Nome digitado: " + idade);
        } catch (InputMismatchException e) {
            System.out.println("Você inseriu um tipo inválido de dados.");
        }
        System.out.println("Digite nome1");
        nome1 = scanner.next();
        try{
            double numero = Double.parseDouble(nome1);
            System.out.println("ERRO!!");
        }catch (NumberFormatException e) {
            // A conversão falhou, o que significa que a entrada não é um número
            System.out.println("Inseriu nome corretamente.Nome é"+nome1);
        }
        Aluno alu = new Aluno("Matheus",25);
        Aluno alu2 = new Aluno("Jonas",29);
        Endereco end = new Endereco("das flores","Curitiba","Parana");
        Endereco end2 = new Endereco("Machado de Assis","Curitiba","Paraná");
        Endereco end3 = new Endereco("Joao Alves","Sao Paulo","Sao Paulo");
        Endereco end4 = new Endereco("Republica Argentina","Buenos Aires","Buenos Aires");
        Endereco end5 = new Endereco("Avenida Munhoz da Rocha","Colombo","Paraná");
        Professor pes = new Professor("Joao Freitas",55);
        Professor pes2 = new Professor("Guilherme Alcantara",34);
        Professor pes3 = new Professor("Amanda Queiroz",29);
        Disciplina discip1 = new Disciplina("Fundamentos de Sistemas Ciberfísicos",4,1);
        Disciplina discip2 = new Disciplina("Programação Orientada à Objetos",5,1);
        Disciplina discip3 = new Disciplina("Raciocínio Algorítmico",4,2);
        Disciplina discip4 = new Disciplina("Língua Portuguesa",5,1);
        Disciplina discip5 = new Disciplina("Matemática Discreta",6,1);
        Disciplina discip6 = new Disciplina("Biologia",5,1);
        Disciplina discip7 = new Disciplina("Banco de Dados",7,2);
        Turma turma1 = new Turma(discip1,101,45,2,2);
        Turma turma2 = new Turma(discip2,102,55,1,1);
        Turma turma3 = new Turma(discip3,103,65,1,1);
        Turma turma4 = new Turma(discip4,104,75,2,1);
        Turma turma5 = new Turma(discip5,105,80,3,1);
        Turma turma6 = new Turma(discip6,107,64,3,2);
        Turma turma7 = new Turma(discip7,108,45,2,1);
        Escola esc = new EscolaPrimaria("BJ Aldeia",2500,end);
        esc.setTurma(turma1);
        esc.setTurma(turma2);
        esc.setTurma(turma3);
        esc.setTurma(turma5);
        esc.setTurma(turma6);
        esc.setProfessor(pes);
        esc.setProfessor(pes2);
        esc.setProfessor(pes3);
        Escola esc2 = new EscolaSecundária("Marista",3400,end2);
        esc.setEscola(new EscolaSecundária("BJ Lourdes",4000,end2));
        esc.setEscola(new Faculdade("SESCPR",23000,end5));
        esc.setEscola(esc2);
        esc.setEscola(esc);
        esc.setEscola(new Faculdade("PUCPR",10000,end3));
        esc.setEscola(new Faculdade("UP",5500,end4));
        esc.setAluno(new Aluno("Joao",44));
        esc.setAluno(new Aluno("Guilherme",32));
        esc.setAluno(new Aluno("Matheus",25));
        System.out.println("NOMES E IDADES DOS ALUNOS:");
        esc.getAluno();
        System.out.println("NOMES E IDADES DOS PROFESSORES:");
        esc.getProf();
        esc.getnumescolas();
        System.out.println("--------");
        System.out.println("LISTA DE NOMES DAS ESCOLAS:");
        for (int i=0;i<esc.ee1.size();i++){
            esc.getlistNome(i);
        }
        System.out.println("---------");
        System.out.println("------------");
        System.out.println("LISTA DE CAPACIDADES DAS ESCOLAS:");
        for (int i=0;i<esc.ee1.size();i++){
        esc.getlistesccapacidade(i);
            }
        System.out.println("------------");
        System.out.println("Escolas criadas até o momento:");
        System.out.println(esc.ee1.size());
        System.out.println("Professores criados até o momento:");
        System.out.println(esc.prof.size());
        System.out.println("Alunos criados até o momento:");
        System.out.println(esc.alun.size());
        System.out.println("Turmas criadas até o momento:");
        System.out.println(esc.tu1.size());
        esc.getTurma();
    }
}