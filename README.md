# Calculadora Trigonométrica em Kotlin


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

## Para realizar os testes da funcionades utilizar o comando 

```
./gradlew test
```