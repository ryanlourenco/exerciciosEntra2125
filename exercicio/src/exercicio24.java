import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercicio24 {
    public static void main(String[] args) {




        //Questão 24 - Media dos numeros impares da lista
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(4);
        numeros.add(5);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);

        ArrayList<Integer> numerosImpares = new ArrayList<>();
        for(int num : numeros) {
            if (num % 2 != 0) {
                numerosImpares.add(num);
            }
        }
        int soma = 0;
        for (int num : numerosImpares) {
            soma+= num;
        }
        double media = soma / (double) numerosImpares.size();
        System.out.println("Média dos números do ArrayList: " + media );

















    }
}