package stream_api;
/*
Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;

public class D18NumerosIguais {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer primeiroNumero = numeros.get(0);
        List<Integer> numerosIguais = numeros.stream()
                .filter(numero -> numero.equals(primeiroNumero))
                .toList();

        if(numerosIguais.size() != numeros.size()){
            System.out.println("Existem números diferentes na lista: " + numeros);
        } else {
            System.out.println("Todos os números são iguais: " + numerosIguais);
        }

    }
}
