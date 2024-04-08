package br.com.alura.screenmatch;

import br.com.alura.screenmatch.calculos.Classificavel;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;

public class Principal {
    public static void main(String[] args) {

        Titulo meuFilme = new Titulo();  //Criar Objeto - meuFilme

        meuFilme.setNome("Oppenheimer");
        meuFilme.setAnoDeLancamento(2023);
        meuFilme.setDuracaoEmMinuto(180);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);           //Chamando seus Métodos
        meuFilme.avalia(10);
        System.out.println("Total de Avaliações: "+meuFilme.getTotalDeAvaliacao());   //Instância Objetos
        System.out.println("Médias: "+meuFilme.pegaMedia()+"\n");


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        Filme favorito = new Filme();
        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinuto(135);
        favorito.setIncluidoNoPlano(true);

        Filme outro = new Filme();
        outro.setNome("John Wick");
        outro.setAnoDeLancamento(2014);
        outro.setDuracaoEmMinuto(101);
        outro.setIncluidoNoPlano(true);

        Serie casaDePapel = new Serie();
        casaDePapel.setNome("La Casa de Papel");
        casaDePapel.setAnoDeLancamento(2017);
        casaDePapel.setIncluidoNoPlano(true);
        casaDePapel.setAtiva(true);
        casaDePapel.setTemporadas(5);
        casaDePapel.setEpisodiosPorTemporada(10);
        casaDePapel.setMinutosPorEpisodio(45);

        CalculadoraDeTempo calcular = new CalculadoraDeTempo();
        calcular.inclui(favorito);
        calcular.inclui(outro);
        calcular.inclui(casaDePapel);

        favorito.exibeFichaTecnica();
        outro.exibeFichaTecnica();
        casaDePapel.exibeFichaTecnica();
        System.out.println("Tempo total: " +calcular.getTempoTotal());

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(casaDePapel);
        episodio.setTotalVisualizacoes(300);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(favorito);
        filtro.filtra(outro);
        filtro.filtra(meuFilme);
    }
}
