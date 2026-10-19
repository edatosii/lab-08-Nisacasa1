package co.umariana;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Pruebas de los ejercicios de calentamiento.
 * NO MODIFIQUE ESTE ARCHIVO: haga que pasen escribiendo código en Calculadora.java.
 */
class CalculadoraTest {

    Calculadora calc;

    @BeforeEach
    void crearCalculadora() {
        calc = new Calculadora();
    }

    // ---------------- sumar ----------------
    @Test
    @DisplayName("sumar: números positivos")
    void sumarPositivos() {
        assertEquals(5, calc.sumar(2, 3));
        assertEquals(100, calc.sumar(40, 60));
    }

    @Test
    @DisplayName("sumar: con cero y negativos")
    void sumarConCeroYNegativos() {
        assertEquals(7, calc.sumar(7, 0));
        assertEquals(-1, calc.sumar(2, -3));
        assertEquals(-8, calc.sumar(-5, -3));
    }

    // ---------------- restar ----------------
    @Test
    @DisplayName("restar: resultado positivo y negativo")
    void restarBasico() {
        assertEquals(6, calc.restar(10, 4));
        assertEquals(-6, calc.restar(4, 10));
    }

    @Test
    @DisplayName("restar: con cero y negativos")
    void restarConCeroYNegativos() {
        assertEquals(9, calc.restar(9, 0));
        assertEquals(0, calc.restar(5, 5));
        assertEquals(8, calc.restar(5, -3));
    }

    // ---------------- multiplicar ----------------
    @Test
    @DisplayName("multiplicar: números positivos")
    void multiplicarPositivos() {
        assertEquals(12, calc.multiplicar(3, 4));
        assertEquals(1, calc.multiplicar(1, 1));
    }

    @Test
    @DisplayName("multiplicar: por cero y con negativos")
    void multiplicarConCeroYNegativos() {
        assertEquals(0, calc.multiplicar(8, 0));
        assertEquals(-12, calc.multiplicar(3, -4));
        assertEquals(12, calc.multiplicar(-3, -4));
    }

    // ---------------- dividir ----------------
    @Test
    @DisplayName("dividir: división exacta")
    void dividirExacta() {
        assertEquals(5.0, calc.dividir(10, 2), 0.0001);
        assertEquals(-4.0, calc.dividir(-8, 2), 0.0001);
    }

    @Test
    @DisplayName("dividir: conserva los decimales (7 / 2 = 3.5)")
    void dividirConDecimales() {
        assertEquals(3.5, calc.dividir(7, 2), 0.0001);
        assertEquals(0.25, calc.dividir(1, 4), 0.0001);
    }

    @Test
    @DisplayName("dividir: entre cero lanza ArithmeticException")
    void dividirEntreCero() {
        ArithmeticException e = assertThrows(ArithmeticException.class, () -> calc.dividir(5, 0));
        assertEquals("No se puede dividir entre cero", e.getMessage());
    }

    // ---------------- esPar ----------------
    @Test
    @DisplayName("esPar: pares e impares")
    void esParBasico() {
        assertTrue(calc.esPar(4));
        assertFalse(calc.esPar(7));
    }

    @Test
    @DisplayName("esPar: cero y negativos")
    void esParCeroYNegativos() {
        assertTrue(calc.esPar(0));
        assertTrue(calc.esPar(-2));
        assertFalse(calc.esPar(-3));
    }
}
