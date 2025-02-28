package stream_api;
// Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

import java.util.Arrays;
import java.util.List;

public class D10AgrupaValoresImpares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosImpares = numeros.stream()
                .filter(num -> num % 2 != 0) // Filtrando números impares
                .filter(num -> num % 3 == 0 || num % 5 == 0) //Filtra múltiplos de 3 ou 5
                .toList(); // COleta o resultado em uma lista.

        System.out.println("Números impares que são múltiplos de 3 ou 5: " + numerosImpares);



    }
}
