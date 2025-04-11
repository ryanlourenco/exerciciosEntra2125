import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercicio18 {
    public static void main(String[] args) {




        //Questão 18 - Remover numeros negativos de uma ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(-1);
        numeros.add(-2);
        numeros.add(3);
        numeros.add(-4);
        numeros.add(5);
        numeros.add(6);

        ArrayList<Integer> semNegativos = new ArrayList<>();

        for (int num : numeros) {
            if (num >= 0) {
                semNegativos.add(num);
            }
        }
        System.out.println("Nova lista: " + semNegativos);












    }
}