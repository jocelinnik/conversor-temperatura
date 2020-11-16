package br.com.violencia.conversor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorKelvinTest {

    private Conversor conversorTest;

    @BeforeEach
    public void setup(){
        conversorTest = new Conversor('K', 300);
    }

    @Test
    public void testeConvertendoDeKelvinParaCelsius() {
        conversorTest.converter('C');

        assertEquals(conversorTest.getTemp().getEscala(), 'C');
        assertEquals(conversorTest.getTemp().getTemperatura(), 27.00);
    }

    @Test
    public void testeConvertendoDeKelvinParaFahrenheit() {
        conversorTest.converter('F');

        assertEquals(conversorTest.getTemp().getEscala(), 'F');
        assertEquals(conversorTest.getTemp().getTemperatura(), 80.60);
    }
}
