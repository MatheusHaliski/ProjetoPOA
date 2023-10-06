import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Aluno alu = new Aluno("Matheus",25);
        Aluno alu2 = new Aluno("Jonas",29);
        Endereco end = new Endereco("das flores","Curitiba","Parana");
        Professor pes = new Professor("Joao Freitas",55);
        Escola esc = new EscolaPrimaria("BJ Aldeia",2500,end,pes,alu2);
        esc.ee1.add(new EscolaPrimaria("BJ Aldeia",2500,end,pes,alu));
        esc.ee1.add(new EscolaSecundária("BJ Lourdes",4000,end,pes,alu));
        esc.ee1.add(new Faculdade("PUCPR",10000,end,pes,alu));
        esc.setAluno(new Aluno("Joao",44));
        esc.setAluno(new Aluno("Guilherme",32));
        esc.setAluno(new Aluno("Matheus",25));
        esc.getAluno();
        esc.getProf();
        System.out.println("Escolas criadas até o momento:");
        System.out.println(esc.ee1.size());
        System.out.println("Professores criados até o momento:");
        System.out.println(esc.prof.size());
        System.out.println("Alunos criados até o momento:");
        System.out.println(esc.alun.size());
    }
}