import java.util.ArrayList;
import java.util.LinkedHashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercicio23 {
    public static void main(String[] args) {




        //Questão 23 - Média dos numeros pares da lista
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(4);
        numeros.add(5);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);

        ArrayList<Integer> numerosPares = new ArrayList<>();
        for(int num : numeros) {
            if (num % 2 == 0) {
                numerosPares.add(num);
            }
        }
        int soma = 0;
        for (int num : numerosPares) {
            soma+= num;
        }
        double media = soma / (double) numerosPares.size();
        System.out.println("Média dos números do ArrayList: " + media );
















    }
}