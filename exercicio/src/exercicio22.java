import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercicio22 {
    public static void main(String[] args) {




        //Questão 22 - Remover numeros repetidos de um ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(17);
        numeros.add(89);
        numeros.add(55);
        numeros.add(91);
        numeros.add(55);
        numeros.add(17);

        LinkedHashSet<Integer> semDuplicados = new LinkedHashSet<>(numeros);
        numeros.clear();
        numeros.addAll(semDuplicados);

        System.out.println("Nova lista: " + semDuplicados);















    }
}