package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodioTemporada;
    private int minutosEpisodio;

    public Serie(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodioTemporada() {
        return episodioTemporada;
    }

    public void setEpisodioTemporada(int episodioTemporada) {
        this.episodioTemporada = episodioTemporada;
    }

    public int getMinutosEpisodio() {
        return minutosEpisodio;
    }

    public void setMinutosEpisodio(int minutosEpisodio) {
        this.minutosEpisodio = minutosEpisodio;
    }

    @Override
    public int getDuracaoMinutos() {
        return temporadas * episodioTemporada * minutosEpisodio;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + "(" + this.getAnoLancamento() + ")";
    }
}
