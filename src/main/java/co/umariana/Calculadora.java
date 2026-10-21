package co.umariana;

/**
 * Ejercicios de calentamiento.
 *
 * INSTRUCCIONES
 * -------------
 * 1. Cada método tiene un "TODO" y lanza UnsupportedOperationException.
 *    Reemplace esa línea por su implementación.
 * 2. NO modifique las pruebas (src/test). Ejecútelas con:   mvn test
 * 3. No cambie los nombres ni los parámetros de los métodos.
 */
public class Calculadora {

    /** @return la suma de a y b */
    public int sumar(int a, int b) {
        return a + b;
    }

    /** @return a menos b */
    public int restar(int a, int b) {
        return a - b;
    }

    /** @return el producto de a y b */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * @return a dividido entre b, con decimales (ej.: 7 / 2 = 3.5)
     * @throws ArithmeticException si b es 0 (mensaje: "No se puede dividir entre cero")
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return (double) a / b;
    }

    /** @return true si el número es par (el 0 es par; los negativos también pueden serlo) */
    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}