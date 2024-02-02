package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalListas {
    public static void main(String[] args) {
        Filme primeiroFilme = new Filme("Star Wars", 2023);
        Filme segundoFilme = new Filme("Avatar", 2024);
        Serie primeiraSerie = new Serie("Lá casa", 2024);
        ArrayList<Titulo> listaItensParaAssistir = new ArrayList<>();
        listaItensParaAssistir.add(primeiroFilme);
        listaItensParaAssistir.add(segundoFilme);
        listaItensParaAssistir.add(primeiraSerie);
        System.out.println(listaItensParaAssistir);
        for(Titulo item:listaItensParaAssistir){
            System.out.println(item);
        }

    }
}
