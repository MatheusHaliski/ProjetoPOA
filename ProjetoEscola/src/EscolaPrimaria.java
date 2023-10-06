public class EscolaPrimaria extends Escola{
    public EscolaPrimaria(String nome, int capacidade, Endereco endereco, Professor professor, Aluno aluno) {
        super(nome,capacidade,endereco,professor,aluno);
        super.numescolas+=1;
    }
    public void getNome(){
        System.out.println("ESCOLA PRIMÁRIA:"+super.nome);
    }
    public int getCapacidade(){
        return capacidade;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public int getnumescolas(){
        return super.numescolas;
    }
}
