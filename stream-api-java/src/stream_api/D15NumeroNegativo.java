package stream_api;

/*Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo
  e exiba o resultado no console.
*/

import java.util.Arrays;
import java.util.List;

public class D15NumeroNegativo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        long numeroNegativo = numeros.stream()
                .filter(numero -> numero < 0)
                .count();

        if(numeroNegativo > 0){

        numeros.stream()
                .filter(numero -> numero < 0) // Verificando se existe número negativo na lista
                .forEach(numero -> System.out.println("Números negativos: " + numero));
        } else {
            System.out.println("Não existe número negativo na lista.");
        }


    }
}
