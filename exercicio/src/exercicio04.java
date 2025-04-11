import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercicio04 {
    public static void main(String[] args) {
// exercicio 01
//        int N = 20;
//        for (int i = 1; i <= N; i++) {
//            System.out.println(i);
//        }

        //Questão 02 - Soma de 1 a N
//        int N = 5;
//        int soma = 0;
//        for (int i = 1; i <= N; i++) {
//            soma += i;
//
//        }

        //Questão 03 - Tabuada de um número
//

        //Questão 04 - Numeros pares ate N
        int N = 10;

        ArrayList<Integer> numerosPares = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) ;
            numerosPares.add(i);
        }
        System.out.println("Números pares: " + numerosPares);



    }
}