import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercicio25 {
    public static void main(String[] args) {




        //Questão 25 - Multiplicar todos os numeros da lista por um valor fixo
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(4);
        numeros.add(6);
        numeros.add(8);
        numeros.add(10);
        numeros.add(12);

        int fator = 2;
        for (int i = 0; i < numeros.size(); i++) {
            numeros.set (i, numeros.get(i) * fator);
        }
        System.out.println("Multiplicação dos elementos por 2: " + numeros);

















    }
}