package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalListas {
    public static void main(String[] args) {
        Filme primeiroFilme = new Filme("Star Wars", 2023);
        Filme segundoFilme = new Filme("Avatar", 2021);
        Serie primeiraSerie = new Serie("Lá casa", 2022);
        ArrayList<Titulo> listaItensParaAssistir = new ArrayList<>();
        listaItensParaAssistir.add(primeiroFilme);
        listaItensParaAssistir.add(segundoFilme);
        listaItensParaAssistir.add(primeiraSerie);
        System.out.println(listaItensParaAssistir);
        for(Titulo item:listaItensParaAssistir){
            System.out.println(item);
        }

        //Varre a lista tbm
        listaItensParaAssistir.forEach(System.out::println);

        ArrayList<String> listaNome= new ArrayList<>();
        listaNome.add("Carlos");
        listaNome.add("João");
        listaNome.add("Maria");
        listaNome.add("Lara");
        listaNome.add("Pedro");
        listaNome.add("Carol");
        listaNome.forEach(System.out::println);
        System.out.println(listaNome);

        //Ordena a lista
        Collections.sort(listaNome);
        //Depois que ordena, peço para ele printar
        System.out.println(listaNome);

        //Comparando e ordenando as series e filme, usando o comparable
        Collections.sort(listaItensParaAssistir);
        System.out.println(listaItensParaAssistir);

        //Comparando e ordenando as series e filme, usando o comparator por ANo de Lançamento
        listaItensParaAssistir.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println(listaItensParaAssistir);
    }
}
