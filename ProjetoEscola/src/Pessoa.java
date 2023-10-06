public abstract class Pessoa {
    protected String nome;
    protected int idade;
    public Pessoa(String nome,int idade){
        this.nome=nome;
        this.idade=idade;
    }
    public abstract String getNome();
    public abstract int getIdade();
    public abstract void setNome(String nome);
    public abstract void setIdade(int idade);
}
