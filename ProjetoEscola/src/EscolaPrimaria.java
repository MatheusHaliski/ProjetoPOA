public class EscolaPrimaria extends Escola{
    public EscolaPrimaria(String nome, int capacidade, Endereco endereco) {
        super(nome,capacidade,endereco);
    }

    @Override
    public void setAluno(Aluno aluno) {
        super.setAluno(aluno);
    }
    @Override
    public void getNome(){
        System.out.println("ESCOLA PRIMÁRIA:"+super.nome);
    }
    @Override
    public void getCapacidade(){
        System.out.println("Capacidade de Escola Primária  "+super.nome+"  é:"+super.capacidade);
    }
    @Override
    public Endereco getEndereco(){
        return endereco;
    }
    @Override
    public void getnumescolas(){
        System.out.println("Número de escolas:  "+ee1.size());
    }
}
