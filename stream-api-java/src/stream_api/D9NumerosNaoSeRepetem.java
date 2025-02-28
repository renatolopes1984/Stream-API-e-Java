package stream_api;
//Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.time.chrono.JapaneseEra.values;

public class D9NumerosNaoSeRepetem {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numerosDuplicados = numeros.stream() //Crio a variavel que recebe a lista de números.
                .collect(Collectors.groupingBy(numero -> numero, Collectors.counting()))// groupingBy = agrupa os números pela frequencia
                .values().stream()
                .anyMatch(count -> count > 1);

        System.out.println("Existem números duplicados: " + numerosDuplicados);

    }
}
