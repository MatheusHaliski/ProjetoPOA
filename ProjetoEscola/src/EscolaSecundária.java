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

    public Endereco getEndereco() {
        return super.endereco;
    }
    public void getnumescolas(){
        System.out.println("Número de escolas:  "+ee1.size());
    }
}
