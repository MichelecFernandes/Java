package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) getSomaDasAvaliacao() / 2;
    }

    //Para pegar os dados do endereço, preciso converter com o to String
    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoLancamento() + ")";
    }
}
