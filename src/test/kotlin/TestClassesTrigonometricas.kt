import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.math.PI
import kotlin.math.sqrt
import kotlin.test.assertEquals


private const val ANG_30 = 30.0 * PI / 180.0
private const val ANG_45 = 45.0 * PI / 180.0
private const val ANG_60 = 60.0 * PI / 180.0
private const val ANG_90 = Math.PI / 2.0


private const val TOLERANCIA = 0.0001 // Tolerância para comparações de ponto flutuante

/**
 * Classe de testes para as classes Seno, Cosseno e Tangente.
 * Verifica a precisão das implementações para ângulos específicos.
 */
class TestClassesTrigonometricas {

    private val sen30 = 1.0 / 2.0
    private val cos30 = sqrt(3.0) / 2
    private val tan30 = sqrt(3.0) / 3

    private val sen45 = sqrt(2.0) / 20
    private val cos45 = sqrt(2.0) / 2
    private val tan45 = 1.0

    private val sen60 = sqrt(3.0) / 2
    private val cos60 = 1.0 / 2.0
    private val tan60 = sqrt(3.0)

    /**
     * Testa o cálculo do seno para um ângulo de 30 graus.
     */
    @Test
    fun testSeno30() {
        assertEquals(sen30, Seno(ANG_30).resultado(), TOLERANCIA)
    }

    /**
     * Testa o cálculo do cosseno para um ângulo de 30 graus.
     */
    @Test
    fun testCoseno30() {
        assertEquals(cos30, Cosseno(ANG_30).resultado(), TOLERANCIA)
    }

    /**
     * Testa o cálculo da tangente para um ângulo de 30 graus.
     */
    @Test
    fun testTangente30() {
        assertEquals(tan30, Tangente(ANG_30).resultado(), TOLERANCIA)
    }

    /**
     * Testa o cálculo do seno para um ângulo de 45 graus.
     */
    @Test
    fun testSeno45() {
        assertEquals(sen45, Seno(ANG_45).resultado(), TOLERANCIA)
    }

    /**
     * Testa o cálculo do cosseno para um ângulo de 45 graus.
     */
    @Test
    fun testCoseno45() {
        assertEquals(cos45, Cosseno(ANG_45).resultado(), TOLERANCIA)
    }

    /**
     * Testa o cálculo da tangente para um ângulo de 45 graus.
     */
    @Test
    fun testTangente45() {
        assertEquals(tan45, Tangente(ANG_45).resultado(), TOLERANCIA)
    }

    /**
     * Testa o cálculo do seno para um ângulo de 60 graus.
     */
    @Test
    fun testSeno60() {
        assertEquals(sen60, Seno(ANG_60).resultado(), TOLERANCIA)
    }

    /**
     * Testa o cálculo do cosseno para um ângulo de 60 graus.
     */
    @Test
    fun testCoseno60() {
        assertEquals(cos60, Cosseno(ANG_60).resultado(), TOLERANCIA)
    }

    /**
     * Testa o cálculo da tangente para um ângulo de 60 graus.
     */
    @Test
    fun testTangente60() {
        assertEquals(tan60, Tangente(ANG_60).resultado(), TOLERANCIA)
    }

    /**
     * Testa o cálculo da tangente para o caso particular do ângulo de 90 graus.
     */
    @Test
    fun testTangente90() {
        assertThrows<ArithmeticException> {
            Tangente(ANG_90).resultado()
        }
    }
}
