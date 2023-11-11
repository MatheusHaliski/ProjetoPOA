public class EscolaPrimaria extends Escola{
    public EscolaPrimaria(String nome, int capacidade, Endereco endereco) {
        super(nome,capacidade,endereco);
    }

    @Override
    public void setAluno(Aluno aluno) {
        System.out.println("ADICIONANDO NOVO ALUNO:");
        System.out.println("NOME:");
        System.out.println(aluno.getNome());
                this.alun.add(aluno);
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
    public void setCapacidade(int capacidade) {
        this.capacidade=capacidade;
    }

    @Override
    public void setEndereco(Endereco endereco) {
        super.rua = endereco.rua;
        super.cidade = endereco.cidade;
        super.estado = endereco.estado;
    }

    @Override
    public void getEndereco(){
        System.out.println("RUA:"+super.rua);
        System.out.println("CIDADE:"+super.cidade);
        System.out.println("ESTADO:"+super.estado);
    }
    @Override
    public void getnumescolas(){
        System.out.println("Número de escolas:  "+ee1.size());
    }
}
