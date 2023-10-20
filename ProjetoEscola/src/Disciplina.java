public class Disciplina {
    protected String nome;
    protected int creditos;
    protected int semestre;
    public Disciplina(String nome,int creditos,int semestre){
        this.nome=nome;
        this.creditos=creditos;
        this.semestre=semestre;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void setSemestre(int semestre){
        this.semestre=semestre;
    }
    public int getSemestre(){
        return semestre;
    }
    }
