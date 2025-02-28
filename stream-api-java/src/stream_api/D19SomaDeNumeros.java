package stream_api;

/*
Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5.
Exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;

public class D19SomaDeNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 30, 60);

        //Lista de números divisiveis para imprimir quais são os números.
        List<Integer> numerosDivisiveis = numeros.stream()
                .filter(numero -> numero % 3 == 0 && numero % 5 == 0)
                .toList();

        System.out.println("Os numeros divisíveis por 3 e 5 são: " + numerosDivisiveis);

        // Variavel soma que recebe a lógica que efetiva a soma dos domínios divisiveis.
        int soma = numeros.stream()
                .filter(numero -> numero % 3 == 0 && numero % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("A soma dos números divisíveis por 3 e 5 é: " + soma);




    }
}
