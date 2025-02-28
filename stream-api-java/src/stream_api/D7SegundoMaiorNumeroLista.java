package stream_api;

/*Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D7SegundoMaiorNumeroLista {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Ordenando em ordem decrescente e pegando o segundo maior número
        List<Integer> numerosOrdenados = numeros.stream()
                .distinct()//Remova duplicatas antes de ordenar, se necessário, para garantir que os elementos sejam únicos.
                .sorted((a, b) -> b - a) // Ordena em ordem decrescente
                .toList();

        // Exibe o segundo maior número
        if (numerosOrdenados.size() > 1) { // Essa linha verifica se o tamanho da lista é maior que 1.
            System.out.println("O segundo maior número é: " + numerosOrdenados.get(1));
        } else {
            System.out.println("Não há um segundo maior número.");
        }






    }
}
