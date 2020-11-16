package br.com.violencia.conversor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorFahrenheitTest {

    private Conversor conversorTest;

    @BeforeEach
    public void setup(){
        conversorTest = new Conversor('F', 32);
    }

    @Test
    public void testeConvertendoDeFahrenheitParaKelvin() {
        conversorTest.converter('K');

        assertEquals(conversorTest.getTemp().getEscala(), 'K');
        assertEquals(conversorTest.getTemp().getTemperatura(), 273.00);
    }

    @Test
    public void testeConvertendoDeFahrenheitParaCelsius() {
        conversorTest.converter('C');

        assertEquals(conversorTest.getTemp().getEscala(), 'C');
        assertEquals(conversorTest.getTemp().getTemperatura(), 0.00);
    }
}
