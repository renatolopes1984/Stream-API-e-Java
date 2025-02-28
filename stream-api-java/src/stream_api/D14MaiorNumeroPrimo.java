package stream_api;

/*
Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;

public class D14MaiorNumeroPrimo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
                .filter(D14MaiorNumeroPrimo::isPrimo) // Utiliza o método auxiliar isPrimo
                .forEach(System.out::println); // Exibe os números primos no console.


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
