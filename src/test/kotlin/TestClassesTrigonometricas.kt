import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.math.sqrt
import kotlin.test.assertEquals

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

    private val sen45 = sqrt(2.0) / 2
    private val cos45 = sqrt(2.0) / 2
    private val tan45 = 1.0

    private val sen60 = sqrt(3.0) / 2
    private val cos60 = 1.0 / 2.0
    private val tan60 = sqrt(3.0)

    data class AnguloNotavel(val angulo: Double, val seno: Double, val cosseno: Double, val tangente: Double)

    private val angulosNotaveis = listOf (
        AnguloNotavel(30.0, sen30, cos30, tan30),
        AnguloNotavel(45.0, sen45, cos45, tan45),
        AnguloNotavel(60.0, sen60, cos60, tan60)
    )

    /**
     * Testa os cálculos de seno, cosseno e tangente para os ângulos notáveis.
     *
     * Utiliza a lista de ângulos notáveis definida em [angulosNotaveis].
     */
    @Test
    fun testAngulosNotaveis() {
        // Para cada ângulo notável na lista
        angulosNotaveis.forEach { anguloNotavel ->

            val angulo = Math.toRadians(anguloNotavel.angulo)
            // Verifica se o cálculo do seno está correto
            assertEquals(anguloNotavel.seno, Seno(angulo).resultado(), TOLERANCIA)
            // Verifica se o cálculo do cosseno está correto
            assertEquals(anguloNotavel.cosseno, Cosseno(angulo).resultado(), TOLERANCIA)
            // Verifica se o cálculo da tangente está correto
            assertEquals(anguloNotavel.tangente, Tangente(angulo).resultado(), TOLERANCIA)
        }
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
