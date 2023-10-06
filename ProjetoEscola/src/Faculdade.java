public class Faculdade extends Escola{
    public Faculdade(String nome, int capacidade, Endereco endereco, Professor professor, Aluno aluno){
        super(nome,capacidade,endereco,professor,aluno);
        super.numescolas+=1;
    }
    public void getNome(){
        System.out.println("FACULDADE:"+super.nome);
    }
    public int getCapacidade(){
        return capacidade;
    }
    public Endereco getEndereco(){
        return super.endereco;
    }
    public int getnumescolas(){
        return numescolas;
    }
}
