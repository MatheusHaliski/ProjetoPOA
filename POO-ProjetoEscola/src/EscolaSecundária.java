public class EscolaSecundária extends Escola {
    public EscolaSecundária(String nome, int capacidade, Endereco endereco) {
        super(nome, capacidade, endereco);
    }

    public void getNome() {
        System.out.println("ESCOLA DE SEGUNDO GRAU:" + super.nome);
    }
    public void getCapacidade(){
        System.out.println("Capacidade de Escola Secundária  "+super.nome+"  é:"+super.capacidade);
    }

    @Override
    public void setCapacidade(int capacidade) {
        this.capacidade=capacidade;
    }


    public void setEndereco(Endereco endereco) {
        super.rua = endereco.rua;
        super.cidade = endereco.cidade;
        super.estado = endereco.estado;
    }
    public void getEndereco(){
        System.out.println("RUA:"+super.rua);
        System.out.println("CIDADE:"+super.cidade);
        System.out.println("ESTADO:"+super.estado);
    }
    public void getnumescolas(){
        System.out.println("Número de escolas:  "+ee1.size());
    }
}
