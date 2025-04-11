import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercicio03 {
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }


    }
}