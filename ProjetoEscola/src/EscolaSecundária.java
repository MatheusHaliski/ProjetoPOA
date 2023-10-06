public class EscolaSecundária extends Escola {
    public EscolaSecundária(String nome, int capacidade, Endereco endereco, Professor professor, Aluno aluno) {
        super(nome, capacidade, endereco, professor, aluno);
        super.numescolas+=1;
    }

    public void getNome() {
        System.out.println("ESCOLA DE SEGUNDO GRAU:" + super.nome);
    }

    public int getCapacidade(){
        return capacidade;
    }

    public Endereco getEndereco() {
        return super.endereco;
    }
    public int getnumescolas(){
        return numescolas;
    }
}
