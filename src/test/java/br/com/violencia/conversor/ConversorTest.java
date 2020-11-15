package br.com.violencia.conversor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTest {

    private Conversor conversorTest = new Conversor('C', 10);

    public static final char ESCALA_TEST = 'K';
    public static final double TEMP_KELVIN_TEST = 10.00;

    @Test
    public void testeConvertendoDeCelsiusParaKelvin() {
        conversorTest.converter('K');

        assertEquals(conversorTest.getTemp().getEscala(), ESCALA_TEST);
        assertEquals(conversorTest.getTemp().getTemperatura(), TEMP_KELVIN_TEST);
    }
}