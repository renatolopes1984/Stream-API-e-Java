package stream_api;

import java.util.Arrays;
import java.util.List;

public class D3NumerosPositivos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -45);

        boolean contemNumerosNegativos = numeros.stream()
                .anyMatch(numero -> numero < 0);
        if(contemNumerosNegativos){
            System.out.println("A lista contém números negativos.");
        } else {
            System.out.println("A lista NÃO contém números negativos.");
        }

        numeros.stream()
                .filter(numero -> numero < 0)
                .forEach(System.out::println);

    }
}
