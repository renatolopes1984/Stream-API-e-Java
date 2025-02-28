package stream_api;

/* Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.*/

import java.util.Arrays;
import java.util.List;

public class D11SomaQuadradosDosNumerosDaLista {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosQuadrados = numeros.stream()
                .map(x -> x * x) // Mapeia cada número da stream para o seu quadrado.
                .reduce(0, Integer::sum); //Reduz a stream, somando todos os quadrados. O 0 é o valor inicial, e Integer::sum é uma referência ao método que realiza a soma.

        System.out.println("A soma dos quadrados dos números é: " + somaDosQuadrados);

    }
}
