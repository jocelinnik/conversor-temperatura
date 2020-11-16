package br.com.violencia.conversor;

public class Conversor{
    private Temperatura temp;

    public Conversor(char escala, double temperatura){
        this.temp = new Temperatura(escala, temperatura);

        System.out.printf("Temperatura: %.2f *%c\n", this.getTemp().getTemperatura(), this.getTemp().getEscala());
    }

    public Temperatura getTemp(){
        return this.temp;
    }

    /**
     * Kelvin = Celsius + 273
     */
    public void celsiusParaKelvin(){
        double tempCelsius, tempKelvin;

        tempCelsius = this.getTemp().getTemperatura();
        tempKelvin = tempCelsius + 273.0;

        this.getTemp().setEscala('K');
        this.getTemp().setTemperatura(tempKelvin);
        System.out.printf("Temperatura: %.2f *%c\n", this.getTemp().getTemperatura(), this.getTemp().getEscala());
    }

    /**
     * Celsius = Kelvin - 273
     */
    public void kelvinParaCelsius(){
        double tempKelvin, tempCelsius;

        tempKelvin = this.getTemp().getTemperatura();
        tempCelsius = tempKelvin - 273.0;

        this.getTemp().setEscala('C');
        this.getTemp().setTemperatura(tempCelsius);
        System.out.printf("Temperatura: %.2f *%c\n", this.getTemp().getTemperatura(), this.getTemp().getEscala());
    }

    /**
     * Fahrenheit = (1.8 * Celsius) + 32
     */
    public void celsiusParaFahrenheit(){
        double tempCelsius, tempFahrenheit;

        tempCelsius = this.getTemp().getTemperatura();
        tempFahrenheit = (1.8 * tempCelsius) + 32.0;

        this.getTemp().setEscala('F');
        this.getTemp().setTemperatura(tempFahrenheit);
        System.out.printf("Temperatura: %.2f *%c\n", this.getTemp().getTemperatura(), this.getTemp().getEscala());
    }

    /**
     * Celsius = (Fahrenheit - 32) / 1.8
     */
    public void fahrenheitParaCelsius(){
        double tempFahrenheit, tempCelsius;

        tempFahrenheit = this.getTemp().getTemperatura();
        tempCelsius = (tempFahrenheit - 32.0) / 1.8;

        this.getTemp().setEscala('C');
        this.getTemp().setTemperatura(tempCelsius);
        System.out.printf("Temperatura: %.2f *%c\n", this.getTemp().getTemperatura(), this.getTemp().getEscala());
    }

    /**
     * Para converter de Kelvin para Fahrenheit:
     * - Converte de Kelvin para Celsius
     * - Converte de Celsius para Fahrenheit
     */
    public void kelvinParaFahrenheit(){
        this.kelvinParaCelsius();
        this.celsiusParaFahrenheit();
    }

    /**
     * Para converter de Fahrenheit para Kelvin:
     * - Converte de Fahrenheit para Celsius
     * - Converte de Celsius para Kelvin
     */
    public void fahrenheitParaKelvin(){
        this.fahrenheitParaCelsius();
        this.celsiusParaKelvin();
    }

    public void converter(char escalaParaConverter){
        System.out.println("Convertendo...");

        switch(escalaParaConverter){
            case 'C':
                if(this.getTemp().getEscala()=='K') this.kelvinParaCelsius();
                else if(this.getTemp().getEscala()=='F') this.fahrenheitParaCelsius();
                break;
            case 'K':
                if(this.getTemp().getEscala()=='C') this.celsiusParaKelvin();
                else if(this.getTemp().getEscala()=='F') this.fahrenheitParaKelvin();
                break;
            case 'F':
                if(this.getTemp().getEscala()=='C') this.celsiusParaFahrenheit();
                else if(this.getTemp().getEscala()=='K') this.kelvinParaFahrenheit();
                break;
        }
    }
}
