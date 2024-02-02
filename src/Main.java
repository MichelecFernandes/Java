import br.com.alura.screenmatch.calculos.CalculadoraTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.calculos.Pesssoa;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Filme primeiroFilme = new Filme();
        primeiroFilme.setNome("Star Wars");
        primeiroFilme.setAnoLancamento(2024);

        primeiroFilme.exibirTela();
        primeiroFilme.avaliaFilme(7.0);
        primeiroFilme.avaliaFilme(8.0);
        primeiroFilme.avaliaFilme(500.0);

        System.out.println(primeiroFilme.mediaFilme());

        primeiroFilme.setDuracaoMinutos(20);

        System.out.println((primeiroFilme.getDuracaoMinutos()));

        Serie primeiraSerie = new Serie(5, false, 5, 80);
        primeiraSerie.setNome("Lá casa");
        System.out.println(primeiraSerie.getNome());
        System.out.println("Duração para maratonar: " + primeiraSerie.getDuracaoMinutos());

        Filme segundoFilme = new Filme();
        segundoFilme.setNome("Avatar");
        segundoFilme.setAnoLancamento(2024);
        segundoFilme.setDuracaoMinutos(200);

        primeiroFilme.exibirTela();
        primeiroFilme.avaliaFilme(7.0);
        primeiroFilme.avaliaFilme(8.0);
        primeiroFilme.avaliaFilme(50.0);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(primeiroFilme);
        calculadora.inclui(segundoFilme);
        calculadora.inclui(primeiraSerie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(primeiroFilme);
        filtro.filtra(segundoFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(10);
        episodio.setSerie(primeiraSerie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(primeiroFilme);
        listaFilmes.add(segundoFilme);
        System.out.println("Retorne o tamanhao da lista: " + listaFilmes.size());
        System.out.println("Retorne o primeiro elemento da lista: " + listaFilmes.get(0).getNome());
        System.out.println(listaFilmes);

        //**************** Exercicio Alura ****************

//        Pesssoa pessoa1 = new Pesssoa();
//        pessoa1.setNome("Carlos");
//        pessoa1.setIdade(45);
//
//        Pesssoa pessoa2 = new Pesssoa();
//        pessoa2.setNome("Maria");
//        pessoa2.setIdade(21);
//
//        ArrayList<Pesssoa> pessoa = new ArrayList<>();
//        pessoa.add(pessoa1);
//        pessoa.add(pessoa2);
//        System.out.println("Tamanho da lista de pessoas é: " + pessoa.size());
//        System.out.println("Pirmeira pessoa da lista: " + pessoa.get(0).getNome());
//        System.out.println("Todos da lista: " + pessoa);



    }
}