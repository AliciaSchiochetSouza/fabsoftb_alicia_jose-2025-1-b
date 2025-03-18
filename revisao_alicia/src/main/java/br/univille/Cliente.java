package br.univille;

public class Cliente {
    //variavel ou atributo
    private String nome;
    //construtor
    public Cliente(String nome) {
        this.nome = nome;
    }
    public Cliente() {
    
    }

    //método
    @Override //sobreescrita de método
    public String toString(){
        return getNome();
    }
    
    //método
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    // encapsulamento = esconder a implementação dentro do objeto
}
