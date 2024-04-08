package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Titulo implements Classificavel {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinuto;
    private boolean incluidoNoPlano;        // ATRIBUTOS
    private double somaAvaliacoes;
    private int totalDeAvaliacao;

    public void exibeFichaTecnica(){
        System.out.println("\nNome do filme: "+ nome);
        System.out.println("Ano de lançamento: "+anoDeLancamento);     //MÉTODO
        System.out.println("Duração do Filme (Em minutos): "+duracaoEmMinuto);
        System.out.println("Incluído no plano: "+incluidoNoPlano+"\n");
    }
    public void avalia(double nota){
        somaAvaliacoes += nota;        //MÉTODO
        totalDeAvaliacao++;
    }
    public double pegaMedia(){
        return somaAvaliacoes / totalDeAvaliacao;   //MÉTODO
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinuto() {
        return this.duracaoEmMinuto;
    }
    public void setDuracaoEmMinuto(int duracaoEmMinuto) {
        this.duracaoEmMinuto = duracaoEmMinuto;
    }

    public boolean getIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getTotalDeAvaliacao(){
        return this.totalDeAvaliacao;
    }


    @Override
    public int getClassificacao() {
        return (int)pegaMedia() / 2;
    }
}