package CalculadoraCombustivel.carro;

public class Carro {

    private double combustivel;
    private double Km;
    private double valor;
    private int qtdDias;


    public Carro() {
        this.combustivel = 0.0;
        this.Km = 0.0;
        this.valor = 6.19;
        this.qtdDias = 0;
    }
    
    public int getQtdDias() {
        return qtdDias;
    }    

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }
    
    public double calcularAutonomiaPorLitro() {
        return combustivel * 10;
    }

    public double getKm() {
        return Km;
    }

    public void setKm(double Km) {
        this.Km = Km;
    }

    public double calcularAutonomiaPorKm(){
        return Km / 10;
    }

    public double calcularValor(){
        return combustivel * 6.19;
    }

    public double trajetoDias(){
        return (Km*2) * qtdDias;
    }

    public double totalGasto(){
        return trajetoDias()/10*6.19;

    }


}
