package br.com.alura.screenmatch.calculos;

public class Pesssoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome da pessoa: " + this.getNome() + ", idade da pessoa: " + this.getIdade();
    }
}
