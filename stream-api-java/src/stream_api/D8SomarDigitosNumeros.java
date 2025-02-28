package stream_api;
/*Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;

public class D8SomarDigitosNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double somaNumeros = numeros.stream()
                .reduce(0, Integer::sum); // reduce passa pela lista somando um a um.

        System.out.println("A soma dos digitos é: " + somaNumeros);

        double somaCaracteres = numeros.stream()
                .flatMapToInt(numero -> String.valueOf(numero)
                .chars()
                .map(Character::getNumericValue))
                .sum(); // Somando os digitos da lista

        System.out.println(somaCaracteres);


    }
}
