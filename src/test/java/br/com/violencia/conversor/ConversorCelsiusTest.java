package br.com.violencia.conversor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorCelsiusTest {

    private Conversor conversorTest;

    @BeforeEach
    public void setup(){
        conversorTest = new Conversor('C', 10);
    }

    @Test
    public void testeConvertendoDeCelsiusParaKelvin() {
        conversorTest.converter('K');

        assertEquals(conversorTest.getTemp().getEscala(), 'K');
        assertEquals(conversorTest.getTemp().getTemperatura(), 283.00);
    }

    @Test
    public void testeConvertendoDeCelsiusParaFahrenheit() {
        conversorTest.converter('F');

        assertEquals(conversorTest.getTemp().getEscala(), 'F');
        assertEquals(conversorTest.getTemp().getTemperatura(), 50.00);
    }
}