package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoMinutos();
    }
}
