import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    void testSoma() {
        Calculadora calc = new Calculadora();
        assertEquals(4, calc.soma(2, 2));
    }

    @Test
    void testSubtrai() {
        Calculadora calc = new Calculadora();
        assertEquals(0, calc.diferenca(2, 2));
    }

    @Test
    void testMultiplica() {
        Calculadora calc = new Calculadora();
        assertEquals(9, calc.produto(3, 3));
    }

    @Test
    void testDivide() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.divisao(6, 3));
    }

    @Test
    void testDividePorZero() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> calc.divisao(6, 0));
    }
}
