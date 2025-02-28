package stream_api;

/*Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;

public class D5CalcularMedia {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosMaioresQue5 = numeros.stream() // Cria a lista que vai receber os números maiores que 5
                .filter(numero -> numero > 5) // Filtre na lista de numeros, quais numeros são maiores que 5
                .toList();

       // System.out.println(numerosMaioresQue5);

        double media = numerosMaioresQue5.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0); // Trata erro caso a lista não tenha números maiores que 5, e exibe 0.0 ao invés de uma exceção.

        System.out.println("A média dos numeros: " + numerosMaioresQue5 + " é = " + media);

    }
}
