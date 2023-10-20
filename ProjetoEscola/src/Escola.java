import java.util.ArrayList;

public abstract class Escola implements InterfaceEscola{

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
    ArrayList<Turma>tu1 = new ArrayList<>();
    public Escola(String nome, int capacidade, Endereco endereco) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.endereco = endereco;
    }
    public void setEscola(Escola escola){
        ee1.add(escola);
    }
    public abstract void getNome();
    public void getlistNome(int i){
        ee1.get(i).getNome();
    }

    public abstract void getCapacidade();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public abstract Endereco getEndereco();

    public void getlistesccapacidade(int i){
        ee1.get(i).getCapacidade();
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setTurma(Turma turma){
        this.tu1.add(turma);
    }

    public void setAluno(Aluno aluno) {
        this.alun.add(aluno);
    }
    public void getTurma(){
        for (int i=0;i<tu1.size();i++){
            System.out.println(tu1.get(i).getDisciplina());
            System.out.println(tu1.get(i).getsala());
            System.out.println(tu1.get(i).getNumalunos());
        }
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
    public abstract void getnumescolas();
    public void setProfessor(Professor professor1) {
        this.prof.add(professor1);
    }
}

