public class Faculdade extends Escola{
    public Faculdade(String nome, int capacidade, Endereco endereco){
        super(nome,capacidade,endereco);
    }
    public void getNome(){
        System.out.println("FACULDADE:"+super.nome);
    }
    public void getCapacidade(){
        System.out.println("Capacidade da FACULDADE"+super.nome+"é:"+super.capacidade);
    }
    public Endereco getEndereco(){
        return super.endereco;
    }
    public void getnumescolas(){
        System.out.println("Número de escolas:  "+ee1.size());
    }
}
