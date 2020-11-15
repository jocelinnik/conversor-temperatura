package br.com.violencia.conversor;

public class Temperatura{
    private char escala;
    private double temperatura;

    public Temperatura(char escala, double temperatura){
        this.setEscala(escala);
        this.setTemperatura(temperatura);
    }

    public char getEscala(){
        return this.escala;
    }

    public void setEscala(char escala){
        this.escala = escala;
    }

    public double getTemperatura(){
        return this.temperatura;
    }

    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
    }
}
