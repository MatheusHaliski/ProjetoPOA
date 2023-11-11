public class Aluno extends Pessoa{

    public Aluno(String nome, int idade){
       super(nome,idade);
    }
    public String getNome(){
        return super.nome;
    }
    public int getIdade(){
        return super.idade;
    }
    public void setNome(String nome){
        super.nome=nome;
    }
    public void setIdade(int idade){
        super.idade=idade;
    }
}
