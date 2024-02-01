import br.com.alura.screenmatch.calculos.CalculadoraTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;


public class Main {
    public static void main(String[] args) {
        Filme novoFilme = new Filme();
        novoFilme.setNome("Star Wars");
        novoFilme.setAnoLancamento(2024);

        novoFilme.exibirTela();
        novoFilme.avaliaFilme(7.0);
        novoFilme.avaliaFilme(8.0);
        novoFilme.avaliaFilme(500.0);

        System.out.println(novoFilme.mediaFilme());

        novoFilme.setDuracaoMinutos(20);

        System.out.println((novoFilme.getDuracaoMinutos()));

        Serie casaPapel = new Serie(5, false, 5, 80);
        casaPapel.setNome("Lá casa");
        System.out.println(casaPapel.getNome());
        System.out.println("Duração para maratonar: " + casaPapel.getDuracaoMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Star Wars");
        outroFilme.setAnoLancamento(2024);
        outroFilme.setDuracaoMinutos(200);

        novoFilme.exibirTela();
        novoFilme.avaliaFilme(7.0);
        novoFilme.avaliaFilme(8.0);
        novoFilme.avaliaFilme(50.0);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(novoFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(casaPapel);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(novoFilme);
        filtro.filtra(outroFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(10);
        episodio.setSerie(casaPapel);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}