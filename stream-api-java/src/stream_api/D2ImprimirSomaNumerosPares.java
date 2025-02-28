package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class D2ImprimirSomaNumerosPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //NUMEROS PARES
        List<Integer> numerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0) // Filtra n°s pares
                .toList(); // Coleta os n°s pares em uma lista

        //SOMA DOS PARES
        int somaPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Números pares: ");
        numerosPares.forEach(System.out::println); //imprime n°s pares

        System.out.println("Soma dos números pares: ");
        System.out.println(somaPares);


    }
}
