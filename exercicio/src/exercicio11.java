import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercicio11 {
    public static void main(String[] args) {



        ArrayList<Integer> numeros = new ArrayList<>();

        // Adicionando 10 números à ArrayList
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        // Imprimindo os números da ArrayList
        System.out.println("Números na ArrayList:");
        for (int numero : numeros) {
            System.out.println(numero);
        }







    }
}