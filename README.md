# Calculadora Trigonométrica (Testes Kotlin - JUnit)
### Atividade da disciplina de Engenharia De Software - 2023/2 UFSCar


Simples projeto com objetivo de aprendizagem sobre a utilização de testes unitários usando o framework JUnit.

Os testes visão verificar a correta implentação/execução das classes `Seno`, `Cosseno` e `Tangente` no qual uma função 
da mesma retorna o resultado para um determinado ângulo em radianos passado como argumento.

## Executando os Testes

Para verificar o funcionamento adequadado será feita a comparação utilizando `assertEquals` para os valores dos 
seguintes angulos notáveis:

| Ângulo (graus) | Ângulo (radianos) | Seno | Cosseno | Tangente |
|----------------| ----------------- | ---- | ------- |----------|
| 30°            | π/6               | 0.5  | √3/2    | √3/3     |
| 45°            | π/4               | √2/2 | √2/2    | 1.0      |
| 60°            | π/3               | √3/2 | 0.5     | √3       |

## Exemplo de teste para o para o angulo de 30°

```kotlin
     /**
     * Testa o cálculo do seno para um ângulo de 30 graus.
     */
    @Test
    fun testSeno30() {
        assertEquals(sen30, Seno(ANG_30).resultado(), TOLERANCIA)
    }
```

No exemplo acima, `assertEquals` é uma função de assertiva fornecida pelo framework de teste JUnit. Ela compara dois 
valores e sinaliza um teste como falhado se os valores não forem iguais. Neste contexto, assertEquals é utilizado
para garantir que o resultado calculado para o seno de 30° `Seno(ANG_30).resultado()` seja igual ao valor esperado
seno(π/6), com uma tolerância definida pelo valor de `TOLERANCIA`, que define uma margem de erro aceitável para considerar
os valores como iguais nos testes, no caso dos teste `0.0001`.

Para o ângulo de 90° é utilizado `assertThrows` para verificar se uma excessão será lançada.


```kotlin
    /**
     * Testa o cálculo da tangente para o caso particular do ângulo de 90 graus.
     */
    @Test
    fun testTangente90() {
        
        assertThrows<ArithmeticException> {
            Tangente(ANG_90).resultado()
        }
    }
```

## Atualização
### Melhorias realizadas

Com o intuído de testar a funcionalidade `Actions` ao realizar um push e também de deixar o código mais conciso, os 9 testes do commit 
[fc4be5f...](https://github.com/caique-rocha/Calculadora_Trigonometrica_Exercicio_JUnit/commit/fc4be5f02296fcf0d79c9953363e6c30e4618267#diff-deea627bb51f6859e614c11e39fea79aff1dbb744401f855178094ef13ed18e1)
foram substituído for um loop interando por uma lista de data class `AnguloNotavel`.

```kotlin
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
```

## Os testes podem ser executados manualmente na guia `Actions` ou com o comando:

```
./gradlew test
```