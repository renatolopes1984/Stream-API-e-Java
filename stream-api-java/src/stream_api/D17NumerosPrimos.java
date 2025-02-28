package stream_api;

/*
Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;

public class D17NumerosPrimos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream()
                .filter(D17NumerosPrimos::isPrimo )
                .toList();

        //Exibe os números primos
        numerosPrimos.forEach(System.out::println);

    }

    //Método auxiliar que aplica a lógica de verificar se um número é primo
    public static boolean isPrimo(int numero){
        if(numero < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if(numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
