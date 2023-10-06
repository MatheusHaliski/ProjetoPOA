import javax.xml.stream.events.EndElement;
import java.util.ArrayList;

public abstract class Escola {
    protected int numescolas=0;
    protected String nome;
    protected int capacidade;
    protected String rua;
    protected String cidade;
    protected String estado;
    protected Endereco endereco;
    protected Professor professor;
    protected Aluno aluno;
    protected ArrayList<Professor> prof = new ArrayList<>();
    protected ArrayList<Aluno> alun = new ArrayList<>();
    ArrayList<Escola>ee1 = new ArrayList<>();

    public Escola(String nome, int capacidade, Endereco endereco, Professor professor, Aluno aluno) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.endereco = endereco;
        prof.add(professor);
        alun.add(aluno);
    }

    public abstract void getNome();

    public abstract int getCapacidade();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public abstract Endereco getEndereco();

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setAluno(Aluno aluno) {
        this.alun.add(aluno);
    }

    public void getAluno() {
        for (int i = 0; i < alun.size(); i++) {
            System.out.println(alun.get(i).getNome());
            System.out.println(alun.get(i).getIdade());
        }
    }
    public void getProf() {
        for (int i = 0; i < prof.size(); i++) {
            System.out.println(prof.get(i).getNome());
            System.out.println(prof.get(i).getIdade());
        }
    }
    public abstract int getnumescolas();
    public void setProfessor(Professor professor1) {
        this.prof.add(professor1);
    }
}

