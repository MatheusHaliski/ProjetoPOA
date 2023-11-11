public class Turma {
    protected int periodo;
    protected int sala;
    protected int numalunos;
    protected int bloco;
    protected int andar;
    protected Disciplina disciplina;
    public Turma(Disciplina disciplina, int sala, int numalunos, int bloco, int andar){
        this.disciplina=disciplina;
        this.sala=sala;
        this.numalunos=numalunos;
        this.bloco=bloco;
        this.andar=andar;
    }
    public int getsala(){
        return this.sala;
    }
    public void setSala(int sala){
        this.sala=sala;
    }
    public void setDisciplina(Disciplina disciplina){
        this.disciplina=disciplina;
    }
    public String getDisciplina(){
        return disciplina.nome;
    }
    public void setNumalunos(int numalunos){
        this.numalunos=numalunos;
    }
    public int getNumalunos(){
        return numalunos;
    }
}
