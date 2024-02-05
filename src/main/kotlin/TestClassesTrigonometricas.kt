/**
 * Classe que representa o cálculo do seno de um ângulo em radianos.
 *
 * @property angulo O ângulo em radianos para o qual o seno será calculado.
 */
class Seno(private val angulo: Double) {
    /**
     * Calcula e retorna o seno do ângulo.
     *
     * @return O valor do seno.
     */
    fun resultado(): Double {
        return kotlin.math.sin(angulo)
    }
}


/**
 * Classe que representa o cálculo do cosseno de um ângulo em radianos.
 *
 * @property angulo O ângulo em radianos para o qual o cosseno será calculado.
 */
class Cosseno(private val angulo: Double) {
    /**
     * Calcula e retorna o cosseno do ângulo.
     *
     * @return O valor do cosseno.
     */
    fun resultado(): Double {
        return kotlin.math.cos(angulo)
    }
}


/**
 * Classe que representa o cálculo da tangente de um ângulo em radianos.
 *
 * @property angulo O ângulo em radianos para o qual a tangente será calculada.
 */
class Tangente(private val angulo: Double) {
    /**
     * Calcula e retorna a tangente do ângulo.
     *
     * @return O valor da tangente.
     * @throws ArithmeticException Se a tangente é indefinida para o ângulo fornecido.
     */
    fun resultado(): Double {

        if (angulo == Math.PI / 2.0) {
            throw ArithmeticException("A tangente é indefinida para o ângulo de ${Math.toDegrees(angulo)}°")
        }
        return kotlin.math.tan(angulo)
    }
}