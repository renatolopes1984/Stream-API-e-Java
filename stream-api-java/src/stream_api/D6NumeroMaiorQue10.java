package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/*Utilize a Stream API para verificar se a lista contém algum número maior que 10
  e exiba o resultado no console.
 */
public class D6NumeroMaiorQue10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Tentando encontrar qualquer número maior que 10 e lançando exceção se não encontrar
        try {
            List<Integer> numerosMaior10 = numeros.stream()
                    .filter(numero -> numero > 10)
                    .toList();
            if(numerosMaior10.isEmpty()){
                throw new NoSuchElementException("Nenhum número maior que 10 foi encontrado.");
            }

            System.out.println("Números maiores que 10: " + numerosMaior10);
        } catch (NoSuchElementException e){
            System.err.println(e.getMessage());
        }

    }
}
