package stream_api;

/*Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico
(por exemplo, entre 5 e 10) e exiba o resultado no console.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class D13FiltrarNumerosEmIntervalo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //List<Integer> numerosFiltrados = numeros.stream()
        numeros.stream()
                .filter(numero -> numero >= 5 && numero <= 10) //definindo o intervalo de 5 a 10
                .forEach(System.out::println);
                //.toList(); // Coleta os resultados filtrados em uma lista

       // System.out.println("Os números dentro do intervalo são: " + numerosFiltrados);

/*
Resolvido de duas formas:
1. Criando uma nova lista com stream denominando como numerosFiltrados que recebe a lista de numeros
    Utilizando o filter() para aplicar a condicional para localizar os números dentro do intervalo
    E toList() que coleta o resultado dos números filtrados.
    Ao final imprimo o
 */

    }
}
