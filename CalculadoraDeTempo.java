package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal(){
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinuto();
//    }
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoEmMinuto();
//    }

    public void inclui(Titulo titulo){
        System.out.println("\nAdicionando duração em minutos de "+ titulo);
        this.tempoTotal += titulo.getDuracaoEmMinuto();
    }

}
