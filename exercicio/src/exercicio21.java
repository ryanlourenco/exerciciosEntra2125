import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercicio21 {
    public static void main(String[] args) {




        // Criando uma lista com alguns números
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(7);
        numeros.add(1);
        numeros.add(9);
        numeros.add(5);

        // Ordenando a lista em ordem decrescente
        Collections.sort(numeros, Collections.reverseOrder());

        // Imprimindo a lista ordenada
        System.out.println("Lista em ordem decrescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }















    }
}