package br.com.violencia.conversor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConversorTest {

    private Conversor conversorTest;

    public static final char ESCALA_TEST = 'K';
    public static final double TEMP_KELVIN_TEST = 283.00;

    @BeforeEach
    public void setUp() {
        gerandoConversor();
    }

    @Test
    public void testConverter() {
        quandoEstaConvertendoParaKelvin();
        entaoConverteuTemperatura();
    }

    private void gerandoConversor(){
        this.conversorTest = new Conversor('C', 10);
    }

    private void quandoEstaConvertendoParaKelvin(){
        this.conversorTest.converter('K');
    }

    private void entaoConverteuTemperatura(){
        assertEquals(conversorTest.getTemp().getEscala(), ESCALA_TEST);
        assertEquals(conversorTest.getTemp().getTemperatura(), TEMP_KELVIN_TEST);
    }
}