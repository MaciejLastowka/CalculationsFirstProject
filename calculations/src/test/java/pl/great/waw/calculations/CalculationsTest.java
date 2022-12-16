package pl.great.waw.calculations;

import org.junit.jupiter.api.Test;
import pl.great.waw.calculations.exepctions.ProductNoExistException;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {

    @Test
    void add() throws ProductNoExistException {
        Calculations calculations = new Calculations();
        calculations.add(new Product("maslo", BigDecimal.TEN));

        assertEquals("maslo",calculations.get(0).getName());
    }
    @Test
    void getNonExtist() throws ProductNoExistException {
        Calculations calculations = new Calculations();
        calculations.add(new Product("maslo", BigDecimal.TEN));

        assertEquals("maslo",calculations.get(1).getName());
    }
    @Test
    void get() {
    }
}