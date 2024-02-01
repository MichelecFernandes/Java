package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private int duracaoMinutos;
    private double somaDasAvaliacao;
    private boolean incluidoPLano;
    private int totalAvaliacoes;

    public void exibirTela(){
        System.out.println("O nome do filme é: " + this.nome);
        System.out.println("O ano de lançamento foi: " + this.anoLancamento);
    }

    public void avaliaFilme(double nota){
        this.somaDasAvaliacao += nota;
        this.totalAvaliacoes ++;
        System.out.println("A soma da avaliação do filme é: " + this.somaDasAvaliacao);
        System.out.println("O total de avaliações do filme é de: " + this.totalAvaliacoes);
    }

    public double mediaFilme(){
        return this.somaDasAvaliacao / this.totalAvaliacoes;

    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getSomaDasAvaliacao() {
        return somaDasAvaliacao;
    }

    public void setSomaDasAvaliacao(double somaDasAvaliacao) {
        this.somaDasAvaliacao = somaDasAvaliacao;
    }

    public boolean isIncluidoPLano() {
        return incluidoPLano;
    }

    public void setIncluidoPLano(boolean incluidoPLano) {
        this.incluidoPLano = incluidoPLano;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }
}
